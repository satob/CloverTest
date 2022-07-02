package com.example.clovertest;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloverTestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testBasicGrammer() throws FileNotFoundException {
	    CloverTestService service = new CloverTestService();
	    service.testBasicGrammer();
	    service.testJava9Grammer();
	    service.testJava11Grammer();
	    service.testJava16Grammer();
	}

}
