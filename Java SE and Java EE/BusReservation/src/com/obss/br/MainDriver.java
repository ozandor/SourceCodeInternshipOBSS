package com.obss.br;

public class MainDriver {
	
	public static void main(String[] args) {
		
		Bus b1 = new Bus(Destination.ISTANBUL,4);
		
		Passenger p1 = new Passenger("first",Destination.ISTANBUL);
		Passenger p2 = new Passenger("ankaraMan",Destination.ANKARA);
		Passenger p3 = new Passenger("second",Destination.ISTANBUL);
		Passenger p4 = new Passenger("third",Destination.ISTANBUL);
		Passenger p5 = new Passenger("fourth",Destination.ISTANBUL);
		Passenger p6 = new Passenger("fifth",Destination.ISTANBUL);
		
		b1.insertPassenger(p1);
		b1.insertPassenger(p2);
		b1.insertPassenger(p3);
		b1.insertPassenger(p4);
		b1.insertPassenger(p5);
		b1.insertPassenger(p6);
		
	}
	
}
