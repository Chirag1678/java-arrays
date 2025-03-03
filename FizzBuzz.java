// Create FizzBuzz Class to print al Fizz, Buzz and FizzBuzz numbers between 0 to number
import java.util.Scanner;

class FizzBuzz {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take a number as input from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt();

		// Check for negative number
		if(number<=0){
			System.err.printf("%d is not a valid number", number);
			System.exit(1);
		}
	
		// Create a array to store the result along with Fizz, Buzz and FizzBuzz numbers
		String[] result = new String[number+1];

		// Loop from 1 to number and store the result
		for(int i=1;i<=number;i++){
			if(i%3==0 && i%5==0){
				result[i] = "FizzBuzz";
			}
			else if(i%3==0){
				result[i] = "Fizz";
			}			
			else if(i%5==0){
				result[i] = "Buzz";
			}			
			else{
				result[i] = ""+i;
			}
		}
		
		// Display the result
		for(int i=1;i<=number;i++){
			System.out.printf("Position %d = %s\n", i, result[i]);
		}

		// Close the Scanner Object
		input.close();
	}
}	
