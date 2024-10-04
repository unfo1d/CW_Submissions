/*
 * this class allows you to create a square
 */
public class Square {
//data attributes
	//this declares the side as a double and makes it private
	private double side;

	/**
	 * this returns the number of sides of a square
	 */
	public static int getNumberOfSides()
	{
		//returns the number of sides
		return 4;
	}	
	
	/**
	 * Constructor
	 * this makes square so the rest of the methods can use it
	 */
	public Square(double temp1)
	{
		//constructor
		side = temp1;
	}
	
	
	/**
	 * this says the name of the shape
	 */
	public static String getShape()
	{
		//says shape
		return ("Square");
	}
	

	/**
	 *  this returns the side length given
	 * functionality
	 */
	public double getSide()
	{
		//returns side
		return side;
	}
	
	
	/**
	 * this calculates and returns the perimeter
	 */
	public double getPerimeter() 
	{
		//returns perimeter
		return (4*side);
	}
	
	
	/**
	 * this calculates and returns the area
	 */
	public double getArea()
	{
		//gets area
		return (side*side);
	}
	
}
