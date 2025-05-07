package com.example.sonarqube;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarqubeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void mainMethodShouldRunWithoutErrors() {
		assertDoesNotThrow(() -> SonarqubeApplication.main(new String[]{}),
			"Application should start without throwing exceptions");
	}

}
