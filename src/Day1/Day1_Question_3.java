package Day1;
import java.util.Scanner;

public class Day1_Question_3 {
        public static void main(String[] args) {
            // Create a scanner object to take user input
            Scanner scanner = new Scanner(System.in);

            // Input the number
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Input the bit position (n)
            System.out.print("Enter the bit position to check (0-based index): ");
            int n = scanner.nextInt();

            // Perform bitwise AND operation to check if the nth bit is set
            int mask = 1 << n;  // Left shift 1 by n positions
            boolean isSet = (num & mask) != 0;  // Check if the nth bit is set

            // Display the result
            if (isSet) {
                System.out.println("The " + n + "th bit of number " + num + " is set (1).");
            } else {
                System.out.println("The " + n + "th bit of number " + num + " is not set (0).");
            }

        }

}
