public class Main {
	public static void main(String[] args) {
		
		//this creates three rectangle objects using the rectangle class
		Rectangle rectangleOne = new Rectangle(5.0 , 6.0);
		Rectangle rectangleTwo = new Rectangle(3.0 , 2.0);
		Rectangle rectangleThree = new Rectangle(4.0 , 7.0);
		
		 
		//this creates three squares using the square class 
		Square squareOne = new Square(7.0);
		Square squareTwo = new Square(5.0);
		Square squareThree = new Square(10.0);
		
		//this creates three cubes using the cube class
		Cube cubeOne = new Cube(3.0);
		Cube cubeTwo = new Cube(5.0);
		Cube cubeThree = new Cube(8.0);
		
		//this creates 3 spheres using the sphere class
		Sphere sphereOne = new Sphere(8.0);
		Sphere sphereTwo = new Sphere(100.0);
		Sphere sphereThree = new Sphere(23.0);
		
		//this creates 3 dodecahedrons using the dodecahedron class
		Dodecahedron dodecahedronOne = new Dodecahedron(3.0);
		Dodecahedron dodecahedronTwo = new Dodecahedron(17.0);
		Dodecahedron dodecahedronThree = new Dodecahedron(11.0);
				
		
		//this prints rectangle stats
		System.out.println("The shape is a " + rectangleOne.getShape());
		System.out.println("This shape has " + rectangleOne.getNumberOfSides() + " sides");
		System.out.println("The length is " + rectangleOne.getLength());
		System.out.println("The width is " + rectangleOne.getWidth());
		System.out.println("The perimeter is " + rectangleOne.getPerimeter());
		System.out.println("The area is " + rectangleOne.getArea());
		//Space
		System.out.println("");
		
		System.out.println("The shape is a " + rectangleTwo.getShape());
		System.out.println("This shape has " + rectangleTwo.getNumberOfSides() + " sides");
		System.out.println("The length is " + rectangleTwo.getLength());
		System.out.println("The width is " + rectangleTwo.getWidth());
		System.out.println("The perimeter is " + rectangleTwo.getPerimeter());
		System.out.println("The area is " + rectangleTwo.getArea());
		//Space
		System.out.println("");
		
		System.out.println("The shape is a " + rectangleThree.getShape());
		System.out.println("This shape has " + rectangleThree.getNumberOfSides() + " sides");
		System.out.println("The length is " + rectangleThree.getLength());
		System.out.println("The width is " + rectangleThree.getWidth());
		System.out.println("The perimeter is " + rectangleThree.getPerimeter());
		System.out.println("The area is " + rectangleThree.getArea());
		//Space
		System.out.println("");
		
		//this prints out square stats
		System.out.println("The shape is a " + squareOne.getShape());
		System.out.println("The shape has " + squareOne.getNumberOfSides() + " sides");
		System.out.println("The side length is " + squareOne.getSide());
		System.out.println("The perimeter is " + squareOne.getPerimeter());
		System.out.println("The area is " + squareOne.getArea());
		//Space
		System.out.println("");
		
		System.out.println("This shape is a " + squareTwo.getShape());
		System.out.println("This shape has " + squareTwo.getNumberOfSides() + " sides");
		System.out.println("The side length is " + squareTwo.getSide());
		System.out.println("The perimeter is " + squareTwo.getPerimeter());
		System.out.println("The area is " + squareTwo.getArea());
		//Space
		System.out.println("");
	
		System.out.println("This shape is " + squareThree.getShape());
		System.out.println("This shape has " + squareThree.getNumberOfSides() + " sides");
		System.out.println("The side length is " + squareThree.getSide());
		System.out.println("The perimeter is " + squareThree.getPerimeter());
		System.out.println("The area is " + squareThree.getArea());
		//Space
		System.out.println("");
		
		//this prints out cube stats
		System.out.println("This is a " + cubeOne.getShape());
		System.out.println("This shape has " + cubeOne.getNumberOfFaces() + " faces");
		System.out.println("The surface area is " + cubeOne.getSurfaceArea());
		System.out.println("The volume is " + cubeOne.getVolume());
		//Space
		System.out.println("");
		
		System.out.println("This is a " + cubeTwo.getShape());
		System.out.println("This shape has " + cubeTwo.getNumberOfFaces() + " faces");
		System.out.println("The surface area is " + cubeTwo.getSurfaceArea());
		System.out.println("The volume is " + cubeTwo.getVolume());
		//Space
		System.out.println("");
		
		System.out.println("This is a " + cubeThree.getShape());
		System.out.println("This shape has " + cubeThree.getNumberOfFaces() + " faces");
		System.out.println("The surface area is " + cubeThree.getSurfaceArea());
		System.out.println("The volume is " + cubeThree.getVolume());
		//Space
		System.out.println("");
		
		//this prints out sphere stats
		System.out.println("This is a " + sphereOne.getShape());
		System.out.println("The volume is " + sphereOne.getVolume());
		System.out.println("The surface area is " + sphereOne.getSurfaceArea());
		//Space
		System.out.println("");
		
		//this prints out sphere stats
		System.out.println("This is a " + sphereTwo.getShape());
		System.out.println("The volume is " + sphereTwo.getVolume());
		System.out.println("The surface area is " + sphereTwo.getSurfaceArea());
		//Space
		System.out.println("");
		
		//this prints out sphere stats
		System.out.println("This is a " + sphereThree.getShape());
		System.out.println("The volume is " + sphereThree.getVolume());
		System.out.println("The surface area is " + sphereThree.getSurfaceArea());
		//Space
		System.out.println("");
		
		//this prints out dodecahedron stats
		System.out.println("This is a " + dodecahedronOne.getShape());
		System.out.println("This shape has " + dodecahedronOne.getNumberOfFaces() + " faces");
		System.out.println("The volume is " + dodecahedronOne.getVolume());
		System.out.println("The surface area is " + dodecahedronOne.getSurfaceArea());
		//Space
		System.out.println("");
	
		System.out.println("This is a " + dodecahedronTwo.getShape());
		System.out.println("This shape has " + dodecahedronTwo.getNumberOfFaces() + " faces");
		System.out.println("The volume is " + dodecahedronTwo.getVolume());
		System.out.println("The surface area is " + dodecahedronTwo.getSurfaceArea());
		//Space
		System.out.println("");
		
		System.out.println("This is a " + dodecahedronThree.getShape());
		System.out.println("This shape has " + dodecahedronThree.getNumberOfFaces() + " faces");
		System.out.println("The volume is " + dodecahedronThree.getVolume());
		System.out.println("The surface area is " + dodecahedronThree.getSurfaceArea());
	}

}
