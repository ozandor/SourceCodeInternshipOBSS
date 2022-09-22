package com.obss.gs;

public class Sandwich extends Edibles {
	
	public int size;
	
	public Sandwich(int size, boolean vegan, boolean halal, String name, int id, double price ){
		
		this.size = size;
		
		super.vegan = vegan;
		
		super.halal = halal;
		
		super.name = name;
		
		super.id = id;
		
		super.price = price;
		
	}
	
}
