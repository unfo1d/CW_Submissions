package arrayLists;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		
    // 1. Instantiate an empty ArrayList that could have any type in it.
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		
    // 3. Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		strArrayList.add("Alice");
		strArrayList.add("Bob");
		strArrayList.add("Charlie");
		
    //4. Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}
		intArrList.add(2, 5);
		strArrayList.add(1, "Derek");
		
   //5. Print out the second and last elements in both intArrList and stringArrList.
		System.out.println(intArrList.get(1));
		System.out.println(intArrList.get(intArrList.size() - 1 ));
		System.out.println(strArrayList.get(1));
		System.out.println(strArrayList.get(strArrayList.size() - 1));
		
   //6. Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". Print out the first element in each array before and after the change
		System.out.println( intArrList.set(0, 0));
		System.out.println( strArrayList.set(0, "zero"));
		System.out.println(intArrList.get(0));
		System.out.println(strArrayList.get(0));
		
    //7. Delete the last element in both arrays. Print out what that removed element was. 
		System.out.println(intArrList.remove(intArrList.size() - 1));
		System.out.println(intArrList.get(intArrList.size() - 1));
		System.out.println(strArrayList.remove(strArrayList.size() - 1));
		System.out.println(strArrayList.get(strArrayList.size() - 1));
	}

}
