// Create OddEvenNumbers Class to print the Odd and Even numbers from 1 to the number given by user
import java.util.Scanner;

class OddEvenNumbers {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take an integer input from the user
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		// Check for the negative number
		if(number<0){
			System.err.printf("%d is not a Natural Number", number);
			System.exit(1);
		}

		// Create two arrays Odd and Even of Sizes (number / 2 ) + 1
		int size = ( number / 2 ) + 1;
		
		int[] odd = new int[size];
		int[] even = new int[size];

		// Iterate till the number and store it in respective array
		int evenIndex = 0, oddIndex = 0;
		for(int i=1;i<=number;i++){
			if(i%2==0){
				even[evenIndex++] = i;	
			}
			else{
				odd[oddIndex++] = i;
			}
		}

		// Display the result
		System.out.printf("Odd numbers from 1 to %d are: ", number);
		if(number%2==0){
			for(int i=0;i<size-1;i++){
				System.out.print(odd[i]+" ");
			}
		}
		else{
			for(int i=0;i<size;i++){
				System.out.print(odd[i]+" ");
			}
		}
		System.out.println();
		System.out.printf("Even numbers from 1 to %d are: ", number);
		for(int i=0;i<size-1;i++){
			System.out.print(even[i]+" ");
		}

		// Close the Scanner Object
		input.close();
	}
}
