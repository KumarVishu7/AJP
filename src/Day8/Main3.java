package Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Add cricketer names and scores to the Map
        cricketerScores.put("Virat Kohli", 123);
        cricketerScores.put("Rohit Sharma", 85);
        cricketerScores.put("Kane Williamson", 102);
        cricketerScores.put("Steve Smith", 95);
        cricketerScores.put("Joe Root", 76);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cricketer's name to search for his score: ");
        String name = scanner.nextLine();

        if (cricketerScores.containsKey(name)) {
            System.out.println("Score of " + name + ": " + cricketerScores.get(name));
        } else {
            System.out.println("Cricketer not found in the records.");
        }

        // Close the scanner
        scanner.close();
    }
}

