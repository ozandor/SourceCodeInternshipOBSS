package com.obss.ar;

import java.util.Scanner;

/** Class to reverse integer array that taken from user.
 * 
 * @author Ozan Doruk YAVUZ
*/
public class ArrayReverser {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter the size of the array:");
		int size = scnr.nextInt();
		
		//Initializes the size of the array.
		int array[] = new int[size];
		
		//Takes the int array from user.
		for(int i = 0; i < array.length; ++i) {
			
			System.out.println("Please enter the "+ (i) +". number in array: ");
			array[i] = scnr.nextInt();
			
		}
		
		//Initializes the size of the reverse array.
		int reverseArray[] = new int[size];
		
		//Temporary index that holds the last index of the reverseArray.
		int tempIndex = size-1;
		
		for(int i = 0; i < array.length; ++i) {
		//Assigns the array's first element to last index and places all elements from last index.
			reverseArray[tempIndex] = array[i];  
			
			--tempIndex;
			
		}
		
		System.out.println("The reverse array:");
		
		for(int i = 0; i<reverseArray.length; ++i) {
			
			System.out.println("reverseArray["+ (i) +"] = "+ reverseArray[i]);
			
		}
		
		System.out.println("\nEnd of the program.");
		
		
		
		
	}

}
