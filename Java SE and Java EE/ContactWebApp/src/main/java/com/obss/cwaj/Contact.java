package com.obss.cwaj;

public class Contact {

	private static int idFollower = 0;
	
	private int id;
	private String name;
	private long tel_number;
	
	public Contact(String name, long tel_number) {
		
		this.id = idFollower;
		
		this.name = name;
		
		this.tel_number = tel_number;
		
		++idFollower;
		
	}
	
	public int getID() {
		return this.id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getTelNum() {
		return this.tel_number;
	}
	public void setTelNum(long tel_number) {
		this.tel_number = tel_number;
	}
	
	
	@Override
	public String toString() {
			
		return "Contact Info: (id="+id+" / Name:"+name+" / Tel No:"+tel_number;
		
	}


}
