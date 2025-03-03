// Create MeanHeight Class to calculate the mean Height of players in a football team
import java.util.Scanner;

class MeanHeight {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Create an araay of heights to store the heights of players in cm
		double[] heights = new double[11];

		// Lopp till 11 to take user input and store it in the array
		for(int i=0;i<11;i++){
			System.out.printf("Enter the height for Player %d(in cms): ", i+1);
			double height = input.nextDouble();
			
			// Check for the negative height
			if(height<0){
				System.err.printf("%.2f is an invalid height", height);
				break;
			}

			// Store the heights in the array
			heights[i] = height;
		}

		// Create a variable to store the sum of heights of all the players
		double totalHeights = 0.0;

		for(double height:heights){
			totalHeights+=height;
		}

		// Create a variable to store the mean height of the players
		double meanHeight = totalHeights/11.0; 

		// Display the Result
		System.out.printf("The mean Height of football team is %.2f", meanHeight);

		// Close the Scanner Object
		input.close();
	}
}
