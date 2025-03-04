// Create CalculateFrequency Class to calculate frequency of each digit in a number
import java.util.Scanner;

class CalculateFrequency {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take a number as input from user
		System.out.print("Enter the number: ");
		int number = input.nextInt();
	
		// Loop to count the number of digits in number
		int temp = number;
		int count = 0;
		while(temp!=0){
			count++;
			temp/=10;
		}

		// Create a digit array and store all the digits of number
		temp = number;
		int[] digits = new int[count];
		int index=0;

		while(temp!=0){
			digits[index++] = temp%10;
			temp/=10;
		}

		// Create a frequency array to store the frequency of each digit 
		int[] frequency = new int[10];

		// Loop through digits array to count the frequency
		for(int i=0;i<count;i++){
			frequency[digits[i]-1]++;
		}

		// Display the result
		System.out.printf("For number %d, the frequncy of:\n" , number);
		for(int i=0;i<10;i++){
			if(frequency[i]!=0){
				System.out.printf("%d is: %d\n", i+1, frequency[i]);
			}
		}

		// Close the Scanner Object
		input.close();
	}
}
