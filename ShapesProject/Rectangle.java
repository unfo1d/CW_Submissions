/** 
 * this class allows you to create a rectangle
 */
public class Rectangle {
//data attributes
	//declares length (private)
	private double length;
	//declares width (private)
	private double width;
	
	/**
	 * Returns the number of sides of a rectangle
	 */
	public static int getNumberOfSides()
	{
		//returns number of sides
		return 4;
	}

	/**
	 * Constructor
	 * this makes rectangle so the rest of the methods can use it
	 */
	public Rectangle(double temp1, double temp2)
	{
		length = temp1;
		
		width = temp2;
	}
	
	/**
	* Says the shape of the shape
	*/
	public static String getShape()
	{
		//says shape
		return ("Rectangle");
	}
		
	
	/**
	 * Returns the length given
	 */
	public double getLength()
	{
		//Returns the length
		return length;
	}
	
	
	/**
	 * Returns the width given
	 */
	public double getWidth()
	{
		//returns width
		return width;
	}
	
	
	/**
	 * Calculates and returns the perimeter of the rectangle
	 */
	public double getPerimeter()
	{
		//returns perimeter
		return (2*length)+(2*width);
	}
	
	
	/**
	 * Calculates and returns the area of the rectangle
	 */
	public double getArea()
	{
		//finds area
		return (length*width);
	}	
}
