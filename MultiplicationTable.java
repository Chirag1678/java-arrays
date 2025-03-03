// Create MultiplicationTable Class to calculate table of a number from 1 to 10
import java.util.Scanner;

class MultiplicationTable {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take the number from the user as input
		System.out.print("Enter the number whose table you want: ");
		int number = input.nextInt(); // Read the input
	
		// Check for negative number
		if(number<=0){
			System.err.printf("%d is an Invalid Number", number);
		}

		// Declare an array of size 10 to store the values of multiplication result
		int[] multiplication = new int[10];

		for(int i=1;i<=10;i++){
			multiplication[i-1] = number * i;
		}

		// Display the result
		for(int i=0;i<10;i++){
			System.out.printf("%d * %d = %d\n", number, i+1, multiplication[i]);
		}
		
		// Close the Scanner Object
		input.close();
	}
}		
