// Create BMICalculatorMultiDimensional Class to calculate BMI and wieght status of persons from heights and weights stored in a multi-dimensional array
import java.util.Scanner;

class BMICalculatorMultiDimensional {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Take the number of persons as input
       		System.out.print("Enter the number of persons: ");
        	int number = input.nextInt();

        	// Create a multi-dimensional array to store weight, height, and BMI
        	double[][] personData = new double[number][3]; // Columns: [0] -> Weight, [1] -> Height, [2] -> BMI
        	String[] weightStatus = new String[number];

        	// Take input for weight and height values
        	for (int i = 0; i < number; i++) {
            		System.out.printf("Enter weight of Person %d (in Kgs): ", i + 1);
           		personData[i][0] = input.nextDouble();

            		System.out.printf("Enter height of Person %d (in cms): ", i + 1);
            		personData[i][1] = input.nextDouble();
        	}

        	// Calculate BMI and determine weight status
        	for (int i = 0; i < number; i++) {
            		// Convert height from cm to meters
            		double heightInMeters = personData[i][1] / 100;

            		// Calculate BMI using formula: BMI = weight / (height * height)
            		personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            		// Determine weight status based on BMI
            		if (personData[i][2] < 18.5) {
                		weightStatus[i] = "Underweight";
            		} else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                		weightStatus[i] = "Normal";
            		} else if (personData[i][2] >= 25 && personData[i][2] <= 39.9) {
                		weightStatus[i] = "Overweight";
            		} else {
                		weightStatus[i] = "Obese";
            		}
        	}

        	// Display the result
		for(int i=0;i<number;i++){
			System.out.printf("For Person %d, the Weight is %.2fkgs and height is %.2fcms\n", i+1, personData[i][0], personData[i][1]);
			System.out.printf("For Person %d, the BMI is %.2f and weight status is %s\n", i+1, personData[i][2], weightStatus[i]);
		}

		// Close the Scanner Object
		input.close();
	}
} 
