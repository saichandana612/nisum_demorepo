package com.lvg.Jenkins_demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculatortest {
	Calculator c;
	@Before
	public void setup() throws Exception{
		
	}
	@After
	public void tearDown() throws Exception{
	c=null;
	}
	@Test
	public void tearSum() {
		assertEquals(100,c.sum(215,c.square(15)));
	
	}
	
	@Test
	public void tearPower() {
		assertEquals(125,c.sum(5,3));
	
	}
	
	

}
