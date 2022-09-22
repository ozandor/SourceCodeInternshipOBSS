package com.obss.tp;

/** Pen class that manipulates the color and shows the radius of the Rectangle and Circle objects..
 * 
 * @author Ozan Doruk YAVUZ
*/
public class Pen {
	
	/**
	 * 
	 * @param r Rectangle that wanted to show the area.
	 */
	public void drawRectangle(Rectangle r) {
		
		System.out.println("Area of the rectangle is: "+ ( r.getHeight()* r.getWidth() ) +" unit.");
		
	}
	
	public void drawCircle(Circle c) {
		
		System.out.println("Area of the circle is: "+ ( c.getRadius()*c.getRadius()*Math.PI  ) +" unit.");
	}
	
	public void changeColorRectangle(String color, Rectangle r) {
		
		r.setColor(color);
		
		System.out.println("New color of the rectangle is:"+ r.getColor());
		
	}

	public void changeColorCircle(String color, Circle c) {
		
		c.setColor(color);
		
		System.out.println("New color of the circle is:"+ c.getColor());
		
	}
	
	
}
