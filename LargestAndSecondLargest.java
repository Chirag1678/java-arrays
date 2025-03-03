// Create LargestAndSecondLargest Class to find the largest and second largest digit in a number
import java.util.Scanner;

class LargestAndSecondLargest {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take a number input from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt();

		// Define max number of digits (Assumption: Max 10 digits)
		int maxDigit = 10;
		int[] digits = new int[maxDigit]; // Array to store the digits
		int index = 0; // Counter to go through array

		// Get the digits and store it in array
		while(number!=0){
			int digit = number%10;
			digits[index++] = digit;

			number/=10;

			if(index==maxDigit){
				break;
			}
		}

		// Create variables to store the largest and second largest digit
		int largest = -1;
		int secondLargest = -1;

		// Loop to find the largest and secondLargest
		for(int digit: digits){
			if(digit>largest){
				secondLargest = largest;
				largest = digit;
			}
			else if(digit>secondLargest & digit!=largest){
				secondLargest = digit;
			}
		}
	
		// Display the results
		System.out.println("Lagrest digit in number is: " + largest);
		if(secondLargest == -1){
			System.out.print("No seocnd largest digit found");
		} else{
			System.out.print("Second largest digit in number is: " + secondLargest);
		}

		// Close the Scanner Object
		input.close();
	}
}
