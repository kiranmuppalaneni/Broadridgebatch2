package com.bcore.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println("Main start ");
		try {
			int a = Integer.parseInt(args[0]);// 
			int b = Integer.parseInt(args[1]);
			int i = a / b;
			System.out.println("I = " + i);
		} catch (ArithmeticException ae) {
			System.err.println("Arithmetic exception is caught");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.err.println("Please provide 2 values ");
		} catch (NumberFormatException ae) {
			System.err.println("Please provide 2 integer values");
		} catch (Exception e) {
			System.err.println("Other Exception");
		} finally {
			System.out.println("Compulsory");
		}
		System.out.println("Main End");
	}
}
