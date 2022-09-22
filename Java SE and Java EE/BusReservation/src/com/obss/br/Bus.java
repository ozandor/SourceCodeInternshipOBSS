package com.obss.br;

public class Bus {
	
	private Destination destBus;
	
	private Passenger[] passArr;
	
	private int currentSize;
	
	public Bus(Destination destBus, int Capacity) {
		
		this.passArr = new Passenger[Capacity];
		
		this.destBus = destBus;
		
		this.currentSize = 0;
		
	}
	
	public void insertPassenger(Passenger pass){
		
		if(this.currentSize == passArr.length) {
			
			System.out.println("Bus is full.");
			
		}else if(pass.getDest() != this.destBus) {
			
			System.out.println("Wrong destination.");
			
		}else if(pass.getDest() == this.destBus) {
			
			passArr[currentSize] = pass;
			
			++currentSize;
			
			System.out.println("Passenger inserted.");
			
		}else {
			
			System.out.println("Unexpected error at the placing of the passenger.");
		}
	
	}

	public void setDest(Destination destBus) {
		
		this.destBus = destBus;
	}
	
	public Destination getDest() {
		
		return this.destBus;
	}
	
}
