package com.obss.ot;

import java.util.TreeMap;

import java.util.Scanner;

public class OccurrenceReader {
	
	public static TreeMap<String,Integer> occurrenceMap(){
		
		System.out.println("Give the words with space characters: ");
		Scanner scnr = new Scanner(System.in);
		
		String input = scnr.nextLine();
		
		
		String[] tempArr = input.split(" ");
		
		TreeMap<String,Integer> tMap = new TreeMap<String,Integer>();
		
		for(int i = 0; i < tempArr.length; ++i) {
			
			if( tMap.get(tempArr[i]) != null) {
				
				Integer temp = tMap.get(tempArr[i]);
				
				tMap.put( tempArr[i] , ++temp);
				
			}else {
				
				tMap.put( tempArr[i] , 1);
				
			}
			
		}
		
		scnr.close();
		
		return tMap;
		
		
		
	}

}
