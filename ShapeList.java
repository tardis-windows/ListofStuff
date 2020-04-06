/*
 * Tamara Pando 
 * Assignment 4
 * 
 * ShapeList Class 
 * 
 * TreeSet<Shape> setShapes
 * -----
 * +ShapeLis():constructor
 * +add(Shape):boolean
 * +get2DShapes():TreeSet<Shape2D>
 * +get3DShapes():TreeSet<Shape3D>
 * +printFormatted():void
 * +getSize():int
 */

import java.awt.Color;
import java.util.*;


public class ShapeList {
	
	TreeSet<Shape> setShapes;
	
	// required: ShapeList constructor
	public ShapeList(){
		setShapes = new TreeSet<Shape>();
	}
	
	// required: used to add items to the list without repetition. Make use of exception 
	public boolean add(Shape s) throws Exception{
		if(setShapes.contains(s)){
			throw new Exception("Duplicate Object");
		}
		else{
			setShapes.add(s);
			return true;
		}
		
	}
	
	// required: Returns list of Shape2D
	public TreeSet<Shape2D> get2DShapes(){
		Iterator<Shape> it =   setShapes.iterator();
		TreeSet<Shape2D> temp = new TreeSet<Shape2D>();
		Shape current;
		while(it.hasNext() ) {
			
			current = (Shape) it.next();
			if(current instanceof Quadrilateral){	// checks instances 
				temp.add( (Shape2D) current);
			}

		}
		return temp;
	}
	
	// required: same thing 
	public TreeSet<Shape3D> get3DShapes(){
		Iterator<Shape> it =   setShapes.iterator();
		TreeSet<Shape3D> temp = new TreeSet<Shape3D>();
		Shape current;
		while(it.hasNext() ) {
			
			current = (Shape) it.next();
			if(current instanceof Quadrilateral3D){
				temp.add( (Shape3D) current);
			}

		}
		return temp;
	}
	
	// required: prints table
	public void printFormatted(){
		System.out.println("+------+------------+-------+-----------------------+-------------------+");
		System.out.println("| ID   | Name       | Color | Dimensions            | Description       |");
		System.out.println("+------+------------+-------+-----------------------+-------------------+");
		Iterator<Shape> it =   setShapes.iterator();
		while(it.hasNext() ) {
			Shape current;
			
			
			
			current = (Shape) it.next();
			String c=null ;
			if( current.getColor() ==  Color.BLACK)
	            c="Black";
			else if(current.getColor() ==  Color.BLUE)
				c="Blue";
			else if(current.getColor() ==  Color.GREEN)
	        	c="Green";
			else if(current.getColor() ==  Color.RED)
	        	c="Red";
	        else if(current.getColor() ==  Color.WHITE)
	        	c="White";
			if(current instanceof Quadrilateral){
				Shape2D s = (Shape2D)current;
				
				String format = "| %1$-5d| %2$-11s| %3$-6s| %4$-3.2f:%5$-16.2f| %6$-10s|\n";
				System.out.printf(format,current.getId(),current.getName(), c,s.height,s.width,s.getDescription());
			}
			if(current instanceof Quadrilateral3D){
				Shape3D s = (Shape3D)current;
				String format2 = "| %1$-5d| %2$-11s| %3$-6s| %4$-3.2f:%5$-3.2f:%6$-10.2f| %7$-1s %8$-15s\n";
				System.out.printf(format2,current.getId(),current.getName() ,c,s.height,s.width,s.length,s.getDescription(),"|");
				|
			
			}
			System.out.println("+------+------------+-------+-----------------------+-------------------+");

			

		}
	}
	
	// required: gets size of array 
	public int getSize(){
		return setShapes.size();
	}
	
}


