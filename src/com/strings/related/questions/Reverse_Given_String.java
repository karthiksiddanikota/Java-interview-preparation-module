package com.strings.related.questions;

import java.util.*;

public class Reverse_Given_String {

	public static void main(String... args) {

		System.out.println("enter the string which needs to be reversed");
		var input_text = new Scanner(System.in);
		var entered_text = input_text.nextLine();
		System.out.println("\nentered text is : " + entered_text);

		// Implementing the reverse of the string

		String[] reverse_string = entered_text.split("");
		System.out.println("\n***********Reverse Logic is implemented\"***********");	
		System.out.println("\nthe reverse of the string can be found below");
		System.out.println();
		for (int i = reverse_string.length - 1; i >= 0; i--) {
			System.out.print(reverse_string[i]);
		}

	}

}
