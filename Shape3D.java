/*
 * Tamara Pando 
 * Assignment 4 
 * 
 * Abstract class Shape3D extends Shape2D
 * 
 * + double length (f)
 * ----------
 * + Shape3D(int,String,String,Color,double,double,double) ctor
 * + toString(): String
 * + compareTo(Shape): int
 */


import java.awt.Color;


public abstract class Shape3D extends Shape2D{

	public final double length;
	
	// constructor using calling superclass constructor 
	Shape3D(int id, String name,  String des, Color c,double height,double width,double length) {
		super(id, name,  des, c, height, width);
		this.length = length;
		
	}

	
	// overloaded  to use contains() to check for duplicates
	@Override
	public String toString(){
		return super.toString()+" "+this.height+" "+this.width+" "+this.length;
	}


	@Override
	public int compareTo(Object o) {
		if((Shape)o instanceof Shape3D){
			Shape3D s = (Shape3D)o;
			if(this.getName().equals(s.getName()) && this.height==s.height && this.width == s.width && this.length==s.length){
				return 0;
			}
		}
		return -1;
	}
}

