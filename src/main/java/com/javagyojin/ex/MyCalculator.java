package com.javagyojin.ex;

public class MyCalculator {

	Calculator calcu;
	private int firstNumber;
	private int secondNumber;
	
	public MyCalculator() {
		
	}

	public void addition() {
		calcu.add(firstNumber, secondNumber);
	}
	
	public void subtraction() {
		calcu.sub(firstNumber, secondNumber);
	}
	
	public void multiplication() {
		calcu.multi(firstNumber, secondNumber);
	}
	
	public void division() {
		calcu.div(firstNumber, secondNumber);
	}

	public void setCalcu(Calculator calcu) {
		this.calcu = calcu;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	
	
	
	
}
