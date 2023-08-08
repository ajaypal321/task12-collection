package Array;
import java.util.*;
import java.util.TreeMap;

public class TreeMapPro {

	public static void main(String[] args) {
		// Create a TreeMap of employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add elements to the TreeMap
        employeeMap.put(101, "ajay");
        employeeMap.put(102, "kumar");
        employeeMap.put(103, "pal");
        employeeMap.put(104, "ram");
        employeeMap.put(105, "gyan");

        // Print out the names of all employees in alphabetical order
        System.out.println("Names of employees in alphabetical order:");

        for (String name : employeeMap.values()) {
            System.out.println(name);
        }

	}

}
