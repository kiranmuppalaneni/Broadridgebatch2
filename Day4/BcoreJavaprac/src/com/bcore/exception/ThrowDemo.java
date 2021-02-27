package com.bcore.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowDemo {

	public static void main(String[] args) {
// Checked  - try {} catch block , throws
		try {
			FileInputStream fIs = new FileInputStream("abc.txt");
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println(fileNotFoundException);
		}
	}
}
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter Age");
// int age = scanner.nextInt();
// if (age > 18 && age < 30) {
// System.out.println(age);
// }
// else {
// throw new AgeMismatchException();
// }

// String class
// Wrapper classes - Integer,Double,Float- 8
// Math