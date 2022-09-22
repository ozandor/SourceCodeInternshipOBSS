package com.obss.gs;

//import java.util.List;

import java.util.ArrayList;

public class ShoppingBasket <T extends Product> {
	
	public ArrayList<T> basket;
	
	public ShoppingBasket() {
		
		basket = new ArrayList<T>();
		
	}
	
	public void addToBasket(T product){
		
		this.basket.add(product);
		
	}
	
	public void removeFromBasket(T product) {
		
		this.basket.remove(product);
		
		System.out.println("\nRemoved the "+ product.name +"\n");
		
	}
	
	public void cleanBasket() {
		
		this.basket.clear();
		
		System.out.println("\nBasket is empty now.\n");
		
	}
	
	public void showBasket() {
		
		System.out.println("Basket List:");
		
		for(T prod : basket) {
			
			System.out.println(prod.name);
			
		}
		
		int price = 0;
		
		for(T prod : basket) {
			
			price += prod.price;
			
		}
		
		System.out.println("Current Price: "+ price);
		
	}
	
	public void addOnlyElectronics(T electroProduct) {
		
		if(electroProduct instanceof Electronics) {
			
			this.basket.add(electroProduct);
			
		}else {
			
			System.out.println("\nThis product is not electronic. Can not add.\n");
		
		}
		
		
	}
	
	
	
	
}
