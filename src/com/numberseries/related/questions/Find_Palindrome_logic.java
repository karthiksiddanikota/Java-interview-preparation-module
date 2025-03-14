package com.numberseries.related.questions;

import java.util.*;

public class Find_Palindrome_logic {

	public static void main(String... args) {

		var input_number = new Scanner(System.in);

		System.out.println("enter the number which needs to be checked for palindrome");

		var entered_number = input_number.nextInt();

		System.out.println("user has entered : " + entered_number);

		// storing the entered number into original number
		var original_number = entered_number;

		var reminder = 0;
		var temp_number = 0;

		// implementing the reverse of a number
		while (entered_number > 0) {
			temp_number = entered_number % 10;
			reminder = reminder * 10 + temp_number;
			entered_number = entered_number / 10;
		}
		System.out.println("the reverse of a number is : " + reminder);

		System.out.println(original_number == reminder ? "Number is palindrome" : "Number is not a palindrome");

	}
}
