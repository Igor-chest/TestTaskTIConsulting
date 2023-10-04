package com.example.TestTaskTIConsulting;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@SpringBootTest
class TestTaskTiConsultingApplicationTests {

	@Test
	void extractingSymbolsAndTheirQuantities() {
		Assertions.assertEquals("{l=10, a=5, b=3, d=3, c=2}", ""+ StringSplitter.stringSplit("aaabbcddabdcallllllllll"));
	}
}
