public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doesSomething('o');
	}
	/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   	 * the following question: what does this method do?
	 * 
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * The str is an attribute inside the class
		 * 
		 * 
		 * 
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * It's an out of bounds error, it will go out of bounds if the char doesn't exist inside the word, trying to check for a char that doesn't actually exist
		 * 
		 * 
		 */
		for (int i = 0; i <= l - 1; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * this checks if the character at index i is the same as the passed char. It returns if it does
			 * 
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * It returns -1 to show it doesn't exist
		 * 
		 */
		return -1;
		
	}
}
