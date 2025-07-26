import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashmap {
    public static void main(String[] args) {
        // Create LinkedHashMap with Object as key type to store both Integer and String
        LinkedHashMap<Object, String> map = new LinkedHashMap<>();

        // Add integer and string keys with same "value"
        map.put(1, "Number One (Integer key)");
        map.put("1", "Number One (String key)");
        map.put("one", "One in words");
        map.put(2, "Number Two");

        // Print all key-value pairs
        System.out.println("LinkedHashMap with mixed key types:");
        for (Map.Entry<Object, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Check map size
        System.out.println("Size of map: " + map.size());
    }
}

