package com.wirbarley.assignment.web.endpoint.controller;

import com.wirbarley.assignment.support.domain.exchange.CalculationRequestDto;
import com.wirbarley.assignment.web.endpoint.service.ExchangeRateService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ExchangeRateController.class)
public class ExchangeRateControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ExchangeRateController exchangeRateController;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup (exchangeRateController).build ();
	}

	@Test
	public void reqRemittanceAmount() throws Exception {

		final ResultActions actions =
				mvc.perform (post ("/v1/exchange-rate/currency/calculation")
						.contentType (MediaType.APPLICATION_JSON_UTF8)
						.param ("currency", "KRW")
						.param ("price", "100"))
						.andDo (print ());

		actions.andExpect (status ().isOk ());


	}
}