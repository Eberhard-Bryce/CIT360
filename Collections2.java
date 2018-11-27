import java.util.*;

public class Collections2 {

	public static void main(String[] args) {

		System.out.println(
				"\n\n########################################### MAPS ############################################\n\n");

		// Create a map that contains a string and integer for key use
		// A map has the form Map <K, V> where:
		// K: specifies the type of keys maintained in this map.
		// V: defines the type of mapped values.
		System.out.println("Creating Map AppleStore...");
		Map<String, Integer> appleProduct = new HashMap<String, Integer>();

		// Lets import some inventroy into the applestore
		// put() Adds the requested key-value pair in the map.
		System.out.println("\nImporting inventory into the AppleStore");
		appleProduct.put("Iphone 8", 50);
		appleProduct.put("AppleWatch", 32);
		appleProduct.put("Ipad 3", 11);
		appleProduct.put("Ipod", 20);
		appleProduct.put("Apple TV", 12);
		

		// Lets take stock of the applestore
		// size() Returns the number of key-value pairs currently in the map.
		System.out.println("\nAppleStore Total Stock: " + appleProduct.size() + "\n");

		
		// Lets search for a ipod in the map
		// containsKey() Returns true if the map contains the requested key.
		String searchKey = "Ipod";
		if (appleProduct.containsKey(searchKey)) {
			System.out.println("\nFound: " + appleProduct.get(searchKey) + " - Using searchKey: " + searchKey);
		}

		// Lets search for a iphone using the inventory
		// containsValue() Returns true if the map contains the requested value.
		int searchValue = 50;
		if (appleProduct.containsValue(searchValue)) {
			System.out.println("\nFound: Iphone 8 - Using searchValue: " + searchValue);
		}

		// Clear out the applestore
		// clear() Removes all the elements from the map.
		System.out.println("\nClearing out the AppleStore. Clearing...");
		appleProduct.clear();

		// Check the size of the map after clearing it
		System.out.println("Current inventory AppleStore: " + appleProduct.size());

		System.out.println(
				"\n\n########################################### SETS ############################################\n\n");

		// Create new Set string - empty
		Set<String> set1Example = new HashSet<String>();

		// Add chars to setExample
		set1Example.add("Mom");
		set1Example.add("Dad");
		set1Example.add("Brandon");
		set1Example.add("Bryce");
		set1Example.add("Nicholas");
		

		// Print out contents
		System.out.println("set1Example Contents: " + set1Example);

		// Create new Set2 string - empty
		Set<String> set2Example = new HashSet<String>();

		// Add chars to set2Example
		set2Example.add("Mom");
		set2Example.add("Dad");
		set2Example.add("Brandon");
		set2Example.add("Bryce");
		set2Example.add("Nicholas");
		

		// Print out contents
		System.out.println("set2Example Contents: " + set2Example);

		// Lets compare the two sets to see if the contents match
		System.out.println("\nDoes set1Example match exactly set2Example?: " + set1Example.equals(set2Example));

		// Since they both match exactly lets remove an element from set1Example
		System.out.println("\nLets remove Mom and Brandon from set1Example. Removing...");
		set1Example.remove("Mom");
		set1Example.remove("Brandon");
		

		// Print out contents
		System.out.println("\nset1Example contents: " + set1Example);
		System.out.println("\nset1Example contents: " + set2Example);

		// Lets compare both sets again
		System.out.println("\nDoes set1Example match exactly set2Example?: " + set1Example.equals(set2Example));

		// Example of the use of a for each loop
		System.out.println("\nFor Each Loop Example - set1Example");
		for (String str : set1Example) {
			System.out.println("set1Example: " + str);
		}

		// Lets use an Iterator to loop through and display contents
		System.out.println("\nIterator Loop - set2Example");
		Iterator<String> iterator = set2Example.iterator();
		while (iterator.hasNext()) {
			System.out.println("set2Example: " + iterator.next());
		}

		// Example of clearing set1Example
		System.out.println("\nLets wipe the slate on set1Example. Clearing...");
		set1Example.clear();
		System.out.println("Was set1Example cleared?: " + set1Example.isEmpty());

		// Example to show size count of each set
		System.out.println("\nset1Example currently has: " + set1Example.size() + " Family Members");
		System.out.println("set2Example currently has: " + set2Example.size() + " Family Members");

		// Lets create an array and store the contents of set2Example in it
		System.out.println(
				"\nLets create an array and transfer whats in set2Example into it. Creating... Transferring...");
		String[] setContentsArray = set2Example.toArray(new String[set2Example.size()]);
		System.out.println("Current contents of setContentsArray are:" + Arrays.toString(setContentsArray));

		System.out.println(
				"\n\n########################################### TREES ############################################\n\n");

		TreeSet<Integer> integerTree = new TreeSet<Integer>();
		integerTree.add(1);
		integerTree.add(2);
		integerTree.add(3);
		integerTree.add(4);
		integerTree.add(5);
		integerTree.add(6);
		integerTree.add(7);
		integerTree.add(8);
		integerTree.add(9);
		integerTree.add(10);

		System.out.print("Tree integer data in ascending order: ");

		// Lets print out the ints in the tree using an iterator in ascending
		// order
		Iterator<Integer> iterator2 = integerTree.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}

		// Lets now check to see if the tree is full or empty
		if (integerTree.isEmpty()) {
			System.out.println("\nThe integerTree is empty");
		} else {
			System.out.println("\n\nThe integerTree is full and contains: " + integerTree.size() + " integers");
		}

		// Display the last integer in the tree
		System.out.println("\nintegerTree - Last integer: " + integerTree.last());

		// Display the first integer in the tree
		System.out.println("integerTree - First integer: " + integerTree.first());

		// Lets remove an integer from the tree
		System.out.println("\nRemoving 10 from the integerTree...");
		if (integerTree.remove(10))
		{
			System.out.println("Removed 10");
		} else {
			System.out.println("Integer doesn't exist");
		}

		// Lets remove an integer from the tree
		System.out.println("\nRemoving 9 from the integerTree...");
		if (integerTree.remove(9))
		{
			System.out.println("Removed 9");
		} else {
			System.out.println("Integer doesn't exist");
		}
		
		// Lets remove an integer from the tree
				System.out.println("\nRemoving 8 from the integerTree...");
				if (integerTree.remove(8))
				{
					System.out.println("Removed 8");
				} else {
					System.out.println("Integer doesn't exist");
				}
				
		// Displaying the Tree set data
		System.out.print("\nTree integer data in ascending order: ");
		Iterator<Integer> iterator3 = integerTree.iterator();
		while (iterator3.hasNext()) {
			System.out.print(iterator3.next() + " ");
		}

		// Let the user know how many integer are in the tree
		System.out.println("\n\nThe integerTree now contains: " + integerTree.size() + " integers");

		// Lets clear house - Wipe the integerTree
		System.out.println("\n Clearing the integerTree");
		integerTree.clear();

		// Check to see if its clear or still contains integers
		if (integerTree.isEmpty()) {
			System.out.println("\nThe integerTree is empty");
		} else {
			System.out.println("\n\nThe integerTree is full and contains: " + integerTree.size() + " integers");
		}
	}
}
