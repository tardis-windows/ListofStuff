/*
 * Tamara Pando 
 * Assignment 4 
 * 
 * Abstract class Shape
 * - int Id (f)
 * - String name (f)
 * - String description (f)
 * - Color color
 * -------------------
 * + Shape(int,String,String,Color) constructor
 * + area(): double abstract
 * + perimeter(): double abstract
 * + toString(): String
 * + getId(): int
 * + getName(): String
 * + getColor(): String
 */

import java.awt.Color;


public abstract class Shape implements Comparable<Object>{
	private final int id;
	private final String name;
	private final String description;
	private Color color;
	
	// constructor
	public Shape(int id,String name,String des,Color c){
		this.id = id;
		this.name = name;
		this.description = des;
		this.color = c;
	}
	
	// getters for private variables
	public int getId() {return id;}
	public Color getColor() {return color;}
	public String getName() {return name;}
	public String getDescription() {return description;}
	
	// toString method for shape 
	@Override
	public String toString(){
		String s =  this.id+" "+this.name+" "+this.description+" ";
		
		if( this.color ==  Color.BLACK)
            s+="Black";
		else if(this.color ==  Color.BLUE)
        	s+="Blue";
		else if(this.color ==  Color.GREEN)
        	s+="Green";
		else if(this.color ==  Color.RED)
        	s+="Red";
        else if(this.color ==  Color.WHITE)
        	s+="White";
		
		return s;
    }
	
	// abstract methods to be implemented somewhere else
	public abstract double perimeter();
	public abstract double area();
	
		
	
}

