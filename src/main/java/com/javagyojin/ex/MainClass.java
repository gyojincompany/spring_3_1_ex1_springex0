package com.javagyojin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {

		MyCalculator myCalcu = new MyCalculator();
		
		myCalcu.setCalculator(new Calculator());		
		myCalcu.setFirstNumber(10);
		myCalcu.setSecondNumber(5);
		
		myCalcu.addition();
		myCalcu.subtraction();
		myCalcu.multiplication();
		myCalcu.division();
		
//		String configLocation = "classpath:applicationCTX.xml";
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//		ctx.getBean("myCalcu", MyCalculator.class);
//		
//		myCalculator.addition();
//		
//		ctx.close();
//		
	
	}
	
	
}