//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
	public static void main(String[] args)
	{
    	 //final int COVERAGE = 350;  //paint covers 350 sq ft/gal
	 //declare integers length, width, and height;
	 int length = 15;
	 int width = 11;
	 int height = 8;
    	 //declare double totalSqFt;
    	 double totalSqFt = (width * height * 2) + (length * height * 2) + (width * length);
    	 //declare double paintNeeded;
    	 double paintNeeded = Math.ceil(totalSqFt/350);
    	 //double paintNeeded = 
    	 
    	 System.out.println("The length is " + length + "ft");
    	 System.out.println("The width is " + width + "ft");
    	 System.out.println("The height is " + height + "ft");
    	 System.out.println("You need " + paintNeeded + " gallons of paint");
 
    	 
 
    	 //Compute the total square feet to be painted--think
    	 //about the dimensions of each wall
 
    	 //Compute the amount of paint needed
 
    	 //Print the length, width, and height of the room and the
    	 //number of gallons of paint needed.
	}
}
