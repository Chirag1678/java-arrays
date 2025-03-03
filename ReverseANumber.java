// Create ReverseANumber Class to take a number as input from the print it in reverse order
import java.util.Scanner;

class ReverseANumber {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take the input number from user
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		// find the count of digits in the number
		int temp = number;
		int count = 0;
		
		while(temp!=0){
			count++;
			temp/=10;
		}

		// Create an array to store the digits
		int[] digits = new int[count];

		// get the digits from number and store it in array
		for(int i=0;i<count;i++){
			digits[i] = number%10;
			number/=10;
		}

		// Display the number in reverse order
		System.out.print("Reversed number: ");		
		for(int digit:digits){
			System.out.print(digit);
		}

		// Close the Scanner Object
		input.close();

	}
}
