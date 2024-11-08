package Day9;

import java.util.TreeMap;

public class Question1 {
    public static void main(String[] args) {
        // Initialize the TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("Original TreeMap: " + treeMap);

        // Remove the entry with key "Two"
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value = " + removedValue);

        // Check if entry with key "Three" exists
        boolean isThreeRemoved = !treeMap.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved);

        // Display updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);
    }
}

