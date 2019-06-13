package com.wirbarley.assignment.support.util;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.Assert.*;


@SpringBootTest
public class FormatUtilTest {

	@Test
	public void wirbarleyBigDicimalFormat() {
		System.out.println(FormatUtil.wirbarleyBigDicimalFormat(new BigDecimal ("123123.123")));
	}
}