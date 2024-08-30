public class Intro_Cube {

	public static void main(String[] args) {
	//Task 1: This line declares a side length as a double
	double face = 20.6;
	//Task 2: This calculates its surface area
	double Surface_Area = 6*((face)*(face));
	//Task 3: This line calculates the volume of the cube
	double volume = face*face*face;
	
	//Task 4: This prints the values as integers in a sentence
	
	System.out.print("The surface area of the cube is " + (int) Surface_Area + " and the volume is " + (int) volume + " with the side length of " + (double)face + ".");
	
	//Task 5: This note makes my code well documented. This is also where the magic happens
	}

}
