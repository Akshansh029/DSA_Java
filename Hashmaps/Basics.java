
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basics {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // HashMap<String, Integer> newMap = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        // map.putAll(newMap); // Copies from newMap to map
        // System.out.println(map.size());
        // System.out.println(map);
        map.remove("e"); // Removes e from map

        // System.out.println(map);
        // System.out.println(map.size());
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
