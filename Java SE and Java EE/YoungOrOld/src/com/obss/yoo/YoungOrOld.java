package com.obss.yoo;

import java.util.Scanner;

public class YoungOrOld {

	public static void main(String[] args) {
		
		int age;
		
		System.out.println("Welcome to program YoungOrOld!\nPlease Enter Your Age: ");
		
		Scanner scnr = new Scanner(System.in);
		age = scnr.nextInt();
		
		if(age < 35) {
			
			System.out.println("You are young! Have fun and keep learning.");
			
		}else {
				
			System.out.println("You are old. You had enough experience to enjoy life.");
			
		}
		
		
	}

}
