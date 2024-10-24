package Day7;
import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Display the original HashSet
        System.out.println("Original HashSet: " + set);

        // Append a specified element to the HashSet
        String elementToAdd = "Orange";
        set.add(elementToAdd);

        // Display the HashSet after adding the element
        System.out.println("HashSet after adding element: " + set);
    }
}

