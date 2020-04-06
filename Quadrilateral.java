/*
 * Tamara Pando 
 * Assignment 4 
 * 
 * Class Quadrilateral extends Shape2D
 * 
 * + Quadrilateral(int,String,String,Color,double,double): ctor
 * + area():double
 * + perimeter():double
 * 
 */


import java.awt.Color;


public class Quadrilateral extends Shape2D{

	// constructor calling superclass ctor 
	public Quadrilateral(int id, String name,  String des, Color c,
			double height, double width) {
		super(id, name, des, c, height, width);
		
	}
	
	// area and perimeter implemented methods from abstract methods from superclass 
	public double area(){
		return this.width*this.height;
	}
	
	public double perimeter(){
		return 2*(width+height);
	}

}

