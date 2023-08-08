package Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		 // Create a List of integers
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);

        // Convert List to an Array
        Integer[] array = al.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

//        // Print the elements of the Array
//        System.out.println("Array elements:");
//        for (Integer num : array) {
//            System.out.println(num);
//        }

	}

}
/*
 * RESULT:
 * [1, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
 */
