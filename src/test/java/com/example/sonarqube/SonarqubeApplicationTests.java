package com.example.sonarqube;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class SonarqubeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void mainMethodShouldRunWithoutErrors() {
		SonarqubeApplication.main(new String[]{});
	//	assertDoesNotThrow(() -> SonarqubeApplication.main(new String[]{}),
	//			"Application should start without throwing exceptions");
	}
}
