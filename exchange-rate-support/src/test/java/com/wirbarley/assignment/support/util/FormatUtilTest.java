package com.wirbarley.assignment.support.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@Slf4j
@SpringBootTest
public class FormatUtilTest {

	@Test
	public void wirbarleyBigDicimalFormat() {
		log.debug (FormatUtil.wirbarleyBigDicimalFormat(new BigDecimal ("123123.123")));
	}
}