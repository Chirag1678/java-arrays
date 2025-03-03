// Create TwoDArrayToOneD Class to flatten the 2D multi-dimensional array into 1D
import java.util.Scanner;

class TwoDArrayToOneD {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take inputs from user for rows and columns
		System.out.print("Enter the number of rows: ");
		int rows = input.nextInt();
	
		System.out.print("Enter the number of columns: ");
		int columns = input.nextInt();

		// Create a 2D array(Matrix) with rows and columns
		int[][] matrix = new int[rows][columns];
		
		// Loop through matrix and take user input and store it in the matrix
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.printf("Enter the number for element matrix[%d][%d]: ", i, j);
				matrix[i][j] = input.nextInt();
			}
		}
	
		// Create a 1D array to store the elements from 2D array
		int[] numbers = new int[rows * columns];

		// Create a variable index to store value in array
		int index=0;
		
		// Loop to copy the elements
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				numbers[index++]=matrix[i][j];
			}
		}
		
		// Display the result
		System.out.print("2D array copied to 1D array successfully!");
		
		// Close the Scanner Object
		input.close();
	}
}
