package com.numbers.sorting.related.questions;

import java.util.*;

public class Sorting_Using_Streams {

	public static void main(String[] args) {
		System.out.println("enter the size of an array");
		var input_number = new Scanner(System.in);
		var array_size = input_number.nextInt();

		int[] Number_Array = new int[array_size];

		// inserting the random numbers into the array
		for (int i = 0; i < array_size; i++) {

			Number_Array[i] = (int) (Math.random() * 100);
		}

		// printing the numbers as inserted

		System.out.println("Random numbers inserted into the array can be found below");
		for (var nums : Number_Array) {
			System.out.print(nums + " ");
		}
		
		//implementing the logic through streams
		int[] sorted_array = Arrays.stream(Number_Array).sorted().toArray();
		
		System.out.println("\nthe sorted numbers can be found below");
		
		for (var nums : sorted_array) {
			System.out.print(nums + " ");
		}
		
	}
}
