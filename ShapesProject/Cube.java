/**  
 * this class allows you to create a cube
 */
public class Cube {
	//data attributes
	//this declares edge as a double 
	private double edge;

	/**
	 * this returns the number of sides
	 */
	public static int getNumberOfFaces()
	{
		//returns number of faces
		return 6;
	}
	
	/**
	 * Constructor
	 * this makes a cube so the rest of the methods can use it
	 */
	public Cube(double temp1)
	{
		edge = temp1;
	}
	
	/**
	 * returns the shape name
	 */
	public static String getShape()
	{
		//says what shape it is
		return ("Cube");
	}

	/**
	 * returns the side length
	 */
	public double getEdge()
	{
		//returns length
		return edge;
	}
	
	/**
	 * returns get surface area of the shape
	 */
	public double getSurfaceArea() 
	{
		//finds area for one side of the shape
		double face = (edge*edge);
		//finds surface area for entire shape
		return 6*face;
		
	}
	
	/**
	 * returns the volume of the shape
	 */
	public double getVolume()
	{
		//gets volume
		return (edge*edge*edge);
	}
}
