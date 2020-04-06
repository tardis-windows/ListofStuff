/*
 * Tamara Pando 
 * Assignment 4 
 * 
 * Class Quadrilateral3D extends Shape3D
 * 
 * + Quadrilateral3D(int,String,String,Color,double,double,double): ctor
 * + area():double
 * + perimeter():double
 * 
 */

import java.awt.Color;


public class Quadrilateral3D extends Shape3D{

	// constructor calling superclass ctor
	public Quadrilateral3D(int id, String name, String des, Color c,
			double height, double width, double length) {
		super(id, name,  des, c, height, width, length);
		
	}
	
	// area and perimeter implemented methods from abstract methods from superclass 
	public double area(){
		return this.width*this.height;
	}
	
	// area and perimeter implemented methods from abstract methods from superclass 
	public double perimeter(){
		return 2*(this.width*this.height+this.width*this.length+this.length*this.height);
	}
	
}


