// Create VotingEligibility Class to check if the student is able to vote or not based on their ages
import java.util.Scanner;

class VotingEligibility {
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in); 
	
		// Declare an an integer array with size of 10
		int[] age = new int[10];

		// Iterate from 1 to 10 and take input for the ages of 10 students
		for(int i=0;i<10;i++){
			System.out.printf("Enter age of Student %d: ", i+1);
			age[i] = input.nextInt(); // Read the user input
		}

		// Run a loop with a condition (age>=18) able to vote
		for(int i=0;i<10;i++){
			// Check for negative age
			if(age[i]<0){
				System.err.printf("%d age is an Invalid Age\n", age[i]);
			}
			else if(age[i]>=18){
				// Display the result
				System.out.printf("Student with age %d can vote\n", age[i]);
			}
			else{
				System.out.printf("Student with age %d cannot vote\n", age[i]);
			}
		}
		// Close the Scanner Object
		input.close();
	}
}
