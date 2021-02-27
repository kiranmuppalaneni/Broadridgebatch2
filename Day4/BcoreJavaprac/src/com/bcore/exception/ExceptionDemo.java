package com.bcore.exception;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Main start ");
		ExceptionDemo ed = new ExceptionDemo();   // NullPointerException
		ed.method1();
		System.out.println("Main End");
	}

	public void method1() {
		System.out.println("Method1 start ");
		method2();
		System.out.println("Method1 End");
	}
	
	public void method2() {
		System.out.println("Method2 start ");
		int i = 10/0;           // ArthimeticException
		System.out.println("Method2 End");
	}
}
