
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] checkArr = {4, 11, -4, 12, 99, 100, 7, -5};
		checkArr = sort(checkArr);
		for (int i = 0; i < checkArr.length; i++)
		{
			System.out.println(checkArr[i]);
		}
	}

	public static int[] sort(int numArr[])
	{
		boolean sorted = false;
		while (sorted == false) 
		{
			sorted = true;
			for (int i = 0; i < numArr.length - 1; i++)
			{
				if (numArr[i] >= numArr[i + 1])
				{
					swap(numArr, i, i+1);
					sorted = false;
				}
			}

		}
		return numArr;
	}
	public static int[] swap( int numArr[], int index1, int index2)
	{
		int[] copyArr = new int[numArr.length];
		for (int k = 0; k < numArr.length; k++)
		  {
		    copyArr[k] = numArr[k];
		  }
		numArr[index1] = copyArr[index2];
		numArr[index2] = copyArr[index1];
		return numArr;
	}

}
