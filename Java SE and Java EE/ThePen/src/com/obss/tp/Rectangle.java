package com.obss.tp;

/** Rectangle class that has width and height as integer and color as String.
 * 
 * @author Ozan Doruk YAVUZ
*/
public class Rectangle {
	
	private int width;
	
	private int height;
	
	private String color;
	
	/** Rectangle constructor with width, height and color as parameters.
	 * 
	 * @param width Width of the Rectangle.
	 * @param height Height of the Rectangle.
	 * @param color Color of the Rectangle.
	*/
	public Rectangle(int width, int height, String color) {
		
		this.width = width;
		this.height = height;
		this.color = color;
	
	}
	
	// Setters and getters for width.
	public int getWidth() {
		
		return this.width;
	}
	
	public void setWidth(int width) {
		
		this.width = width;
	}
	
	// Setters and getters for height.
	public int getHeight() {
		
		return this.height;
	}
	
	public void setHeight(int height) {
		
		this.height = height;
	}
	
	// Setters and getters for color.
	public String getColor() {
		
		return this.color;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
}
