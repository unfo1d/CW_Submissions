/**
 * this class allows you to create a sphere object
 */
public class Sphere {

	//data attributes
		//this creates pi and makes it private
		private final double pi = 3.14159;
		//this creates and sets radius as a double
		private double radius;
		//this says the amount of dimensions
		final int dimensions = 3;	
		
	/**
	 * Constructor
	 * this creates a sphere so the rest of the methods can use it
	 */
	public Sphere(double temp1)
	{
		radius = temp1;
	}
	
	/**
	 * returns the shape name
	 */		
	public static String getShape()
	
	{
		return "Sphere";	
	}
	
	/**
	 * returns the sphere's volume
	 */
	public double getVolume()
	{
		return ((4.0/3.0) * (pi) * (radius * radius * radius)); 
	}
	
	/**
	 * returns the sphere's surface area 
	 */
	public double getSurfaceArea()
	{
		return ((4.0) * (pi) * (radius * radius)); 
	}	
}
