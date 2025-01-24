package ArrayLists;

import java.util.ArrayList;

public class ArraysAndArrayLists {
	 public static void main(String[] args) {
	        // Demonstrating Arrays
	        // Fixed Size: Once created, the size of the array cannot be changed
	        int[] intArray = new int[5];
	        intArray[0] = 1;
	        intArray[1] = 2;
	        intArray[2] = 3;
	        intArray[3] = 4;
	        intArray[4] = 5;
	        
	        // Type-Specific: All elements must be of the same type
	        String[] stringArray = {"Hello", "World"};

	        // Index-Based Access: Access elements using their index
	        System.out.println("Array element at index 0: " + intArray[0]);

	        // Memory Efficiency: Arrays store elements in contiguous memory locations
	        System.out.println("Array length: " + intArray.length);

	        // Demonstrating ArrayLists
	        ArrayList<Integer> intArrayList = new ArrayList<>();
	        intArrayList.add(1);
	        intArrayList.add(2);
	        intArrayList.add(3);
	        intArrayList.add(4);
	        intArrayList.add(5);
	        intArrayList.add(6); // No issue adding more elements

	        ArrayList<String> stringArrayList = new ArrayList<>(); //Initialize ArrayLists
	        stringArrayList.add("Hello");
	        stringArrayList.add("World");

	        // Index-Based Access: Access elements using their index
	        System.out.println("ArrayList element at index 0: " + intArrayList.get(0));

	        // Built-In Methods: Convenient methods for managing elements
	        intArrayList.remove(0); // Removes the element at index 0
	        System.out.println("ArrayList after removing element at index 0: " + intArrayList);

	    }

}
