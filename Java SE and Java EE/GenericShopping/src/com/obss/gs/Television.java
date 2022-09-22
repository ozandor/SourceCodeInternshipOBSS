package com.obss.gs;

public class Television extends Electronics {
	
	public int pixels;
	
	public int width;
	
	public int length;
	
	public Television(int pixels, int width, int length, int releaseYear,  String name, int id, double price ) {
		
		this.pixels  = pixels;
		
		this.width = width;
		
		this.length = length;
		
		super.releaseYear = releaseYear;
		
		super.name = name;
		
		super.id = id;
		
		super.price = price;
		
	}
	
	
	
}
