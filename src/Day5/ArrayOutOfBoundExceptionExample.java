package Day5;

public class ArrayOutOfBoundExceptionExample {
        public static void main(String[] args) {
            // Define an array with 5 elements
            int[] numbers = {1, 2, 3, 4, 5};

            try {
                // Loop through the array and attempt to access elements beyond its size
                for (int i = 0; i <= numbers.length; i++) {
                    // Access array elements
                    System.out.println("Element at index " + i + " is " + numbers[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Exception caught: " + e);
                System.out.println("You are trying to access an element beyond the array size.");
            }
        }
    }

