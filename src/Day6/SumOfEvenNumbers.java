package Day6;

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the list
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);

        int sumOfEvens = 0;


        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            }
        }


        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}

