package com.arrays.related.questions;

import java.util.*;

public class Merge_Two_Arrays_Logic {
	public static void main(String... args) {

		System.out.println("enter the size of an array 1");
		var input_number = new Scanner(System.in);
		var array_size_1 = input_number.nextInt();

		int[] Number_Array_1 = new int[array_size_1];
		System.out.println("enter the size of an array 2");
		var array_size_2 = input_number.nextInt();

		// inserting the random numbers into the array
		for (int i = 0; i < array_size_1; i++) {

			Number_Array_1[i] = (int) (Math.random() * 100);
		}

		System.out.println("Numbers present in the array 1 can be found below");
		// printing the numbers as inserted for array_1
		for (var nums : Number_Array_1) {
			System.out.print(nums + " ");
		}

		int[] Number_Array_2 = new int[array_size_2];

		for (int i = 0; i < array_size_2; i++) {

			Number_Array_2[i] = (int) (Math.random() * 100);
		}

		System.out.println("\nNumbers present in the array 2 can be found below");

		for (var nums : Number_Array_2) {
			System.out.print(nums + " ");
		}

		int[] merged_array = new int[array_size_1 + array_size_2];

		for (var i = 0; i < merged_array.length - array_size_2; i++) {
			merged_array[i] = Number_Array_1[i];
		}

		for (var i = 0; i < array_size_2; i++) {
			merged_array[array_size_1+i] = Number_Array_2[i];
		}

		System.out.println("\nNumbers present in the merged array can be found below");

		for (var nums : merged_array) {
			System.out.print(nums + " ");
		}

	}
}