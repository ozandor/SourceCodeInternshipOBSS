package com.obss.gs;

public class MainDriver {
	
	public static void main(String[] args) {
		
		ShoppingBasket<Product> basket1 = new ShoppingBasket<Product>();
		
		Phone p1 = new Phone("Cphone",428,926,2022,"Cphone 12",0101,9099.90);
		
		Television t1 = new Television(3840, 100, 200, 2017, "BesTV", 1103, 2000.0);
		
		Shoes s1 = new Shoes("Blue", 41,"Abibas Fly",2321,450.99);
		
		Sandwich sand1 = new Sandwich(20,true,false,"HarHam",3941,19.9);
		
		
		basket1.addToBasket(p1);
		
		basket1.addToBasket(s1);
		
		basket1.addToBasket(t1);
		
		basket1.addToBasket(sand1);
		
		basket1.showBasket();
		
		basket1.removeFromBasket(p1);
		
		basket1.showBasket();
		
		basket1.cleanBasket();
		
		basket1.showBasket();
		
		basket1.addOnlyElectronics(p1);
		
		basket1.showBasket();
		
		basket1.addOnlyElectronics(sand1);
		
		basket1.showBasket();
		
	}

}
