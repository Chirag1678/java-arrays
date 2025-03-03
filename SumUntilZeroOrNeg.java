// Create SumUntilZeroOrNeg class to store values until and print it's sum unitl user enter 0 or negative number or if the Intgerers reached to 10
import java.util.Scanner;

class SumUntilZeroOrNeg {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner  input = new Scanner(System.in);

		// Create an array named numbers of size 10 to store numbers
		double[] numbers = new double[10];

		// Create a variable total to store sum, and index to store the current index in array
		double total = 0.0;
		int index = 0;

		// Loop until user enter 0 or negative number, or if the index reached to 10
		while(true){
			if( index == 10 ){
				break;
			}

			// Take the input number from user
			System.out.printf("Enter the number %d: ", index+1);
			double number = input.nextDouble(); // Read the user input

			if( number <= 0 ){
				break;
			}
			numbers[index] = number;
			index++;
		}
		
		// Iterate through array to sum all the numbers
		for(double number: numbers){
			if(number == 0) break;
			total+=number;
		}

		// Display the result
		System.out.printf("Total of the numbers is: %.2f", total);

		// Close the Scanner Object
		input.close();
	}
}
