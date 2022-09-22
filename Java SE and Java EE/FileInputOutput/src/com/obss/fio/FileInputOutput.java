package com.obss.fio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
	
	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// Reading from file.
		try {
			
			fis = new FileInputStream("C:\\Users\\DoruQ\\Desktop\\teest\\test1.txt");
			
			int i;

			while( (i=fis.read()) != -1 ){    
				
				System.out.print((char)i);    
	        
			}  
			
			fis.close();
		
		}catch(IOException e) {
			System.out.print("Exception:"+ e);
		}catch(Exception e) {
			System.out.print("Exception:"+ e);
		}finally {
			
			try {
				
				if(fis != null) {
					fis.close();
				}
				
				if(fos != null) {
					fos.close();
				}
				
			}catch(IOException e) {
				System.out.print("Exception:"+ e);
			}catch(Exception e) {
				System.out.print("Exception:"+ e);
			}
			
		}
		
		
		// Writing to file.		
		try {
			
			fos = new FileOutputStream("C:\\Users\\DoruQ\\Desktop\\teest\\test1.txt");
			
			String message = "Message To Write";
			for(int i = 0; i<message.length(); ++i) {
				
				fos.write( message.charAt(i) );
				fos.flush();
			}
			
			fos.close();
		
		}catch(IOException e) {
			System.out.print("Exception:"+ e);
		}catch(Exception e) {
			System.out.print("Exception:"+ e);
		}finally {
			
			try {
				
				if(fos != null) {
					fos.close();
				}
				
			}catch(IOException e) {
				System.out.print("Exception:"+ e);
			}catch(Exception e) {
				System.out.print("Exception:"+ e);
			}
			
		}
		
		
	}

}
