package com.javagyojin.ex;

public class Calculator {

	public void add(int firstNumber, int secondNumber) {
		System.out.println("add 메소드 실행");
		int result = firstNumber + secondNumber;
		System.out.println(firstNumber + "+" + secondNumber + "=" + result);
	}
	
	public void sub(int firstNumber, int secondNumber) {
		System.out.println("sub 메소드 실행");
		int result = firstNumber - secondNumber;
		System.out.println(firstNumber + "-" + secondNumber + "=" + result);
	}
	
	public void multi(int firstNumber, int secondNumber) {
		System.out.println("multi 메소드 실행");
		int result = firstNumber * secondNumber;
		System.out.println(firstNumber + "*" + secondNumber + "=" + result);
	}
	
	public void div(int firstNumber, int secondNumber) {
		System.out.println("div 메소드 실행");
		int result = firstNumber / secondNumber;
		System.out.println(firstNumber + "/" + secondNumber + "=" + result);
	}
	
	
	
}
