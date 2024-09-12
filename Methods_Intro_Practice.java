
public class Methods_Intro_Practice {

	public static void main(String[] args) {
	//Task 1.2: Then, call stateName(), stateHairStyle, and stateFavoriteFood().
	//These call the methods that are in the instructions. This prints my name, hair style, and favorite food.
	
	stateName();
	
	stateHairStyle();
	
	stateFavoriteFood();
	
	//This calls the printCircleStats void method
	
	//Task 2.2: Call the method to make sure it works. 
	printCircleStats(5.9);
	
	//Task 3.2: Call it to make sure it works.
	
	printMathStuffs(20,5);

	}
	//Task 1.1: Create a void method called stateName() that prints out your name. Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), and stateFavoriteFood().
	//All of the void methods state my name, eye color, hair style, best friend, and favorite food.
	public static void stateName()
	{
		
		System.out.println("My full name is Riley Cabreros.");
		
		}

	public static void stateEyeColor() {
			
		System.out.println("My eye color is brown.");
	
	}

	public static void stateHairStyle() {
		
		System.out.println("My hair style is a messy fringe.");
	
	}
	
	public static void stateBestFriend() {
		
		System.out.println("My best friend is Payton Kawamura.");
			
	}
	
	public static void stateFavoriteFood() {
		
		System.out.println("My favorite food is pasta.");
		System.out.println("");	
		
	}
	
	public static void printCircleStats(double radius) {
	//Task 2.1: Create a void method printCircleStats() that is passed a double (meant to represent a circle's radius) and calculates then prints out the radius, diameter, circumference, and area of the circle
		
		double diameter = radius * 2.0;
		final double pi = 3.14159;
		double circumference = diameter * pi;
		double area = (radius*radius)*pi;
		
		//This prints out the circumference, area, diameter, and radius of the circle
		
		System.out.println("The cricumference of the circle is " + circumference + " and the area is " + area + " and the diameter is " + diameter + " with a radius of " + radius + ".");
		System.out.println("");	
		
	}
	
	public static void printMathStuffs(int intone, int inttwo) {
		//Task 3.1 Create a void method printMathStuffs() that is passed two ints and prints their sum, difference, product, quotient, and the remainder (using modulus) of the first number modulus the second number.
		
		int sum = intone + inttwo;
		
		int dif = intone - inttwo;
		
		int prod = intone * inttwo;
	
		int quo = intone / inttwo;
		
		int rem = intone % inttwo;
		
		System.out.print("The sum is " + sum + ", the difference is " + dif + ", the product is " + prod + ", "
				+ "the quotient is " + quo + ", and the remainder is " + rem  + ".");
		
		
			
	}
	
	
}
