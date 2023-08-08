package Array;
import java.util.*;


import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		// Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee data to the TreeMap
        employeeMap.put(101, "John Doe");
        employeeMap.put(102, "Jane Smith");
        employeeMap.put(103, "Cichael Johnson");
        employeeMap.put(104, "Emily Brown");
        employeeMap.put(105, "Aobert Lee");

        // Get a set of all entries (ID-Name pairs) from the TreeMap
        Set<Map.Entry<Integer, String>> employeeSet = employeeMap.entrySet();

        // Sort the entries using a custom comparator (by employee name)
        List<Map.Entry<Integer, String>> sortedEmployees = new ArrayList<>(employeeSet);
        sortedEmployees.sort(Comparator.comparing(Map.Entry::getValue));

        // Print out the names of all employees in alphabetical order
        System.out.println("Employees sorted by name:");
        for (Map.Entry<Integer, String> entry : sortedEmployees) {
            System.out.println(entry.getValue());
        }

	}

}
