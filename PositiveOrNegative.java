package com.codegnan.operatorexamples;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scanner.nextInt();
		String result = (num>0)?"Positive number":"Negative number";
		System.out.println(result);
		scanner.close();

	}

}
