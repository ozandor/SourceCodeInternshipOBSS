package com.obss.tp;

/** Circle class that has radius as integer and color as String.
 * 
 * @author Ozan Doruk YAVUZ
*/
public class Circle {
	
	private int radius;
	
	private String color;
	
	/** Circle constructor with radius and color as parameters.
	 * 
	 * @param radius Radius of the Circle.
	 * @param color Color of the Circle.
	*/
	public Circle(int radius, String color) {
		
		this.radius = radius;
		this.color = color;
		
	}
	
	// Setters and getters for radius.
	public int getRadius() {
		
		return this.radius;
	}
	
	public void setRadius(int radius) {
		
		this.radius = radius;
	}
	
	// Setters and getters for color.
	public String getColor() {
		
		return this.color;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
}
