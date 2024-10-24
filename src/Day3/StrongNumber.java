package Day3;
import java.util.Scanner;
public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact =fact* i;
        }
        return fact;
    }
    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        // Calculate sum of factorials of digits
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }
}
