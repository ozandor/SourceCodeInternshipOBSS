package com.obss.cn;

import java.util.Scanner;

public class CityNames {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int cityNum;
		
		System.out.println("Please enter the number of the citys:");
		cityNum = scnr.nextInt();
		scnr.nextLine();
		
		String[][] cityArray = new String[cityNum][2];
		
		for(int i=0; i<cityNum; ++i) {
			
			System.out.println("Please enter the name of the "+ (i+1) +". city: " );
			cityArray[i][0] = scnr.nextLine();
			
			System.out.println("Please enter the districts with spaces: " );
			cityArray[i][1] = scnr.nextLine();
			
		}
		for(int i = 0; i < cityArray.length; ++i) {
			
			System.out.println("Name of the City: "+ cityArray[i][0]);
		
			System.out.println("Districts of the City:"+ cityArray[i][1]);
		
		}
		
		
	}

}
