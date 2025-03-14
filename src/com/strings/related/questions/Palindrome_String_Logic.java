package com.strings.related.questions;

import java.util.*;

public class Palindrome_String_Logic {

	public static void main(String... args) {

		var input_string = new Scanner(System.in);
		System.out.println("enter the string which needs to be verified for palindrome");
		var entered_string = input_string.nextLine();
		System.out.println("user has entered : " + entered_string);
		String[] reverse_string = entered_string.split("");
		var original_string = entered_string;
		var reversed_string = "";

		for (var i = reverse_string.length - 1; i >= 0; i--) {
			reversed_string += reverse_string[i];
		}

		System.out.println("\nreversed string is " + reversed_string);

		System.out.println(original_string.contentEquals(reversed_string) ? "\nEntered string is palindrome"
				: "\nEntered string is not palindrome");

		input_string.close();
		System.out.println("\ncompleted the execution");
	}
}
