package com.obss.br;

public class Passenger {
	
	private String name;
	
	private Destination dest;
	
	public Passenger(String name, Destination dest) {
		
		this.name = name;
		
		this.dest = dest;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return this.name;
	}
	
	
	public void setDest(Destination dest) {
		
		this.dest = dest;
	}
	
	public Destination getDest() {
		
		return this.dest;
	}
	
	
}
