package Array;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		// Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add elements to the ArrayList
        stringList.add("Ram");
        stringList.add("Shyam");
        stringList.add("Ganesh");
        stringList.add("Ramesh");
        stringList.add("Mahade");

        //  ArrayList before removing elements
        System.out.println("ArrayList before removal: " + stringList);

        // Remove all elements from the ArrayList
        stringList.clear();

        // ArrayList after removing elements
        System.out.println("ArrayList after removal: " + stringList);

	}

}
/*
 * RESULT:
 * ArrayList before removal: [Ram, Shyam, Ganesh, Ramesh, Mahade]
ArrayList after removal: []

 * 
 */
