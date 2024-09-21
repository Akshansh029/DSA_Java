
import java.util.HashMap;

public class Basics {

    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        // HashMap<String, Integer> newMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);

        // Retrieving a value from the HashMap
        System.out.println("Apple quantity: " + map.get("Apple"));

        // map.putAll(newMap); // Copies from newMap to map
        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is available.");
        }

        // Iterating over HashMap
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Removing a key-value pair
        map.remove("Orange");

        // Displaying the updated map
        System.out.println("Updated HashMap: " + map);
    }
}
