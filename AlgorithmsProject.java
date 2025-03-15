import java.util.Arrays;

public class AlgorithmsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,5,2,1};
		System.out.println(returnSmallest(nums));
		System.out.println(returnSmallestIndex(nums));
		System.out.println(returnAverage(nums));
		System.out.println(evenArray(nums));
		consecutiveFives(nums);
		System.out.println(threeTimesNumber(nums));
		System.out.println(returnInts(nums, 1));
		arrayBackwards(nums);
		shiftElementsRight(nums);
		selectionSort(nums);
	}
	/**
	 * 1. Return the smallest number in the array. 
	 */
	public static int returnSmallest(int [] arr)
	{
		int min = arr[0];
		for (int i = 1; i < arr.length ; i++)
		{
			if (min > arr[i])
			{
			min = arr[i];
				
				
			}
			
		}

		return min;
	}
	/**
	 * 2. Return the index of the smallest number in the array. 
	 */
	public static int returnSmallestIndex(int [] arr)
	{
		int min = arr[0];
		for (int i = 1; i < arr.length ; i++)
		{
			if (min > arr[i])
			{
			min = arr[i];
				
				
			}
			
		}

		return arr.length;
	}
	/**
	 * 3. Return the average of all numbers in the array. 
	 */
	public static int returnAverage(int [] arr)
	{
		int average = 0;
		for (int i : arr)
		{
			average += i;
		}
		return average/arr.length;	
	}
	/**
   * 4. Return true if all numbers in the array are even, and return false otherwise.
	 */
	public static boolean evenArray(int [] arr)
	{
		for (int i : arr)
		{
			if (i % 3 == 0)
			{
				return false;
			}
			
		}
		return true;
	}
	/**
   * 5. If the array ever has two consecutive 5's, change them to 0's. (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).
	 */
	public static void consecutiveFives(int [] arr)
	{
		for (int i = 0; i < arr.length - 1 ; i++)
		{
			if (arr[i] == 5 && arr[i+1] == 5)
			{
			arr[i] = 0;
			arr[i+1] = 0;
			}
		}
	}
	/**
	 * 6. Return true if any number shows up three times in a row, and return false otherwise. 
	 */
	public static boolean threeTimesNumber(int [] arr)
	{
		for(int i=0; i < arr.length-2; i++)
		{
			if(arr[i]== arr[i+1] && arr[i+1]== arr[i+2])
			{
				return true;
			}
		}
		return false;
	}
	/**
	 * 7. Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. 
   * (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)
	 */
	public static int returnInts(int [] arr, int search)
	
	{
		int count = 0;
		
		for(int i : arr)
		{
			if(i == search)
			{
				count++;
			}
		}
		return count;		
	}
	/**
   * 8. Alter an array so that is the backwards version of the array initially passed 
   * (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})
	 */
	public static void arrayBackwards(int [] arr)
	{
		for(int i=0; i < arr.length / 2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]= temp;
		}
	}
	/**
   * 9. Shift all elements in an array to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})
	 */
	public static void shiftElementsRight(int [] arr)
	{
		for (int i = arr.length-1; i > 0; i--)
		{
			int temp = arr[i];
			arr[i] = arr [i-1];
			arr[i-1]= temp;
			
		}
	}
	/**
   * 10. Use either selection sort or insertion sort to sort an array. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
	 */
	public static void selectionSort( int [] arr)
	{
		{
			int smallest = arr[0];
			int index = 0;
			for( int i = 0 ; i < arr.length ; i++)
			{
				for (int j = i ; j < arr.length ; j++)
				{
					if (arr[i] <= smallest)
					{
						smallest = arr[i];
						index = i;
					}
				}
				
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index]= temp;
				
			}
		}

	}
}
