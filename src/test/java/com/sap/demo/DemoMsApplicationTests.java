package com.sap.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySources;

@SpringBootTest
class DemoMsApplicationTests {

	@Test
	@Execution(ExecutionMode.CONCURRENT)
	void method1() throws Exception{
		Thread.sleep(5000);
		System.out.println("-----1");
	}
	@Test
	@Execution(ExecutionMode.CONCURRENT)
	void method2() throws Exception{
		Thread.sleep(5000);
		System.out.println("-----2");
	}
	@Test
	@Execution(ExecutionMode.CONCURRENT)
	void method3() throws Exception{
		Thread.sleep(5000);
		System.out.println("-----3");
	}
}
