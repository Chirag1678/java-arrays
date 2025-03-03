// Create MultiplicationTable6To9 Class to calculate table of a number from 6 to 9
import java.util.Scanner;

class MultiplicationTable6To9 {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take input number from user
		System.out.print("Enter the number: ");
		int number = input.nextInt();

		// Create an array of size 4 to store the multiplication result
		int[] multiplicationResult = new int[4];
	
		// Iterate through array to store the result
		for(int i=6;i<=9;i++){
			multiplicationResult[i-6] = number * i;
		}

		// Display the result
		for (int i=6;i<=9;i++){
			System.out.printf("%d * %d = %d\n", number, i, multiplicationResult[i-6]);
		}

		// Close the Scanner Object
		input.close();
	}
}
