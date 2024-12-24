public class main {

	public static void main(String[] args) {
		System.out.println(countLetters("humuhumunukunukuapuaa" , 'u'));
		System.out.println(getFactorial(5));
    printIfRepeats("AaBb");
    
		}
	public static int countLetters(String str, char c)
	{
		int counter = 0;
		for(int i = 0; i < str.length(); i++)
	{
		if(str.charAt(i) == c)
		{
			counter++;
		}
			}
			return counter;
			}

	public static int getFactorial(int x)
	{
		for(int i = x-1; i > 0; i--)
		{
			x = x * i;
		}
	return x;
	}
	
}
public static void printIfRepeats(String str)
{
	str = str.toLowerCase();
	String tempKey = str;
	boolean test = false;
	for (int i = 0; i < str.length(); i++)
	{
		tempKey = str;

		if ((test == false));
		{
			tempKey = tempKey.substring(0, i) + " "  + tempKey.substring(i+1, tempKey.length()) ;

			if (tempKey.indexOf(str.charAt(i)) != -1)
			{
				test = true;
			}
		}
	}
	System.out.println(test);
}
}
