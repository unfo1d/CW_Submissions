public class Methods_Intro_Practice {

	public static void main(String[] args) {
	
	
	System.out.println(stateName());
	
	System.out.println(stateHairStyle());
	
	System.out.println(stateFavoriteFood());
	
	double radius = 8.0;
	double diameter = calcDiameter(radius);
	double circumference = calcCircumference(diameter);
	double area = calcArea(radius);
	System.out.println("The cricumference of the circle is " + circumference + " and the area is " + area + " and the diameter is " + diameter + " with a radius of " + radius + ".");
	
	int one = 20;
	int two = 10;
	
	System.out.print("The sum is " + findSum(one,two) + ", the difference is " + findDifference(one,two) + ", the product is " + findProduct(one,two) + ", "
			+ "the quotient is " + findQuotient(one,two) + ", and the remainder is " + findRemainder(one,two)  + ".");
	


	}
	
	public static String stateName()
	{
		
		return "My full name is Riley Cabreros.";
		
		}

	public static String stateEyeColor() {
			
		return "My eye color is brown.";
	
	}

	public static String stateHairStyle() {
		
		return "My hair style is a messy fringe.";
	
	}
	
	public static String stateBestFriend() {
		
		return "My best friend is Payton Kawamura.";
			
	}
	
	public static String stateFavoriteFood() {
		
		return "My favorite food is pasta.";
		
	}
	
	public static double calcDiameter(double radius) {
	//Task 2.1: Create a void method printCircleStats() that is passed a double (meant to represent a circle's radius) and calculates then prints out the radius, diameter, circumference, and area of the circle
		
		double diameter = radius * 2.0;
		return diameter;
	
	}
	
	public static double calcCircumference(double diameter) {
		final double pi = 3.14159;
		double circumference = diameter * pi;
		return circumference;
	}
	
	public static double calcArea(double radius) {
		final double pi = 3.14159;
		double area = (radius*radius)*pi;
		return area;
		
	}
	
	
	public static int findSum(int intone, int inttwo) {
		
		int sum = intone + inttwo;
		return sum;
				
	}
	public static int findDifference(int intone, int inttwo) {
		
		int dif = intone - inttwo;
		return dif;
				
	}
	
	public static int findProduct(int intone, int inttwo) {
		
		int prod = intone * inttwo;
		return prod;
				
	}
	
	public static int findQuotient(int intone, int inttwo) {
		
		int quo = intone / inttwo;
		return quo;
	}
	
	public static int findRemainder(int intone, int inttwo) {
		
		int rem = intone % inttwo;
		return rem;
	}
	
}



