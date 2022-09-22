package com.obss.gs;

public class Phone extends Electronics{
	
	public String brand;
	
	public int width;
	
	public int length;
	
	public Phone(String brand, int width, int length, int releaseYear,  String name, int id, double price ) {
		
		this.brand = brand;
		
		this.width = width;
		
		this.length = length;
		
		super.releaseYear = releaseYear;
		
		super.name = name;
		
		super.id = id;
		
		super.price = price;
		
	}

}
