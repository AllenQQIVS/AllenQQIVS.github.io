package com.it.mvnbook.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSayHello(){
		HelloWorld hello = new HelloWorld();
		String result = hello.sayHello();
		assertEquals("Hello World",result);
	}
}
