import java.util.Scanner;
import java.util.Arrays;

// Create ContinuosLargestDynamic Class to  finds the largest and second-largest digit in the array.
class DigitProcessor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initial maxDigit size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Variable to track array index
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            // If index reaches maxDigit, increase size dynamically
            if (index == maxDigit) {
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a new temp array
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy elements
                digits = temp; // Assign temp array to digits array
            }
            
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++; // Move to the next position
        }

        // Initialize variables for largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        // Find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest if it's not equal to largest
            }
        }

        // Display results
        System.out.println("\nDigits stored in the array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "Not Available" : secondLargest));

        // Close the Scanner object
        input.close();
    }
}
