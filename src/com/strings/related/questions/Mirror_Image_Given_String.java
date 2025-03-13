package com.strings.related.questions;

import java.util.*;

public class Mirror_Image_Given_String {

	public static void main(String... args) {
		
		var input_string = new Scanner(System.in);
		System.out.println("enter the string which needs to be mirrored");
		var entered_string = input_string.nextLine();
		System.out.println("\nuser has entered : "+entered_string);
		
		//implementing the mirror image
		
		String[] mirror_image =  entered_string.split(" ");
		System.out.println();
		for(var i=mirror_image.length-1;i>=0;i--) {
			System.out.print(mirror_image[i]+" ");
		}
		
	}
}
