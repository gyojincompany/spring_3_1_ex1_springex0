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

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	
	
	
	
	
	
}
