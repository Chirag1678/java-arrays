// Create FactorsOfNumber Class to calculate and display the factors of a number
import java.util.Scanner;

class FactorsOfNumber {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take input of a number from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt(); // Read the user input

		// Create a variable maxFactor with max number of factors to find is 10
		int maxFactor = 10;

		// Create an array factor of size maxFactor
		int[] factors = new int[maxFactor];

		// Create a variable index to store values in array
		int index = 0;

		// Iterate from 1 to number to find all the factors of the number
		for(int i=1;i<=number;i++){
			if(index == maxFactor){
				maxFactor*=2;
				int[] temp = new int[maxFactor];
				for(int j=0;j<maxFactor/2;j++){
					temp[j] = factors[j];
				}
				factors = temp;
			}
			if(number % i == 0 ){
				factors[index] = i;
				index++;
			}
		}
		
		// Display the result
		System.out.printf("Factors of number %d are: ", number);
		for(int i=0;i<index;i++){
			System.out.print(factors[i]+" ");
		}
		
		// Close the Scanner Object
		input.close();
	}
}
