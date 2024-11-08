package Day9;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapNavigationExample {
    public static void main(String[] args) {
        // Initialize the TreeMap with some values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        System.out.println("Navigating using entrySet() with for-each loop:");
        // 1. Using entrySet() with for-each loop
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nNavigating using keySet() with for-each loop:");
        // 2. Using keySet() with for-each loop
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        System.out.println("\nNavigating using values() with for-each loop:");
        // 3. Using values() with for-each loop
        for (Integer value : treeMap.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println("\nNavigating using entrySet() with Iterator:");
        // 4. Using Iterator with entrySet()
        Iterator<Map.Entry<String, Integer>> entryIterator = treeMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nNavigating using keySet() with Iterator:");
        // 5. Using Iterator with keySet()
        Iterator<String> keyIterator = treeMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        System.out.println("\nNavigating using forEach (Lambda Expression):");
        // 6. Using forEach (Lambda Expressions)
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}

