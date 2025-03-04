// Create BMICalculator Class to calculate BMI and weight status of persons
import java.util.Scanner;

class BMICalculator {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take the number of persons as input from user
		System.out.print("Enter the number of persons: ");
		int persons = input.nextInt();

		// Create arrays to store heights, weigths, BMI and Weight status
		double[] heights = new double[persons];
		double[] weights = new double[persons];
		double[] bmi = new double[persons];
		String[] weightStatus = new String[persons];

		// Take user input for weights and heights
		for(int i=0;i<persons;i++){
			System.out.printf("Enter weight of Person %d(in Kgs): ", i+1);
			weights[i] = input.nextDouble();

			System.out.printf("Enter height of Person %d(in cms): ", i+1);
			heights[i] = input.nextDouble();
		}

		// Loop to calculate and store BMI and weight status
		for(int i=0;i<persons;i++){
			// Convert height from cms to meters
			double heightInMeters = heights[i] / 100;

			// Calculate BMI using formula: BMI = weight / (height * height)
			bmi[i] = weights[i] / (heightInMeters * heightInMeters);

			// Determine weight status based on BMI
			if(bmi[i] < 18.5){
				weightStatus[i] = "Underweight";
			}
			else if(bmi[i]>=18.5 && bmi[i]<=24.9){
				weightStatus[i] = "Normal";
			}
			else if(bmi[i]>=25 && bmi[i]<=39.9){
				weightStatus[i] = "Overweight";
			}
			else{
				weightStatus[i] = "Obese";
			}
		}

		// Display the result
		for(int i=0;i<persons;i++){
			System.out.printf("For Person %d, the Weight is %.2fkgs and height is %.2fcms\n", i+1, weights[i], heights[i]);
			System.out.printf("For Person %d, the BMI is %.2f and weight status is %s\n", i+1, bmi[i], weightStatus[i]);
		}

		// Close the Scanner object 
		input.close();
	}
}
