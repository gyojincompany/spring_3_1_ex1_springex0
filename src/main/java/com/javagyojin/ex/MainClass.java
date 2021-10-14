package com.javagyojin.ex;

public class MainClass {
	
	public static void main(String[] args) {

		MyCalculator calcu = new MyCalculator();
		calcu.setCalcu(new Calculator());
		
		calcu.setFirstNumber(10);
		calcu.setSecondNumber(5);
		
		calcu.addition();
		calcu.subtraction();
		calcu.multiplication();
		calcu.division();
	
	}
	
	
}