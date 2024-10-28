package Day8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "Apple");
        map.put("2", "Banana");
        map.put("3", "Orange");

        System.out.println("HashMap contents: " + map);

        String key = "4";
        String value = "Grapes";
        map.put(key, value);

        System.out.println("Updated HashMap contents: " + map);
    }
}
