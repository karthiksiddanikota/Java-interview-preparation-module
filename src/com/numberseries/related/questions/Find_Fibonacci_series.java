package com.numberseries.related.questions;

import java.util.*;

public class Find_Fibonacci_series {

	public static void main(String... args) {

		var input_number = new Scanner(System.in);
		System.out.println("enter the number for which the range of fibonacci is required");
		var entered_number = input_number.nextInt();
		System.out.println("user has entered : " + entered_number);

		// implementing the fibonacci series logic

		var first_number = 0;
		var second_number = 1;
		var sum = 0;
		System.out.println("the fibonacci series can be found below");
		System.out.print(first_number + " " + second_number + " ");

		for (var i = 2; i <= entered_number; i++) {
			sum = first_number + second_number;
			System.out.print(sum + " ");
			first_number = second_number;
			second_number = sum;
		}

	}
}
