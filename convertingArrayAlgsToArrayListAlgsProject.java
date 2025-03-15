import java.util.ArrayList;

public class convertingArrayAlgsToArrayListAlgsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arrList = new ArrayList <Integer>();
		arrList.add(4);
		arrList.add(5);
		arrList.add(5);
		arrList.add(2);
		arrList.add(1);
	}

  /**
  * 1. Return the smallest number in the ArrayList. 
  */
	public static int returnSmallest(ArrayList <Integer> returnSmall)
	{
		int min = returnSmall.get(0);
		for (int i = 1; i < returnSmall.size() ; i++)
		{
			if (min > returnSmall.get(i))
			{
			min = returnSmall.get(i);
				
			}
			
		}

		return min;
	}
	/**
   * 2. Return the index of the smallest number in the ArrayList. 
	 */
	public static int returnSmallestIndex(ArrayList <Integer> smallestIndex)
	{
		int min = 0;
		for (int i = 1; i < smallestIndex.size() ; i++)
		{
			if (min > smallestIndex.get(i))
			{
			min = smallestIndex.get(i);
				
				
			}
			
		}

		return smallestIndex.indexOf(min);
	}
	/**
   3. Return the average of all numbers in the ArrayList. 
	 */
	public static int returnAverage(ArrayList <Integer> arrayList)
	{
		int average = 0;
		for (int i : arrayList)
		{
			average += i;
		}
		return average/arrayList.size();	
	}
	/**
   4. Return true if all numbers in the ArrayList are even, and return false otherwise.
	 */
	public static boolean evenArray(ArrayList <Integer> arrayList)
	{
		for (int number : arrayList)
			if (number % 2 > 0)
			{
				return false;
			}
		return true;
	}
	/**
	 * 5. If the ArrayList ever has two consecutive 5's, change them to 0's. (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 */
	public static void consecutiveFives(ArrayList <Integer> arrayList)
	{
		for (int i = 0; i < arrayList.size() - 1 ; i++)
		{
			if (arrayList.get(i) == 5 && arrayList.get(i+1) == 5)
			{
			arrayList.set(i, arrayList.set(i+1, 0)- 5);
			}
		}
	}
	/**
	 * 6. Return true if any number shows up three times in a row, and return false otherwise. 
	 */
	public static boolean threeTimesNumber(ArrayList <Integer> arrayList)
	{
		for(int i=0; i < arrayList.size()-2; i++)
		{
			if(arrayList.get(i)== arrayList.get(i+1) && arrayList.get(i+1)== arrayList.get(i+2))
			{
				return true;
			}
		}
		return false;
	}
	/**
	 * 7. Pass an ArrayList of Integers and a value to be searched for. Return how many times that int shows up in the ArrayList. 
   * (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 */
	public static int returnInts(ArrayList <Integer> arrayList, int search)
	
	{
		int count = 0;
		
		for(int i : arrayList)
		{
			if(i == search)
			{
				count++;
			}
		}
		return count;		
	}
	/**
	 * 8. Alter an ArrayList so that is the backwards version of the ArrayList initially passed (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
	 */
	public static void arrayBackwards(ArrayList <Integer> arrayList)
	{
		for(int i = arrayList.size() - 2 ; i >= 0; i--)
		{
			arrayList.add(arrayList.remove(i));
		}
	}
	/**
	 * 9. Shift all elements in an ArrayList to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
	 */
	public static void shiftElementsRight(ArrayList <Integer> arrayList)
	{
		arrayList.add(0, arrayList.remove(arrayList.size() - 1));
	}
	/**
	 * 10. Use either selection sort or insertion sort to sort an ArrayList. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
	 */
	public static void selectionSort(ArrayList <Integer> arrayList)
	{
		{
			for( int i = 0 ; i < arrayList.size() - 1 ; i++)
			{
				int smallest = arrayList.get(i);
				int index = i;
				for (int j = i + 1; j < arrayList.size() ; j++)
				{
					if (arrayList.get(j) <= smallest)
					{
						smallest = arrayList.get(j);
						index = j;
					}
				}
				
				if (smallest != arrayList.get(i))
				{
					arrayList.set(i, arrayList.set(index, arrayList.get(i)));
				}
				
			}
		}
	}
}
