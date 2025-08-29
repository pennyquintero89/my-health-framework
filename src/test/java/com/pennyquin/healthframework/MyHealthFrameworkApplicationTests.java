package com.pennyquin.healthframework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MyHealthFrameworkApplicationTests {

	@Test
	void contextLoads() {
	}

}
