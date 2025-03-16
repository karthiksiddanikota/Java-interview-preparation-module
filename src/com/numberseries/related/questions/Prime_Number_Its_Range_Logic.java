package com.numberseries.related.questions;

import java.util.*;

public class Prime_Number_Its_Range_Logic {

	public static void main(String... args) {

		var input_number = new Scanner(System.in);
		System.out.println("enter the number for which series and prime numbers to find out");
		var entered_number = input_number.nextInt();

		boolean IsNumberPrime = isPrimeNumber(entered_number);
		if (IsNumberPrime) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

		System.out.println("the prime number present in the range can be found below");

		for (var i = 2; i < entered_number; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isPrimeNumber(int entered_number) {
		if (entered_number == 0 || entered_number == 0)
			return false;
		for (var i = 2; i < entered_number; i++) {
			if (entered_number % i == 0)
				return false;
		}
		return true;
	}

}