package com.obss.gs;

public class Shoes extends Wearable{
	
	public String color;
	
	public Shoes(String color, int sizeNum,  String name, int id, double price ) {
		
		this.color = color;
		
		this.sizeNum = sizeNum;
		
		super.name = name;
		
		super.id = id;
		
		super.price = price;
		
	}

}
