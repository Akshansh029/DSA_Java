
import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Adding duplicate element (will be ignored)
        set.add("Apple");

        // Print all elements (order is not guaranteed)
        System.out.println(set);  // Output: [Apple, Orange, Banana]

        // Check if an element exists
        System.out.println(set.contains("Banana"));  // Output: true

        // Remove an element
        set.remove("Banana");

        // Iterate over the HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Get the size of the HashSet
        System.out.println("Size: " + set.size());  // Output: 2

        // Clear the HashSet
        set.clear();
        System.out.println("Is empty? " + set.isEmpty());  // Output: true
    }
}
