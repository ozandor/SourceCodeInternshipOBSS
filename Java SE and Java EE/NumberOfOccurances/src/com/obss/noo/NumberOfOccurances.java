package com.obss.noo;

import java.util.SortedMap;
import java.util.TreeMap;

public class NumberOfOccurances {

	public static void main(String[] args) {
		
		String mainStr = "Test Tset Tst Test Test test Tt Te Te Tset";
		
		String[] strArr = mainStr.split(" ");
		
		TreeMap<String,Integer> tMap = new TreeMap<String,Integer>();
		
		for(int i = 0; i < strArr.length; ++i) {
			
			if( tMap.get(strArr[i]) != null) {
				
				Integer temp = tMap.get(strArr[i]);
				
				tMap.put( strArr[i] , ++temp);
				
			}else {
				
				tMap.put( strArr[i] , 1);
				
			}
			
		}
		
		for(String i : tMap.keySet()) {
			
			System.out.println("Word \""+ i +"\" has " + tMap.get(i) + " occurances.");
			
		}
		
		
		
	}
	
}
