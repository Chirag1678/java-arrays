import java.util.Scanner;

/**
 * PositiveNegativeZero Class
 * This program takes user input for 5 numbers and checks whether a number is 
 * positive, negative, or zero. Further, for positive numbers, it checks if the 
 * number is even or odd. Finally, it compares the first and last elements of 
 * the array and displays if they are equal, greater, or less.
 */
class PositiveNegativeZero {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Declare an integer array with size of 5
        int[] numbers = new int[5];

        // Iterate from 1 to 5 and take input for the numbers
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = input.nextInt(); // Read the user input
        }

        // Loop through the array and check for positive, negative, or zero
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // Check for even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.printf("Number %d is positive and even\n", numbers[i]);
                } else {
                    System.out.printf("Number %d is positive and odd\n", numbers[i]);
                }
            } else if (numbers[i] < 0) {
                System.out.printf("Number %d is negative\n", numbers[i]);
            } else {
                System.out.printf("Number %d is zero\n", numbers[i]);
            }
        }

        // Compare first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.printf("First number %d is greater than last number %d\n", numbers[0], numbers[4]);
        } else if (numbers[0] < numbers[4]) {
            System.out.printf("First number %d is less than last number %d\n", numbers[0], numbers[4]);
        } else {
            System.out.printf("First number %d is equal to last number %d\n", numbers[0], numbers[4]);
        }

        // Close the Scanner Object
        input.close();
    }
}
