package com.strings.related.questions;

import java.util.*;

public class Count_Vowels_Consonants {
	
	public static void main (String... args) {
		
		var input_text = new Scanner(System.in);
		System.out.println("enter the string details for which count of vowels & consonants is required");
		var entered_text = input_text.nextLine().toLowerCase();
		System.out.println("user has enetred the string details as : "+entered_text);
		
		var vowels_count=0; 
		var consonant_count=0;
		
		String vowels = "aeiou";
		
		for(char ch : entered_text.toCharArray()) {
			if(Character.isLetter(ch)) {
				if(vowels.indexOf(ch)!=-1) {
					vowels_count++;
				}else {
					consonant_count++;
				}
			}
		}
		
		System.out.println("the total vowels present in the string are : "+vowels_count);
		System.out.println("the total consonants present in the string are : "+consonant_count);
	}
}
