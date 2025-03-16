package com.numbers.sorting.related.questions;

import java.util.*;

public class Sorting_Using_Bubble_Sort {

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

		// implementing the Bubble sort logic

		var temp_number = 0;

		for (var i = 0; i < array_size; i++) {
			for (var j = 0; j < array_size - i - 1; j++) {
				if (Number_Array[j] > Number_Array[j + 1]) {
					temp_number = Number_Array[j + 1];
					Number_Array[j + 1] = Number_Array[j];
					Number_Array[j] = temp_number;
				}
			}
		}

		// printing the numbers after sorting
		System.out.println("\nAfter sorting numbers can be found below");
		for (var nums : Number_Array) {
			System.out.print(nums + " ");
		}

	}

}
