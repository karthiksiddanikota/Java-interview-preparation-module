package com.numberseries.related.questions;

import java.util.*;

public class Factorial_Number {

	public static void main(String... args) {
		
		var input_number = new Scanner(System.in);
		System.out.println("enter the number for which the factorial series to be printed and factorial");
		var entered_number = input_number.nextInt();
		System.out.println("user has entered the number : "+entered_number);
		System.out.println("factorial range can be found below");
		for(var i=1;i<=entered_number;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nfactorial of a number can be found below");
		
		var factorial_num=1;
		
		for(var i=1;i<=entered_number;i++) {
			factorial_num *=i;
		}
		System.out.println(factorial_num);
		
		System.out.println("completed the execution");
	}

}
