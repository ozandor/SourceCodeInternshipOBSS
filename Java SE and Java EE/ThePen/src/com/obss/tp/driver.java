package com.obss.tp;

/** Class that tests the Pen, Circle and Rectangle objects.
 * 
 * @author Ozan Doruk YAVUZ
*/
public class driver {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4,8,"Brown");
		
		Circle c1 = new Circle(5,"Blue");
		
		Pen p1 = new Pen();
		
		p1.drawRectangle(r1);
		p1.drawCircle(c1);
		
		p1.changeColorRectangle("Red", r1);
		p1.changeColorCircle("Yellow", c1);
		
	}

}
