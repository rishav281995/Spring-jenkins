package com.javatechie.spring.cloud.stream.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	//commit
	@Test
	void contextLoads() {
		logger.info("Test case executing");
		assertEquals(true, true);
	}

}
