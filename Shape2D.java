/*
 * Tamara Pando 
 * Assignment 4 
 * 
 * Abstract class Shape2D extends Shape 
 * 
 * + double height (f)
 * + double width (f)
 * -------------
 * + getDimensions(): String
 * + compareTo(Shape): int
 */


import java.awt.Color;


public abstract class Shape2D extends Shape{

	public final double height;
	public final double width;
	
	// constructor using calling superclass constructor 
	public Shape2D(int id, String name,  String des, Color c,double height,double width) {
		super(id, name, des, c);
		this.height = height;
		this.width = width;
		
	}

	// overloaded  to use contains() to check for duplicates 
	@Override
	public int compareTo(Object o) {
		if((Shape)o instanceof Shape2D){
			Shape2D s = (Shape2D)o;
			if(this.getName().equals(s.getName()) && this.height==s.height && this.width == s.width){
				return 0;
			}
		}
		return -1;
	}
	
	// overloaded toString
	@Override
	public String toString(){
		return super.toString()+" "+this.height+" "+this.width;
	}
	
	// getDimentions 
	public String getDimentions() {
		
		String s = height + " "+ width; 
		return s; 
	}
}

