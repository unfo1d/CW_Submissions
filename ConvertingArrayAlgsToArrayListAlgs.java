/**
Completely off topic but I redid the title like 50 times because I wasn't writing it correctly 
*/
import java.util.ArrayList;
public class ConvertingArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    ArrayList <Integer> fourList = new ArrayList<Integer>();
	 fourList.add(1);
	 fourList.add(4);
	 fourList.add(4);
	 fourList.add(7);
	 System.out.println(checkFor4(fourList));
	 
	 ArrayList <Integer> nums = new ArrayList<Integer>();
	 nums.add(5);
	 nums.add(5);
	 nums.add(0);
	 nums.add(8);
	 nums.add(5);
	 nums.add(20);
	System.out.println(nums);
	ridAllFives(nums);
    
  ArrayList <Integer> sortArr = new ArrayList<Integer>();
	sortArr.add(21);
	sortArr.add(0);
	sortArr.add(48);
	sortArr.add(93);
	sortArr.add(31);
	sortArr.add(58);
	bubbleSort(sortArr);
	}
	/**
 Checks an arraylist for any 4s, and prints the index of the first 4 it sees.
 */
	public static int checkFor4(ArrayList <Integer> list4)
	{
		for (int i = 0 ; i < list4.size()-1; i++)
		{
			if ((list4.get(i)) == 4)
			{
				return i;
			}
		
		}
		return -1;
	}
	/**
This method checks an arraylist for 5s, and gets rid of all 5s in the arraylist.
 */
	public static void ridAllFives(ArrayList <Integer> rid5)
	{
		for (int i = 0 ; i < rid5.size()-1 ; i++)
		{
			if (rid5.get(i) == 5)
			{

				rid5.remove(i);
				i--;
			}
		}
		System.out.println(rid5);
	}
	/**
This method checks an arraylist and uses bubble sort to sort the arraylist. 
 */
  public static void bubbleSort(ArrayList <Integer> rid5)
	
	{
		boolean isNotSorted = true;
		while (isNotSorted)
		{
      
			isNotSorted = false;
      
			for (int i = 0 ; i < rid5.size() -1 ; i++)
			{

				if (rid5.get(i) > rid5.get(i+1))
				{
					int temp = rid5.get(i);
					rid5.set(i, rid5.get(i+1));
					rid5.set(i+1, temp);
					isNotSorted = true;
					i--;
				}
				
			}

		}
			System.out.println(rid5);
	}
}
