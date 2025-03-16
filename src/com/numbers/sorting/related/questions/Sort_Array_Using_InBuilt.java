package com.numbers.sorting.related.questions;

import java.util.*;

public class Sort_Array_Using_InBuilt {

	public static void main(String... args) {

		System.out.println("enter the size of an array");
		var input_number = new Scanner(System.in);
		var array_size = input_number.nextInt();

		int[] Number_Array = new int[array_size];

		// inserting the random numbers into the array
		for (int i = 0; i < array_size; i++) {

			Number_Array[i] = (int) (Math.random() * 100);
		}

		// printing the numbers as inserted

		for (var nums : Number_Array) {
			System.out.print(nums + " ");
		}

		Arrays.sort(Number_Array);

		System.out.println("\nthe inbuilt sorting logic has been applied and below numbers can be found in sorted order");
		for (var nums : Number_Array) {
			System.out.print(nums + " ");
		}

	}
}
