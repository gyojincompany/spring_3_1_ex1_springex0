package com.javagyojin.ex;

public class MyCalculator {

	Calculator calculator;
	private int firstNumber;
	private int secondNumber;
	
	public MyCalculator() {
		
	}

	public void addition() {
		calculator.add(firstNumber, secondNumber);
	}
	
	public void subtraction() {
		calculator.sub(firstNumber, secondNumber);
	}
	
	public void multiplication() {
		calculator.multi(firstNumber, secondNumber);
	}
	
	public void division() {
		calculator.div(firstNumber, secondNumber);
	}

	public void setCalcu(Calculator calcu) {
		this.calculator = calcu;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	
	
	
	
}
