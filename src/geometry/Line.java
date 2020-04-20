package geometry;
import java.lang.Math;

public class Line {
  
	// properties
	private int startX;
	private int endX;
	private int startY;
	private int endY;
	  
	// constructor
	public Line(int startX,int startY,int endX,int endY) {
		  
		if(startX == endX && startY == endY) {
			System.err.println("CAN NOT CREATE A DOT! " + 
					  		   "ENTER A VALID COORDS FOR A LINE.");
		}
		else if(startX > endX) {
			this.startY = startY;
		    this.startX = endX;
		    this.endX   = startX;
		    this.endY   = endY;	       
		}
		else {
		    this.startY = startY;
		    this.startX = startX;
		    this.endX   = endX;
		    this.endY   = endY;
		}
	}
	
	// Length calculator
	public int length() {
		  
		 return (int)Math.round(Math.sqrt(Math.pow(endX - startX, 2) + 
				  	  	 		Math.pow(endY - startY, 2)));
	}
	
	// Getters 
	public String getStart() {
	  	  
		return "X = " + startX + "\nY = " + startY;

	}
	
	public String getEnd() {
		  
		return "X = " + endX + "\nY = " + endY;
	}
	
	// Setters
	public void setStart(int x, int y) {
		  
		startX = x;
		startY = y;
	}
	    
	public void setEnd(int x, int y) {
		  
		endX = x;
		endY = y;
	}
	
	// Output
	public void printCoords() {
		
		if(startX == endX && startY == endY) 
			System.err.println("THE OBJECT IS NOT A LINE!");
		else 
			System.out.printf("[%d:%d]----->[%d:%d]%n",
				  			startX, startY, endX, endY);
	}
	
}