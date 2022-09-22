package com.obss.uw;

import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.IOException;

import java.util.TreeSet;
import java.util.ArrayList;

import java.lang.StringBuffer;

public class MainDriver {
	
	public static void main(String[] args) {
		
		FileReader file = null; 
		
		BufferedReader buf = null;
		
		TreeSet<String> wordSetAlphabetic = new TreeSet<String>();
		
		ArrayList <String> wordOccurance = new ArrayList<String>();
		
		//Reading and writing to console.
		try {
					
			file = new FileReader("C:\\Users\\DoruQ\\Desktop\\teest\\test2.txt");
			
			buf = new BufferedReader(file);
			
			int count = 0;
			
			String temp;
			
			boolean addedToSet = false;
				
			while( (temp = buf.readLine()) != null ) {
				
				String[] tempArr = temp.split(" ");
				
				for(int i = 0; i < tempArr.length; ++i) {
					
					addedToSet = wordSetAlphabetic.add( tempArr[i] );
									
					if(addedToSet) {
						
						wordOccurance.add( tempArr[i] );
						
						++count;
						
					}
					
					addedToSet = false;
					
				}
				
			}
			
			System.out.println("Number of the unique words is: "+ count);
			
			System.out.println("Occurance List:");
			
			for(int i = 0; i < wordOccurance.size(); ++i) {
				
				System.out.println(i+"."+ wordOccurance.get(i));
				
			}
			
			
				
		}catch(IOException e) {
			System.out.print("Exception:"+ e);
		}catch(Exception e) {
			System.out.print("Exception:"+ e);
		}finally {
					
			try {
						
				if(file != null) {
					file.close();
				}
				
				if(buf != null) {
					buf.close();
				}
						
			}catch(IOException e) {
				System.out.print("Exception:"+ e);
			}catch(Exception e) {
				System.out.print("Exception:"+ e);
			}
				
		}
		
		
		
		FileWriter file1 = null;
		
		BufferedWriter buf1 = null;
		
		StringBuffer sb = new StringBuffer("");
		
		// Writing to new file.
		try {
			
			file1 = new FileWriter("C:\\Users\\DoruQ\\Desktop\\teest\\writeAlphabetical.txt");
			
			buf1 = new BufferedWriter(file1);
			
			int order = 1; 
			
			for(String i : wordSetAlphabetic) {
				
				sb.append(order +"."+ i +"\n");
				++order;
			
			}
			
			String writtenStr = sb.toString();
			
			
			buf1.write(writtenStr);
			
			buf1.flush();
			
				
		}catch(IOException e) {
			System.out.print("Exception:"+ e);
		}catch(Exception e) {
			System.out.print("Exception:"+ e);
		}finally {
					
			try {
						
				if(file1 != null) {
					file1.close();
				}
				
				if(buf1 != null) {
					buf1.close();
				}
						
			}catch(IOException e) {
				System.out.print("Exception:"+ e);
			}catch(Exception e) {
				System.out.print("Exception:"+ e);
			}
				
		}
		
	}

}
