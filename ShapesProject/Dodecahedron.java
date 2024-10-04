/**
 * this class allows you to create a dodecahedron
 */
public class Dodecahedron {
	//data attributes
	private double edge;
	
	/**
	 * this returns the number of sides
	 */
	public static int getNumberOfFaces()
	{
		//returns number of faces
		return 12;	
	}
		
	/**
	 * Constructor
	 * this makes a dodecahedron so the rest of the methods can use it
	 */
	public Dodecahedron(double temp1)
	{
		edge = temp1;
	}
	
	/**
	 * returns the shape name
	 */
	public static String getShape()
	{
		//says what shape it is
		return ("Dodecahedron");
	}
	
	/**
	 * returns the volume of the shape
	 */
	public double getVolume()
	{
		//returns volume
		return ((15.0 + 7.0 * Math.sqrt(5.0)) / (4.0)) * (edge*edge*edge);
	}
	
	public double getSurfaceArea()
	{
		//returns surface area
		return (3.0 * Math.sqrt(25.0 + 10.0 * Math.sqrt(5.0)) * (edge * edge));
	}	
}
