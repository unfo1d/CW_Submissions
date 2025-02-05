
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean checkFor4(int[] arr)
	{
		int[] copyArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			copyArr[i] = arr[i];
		}
		
		boolean checker = false;
		for (int i = 0; i < arr.length; i++) 
		{
			if (copyArr[i] == 4)
			{
				checker = true;
			}
		}
		return checker;
	}

	public static int countFor4(int[] arr)
	{
		int[] copyArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			copyArr[i] = arr[i];
		}
		int counter = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (copyArr[i] == 4)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean checkForFour4(int[] arr)
	{
		int[] copyArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			copyArr[i] = arr[i];
		}
		int counter = 0;
		boolean checker = false;
		for (int i = 0; i < arr.length; i++) 
		{
			if (copyArr[i] == 4)
			{
				counter++;
			}
		}
		if (counter == 4)
		{
			checker = true;
		}
		return checker;
	}
}
