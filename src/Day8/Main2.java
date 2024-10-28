package Day8;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        map.put(1, "Apple");

        // Check again if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }
    }
}
