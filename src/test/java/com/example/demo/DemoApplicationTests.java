package com.example.demo;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Resource
	private DataSource dataSource;

	@Test
	void contextLoads() throws Exception {
		Assertions.assertNotNull(dataSource.getConnection());
	}
}
