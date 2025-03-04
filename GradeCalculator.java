// Create GradeCalculator Class to calculate percentage and Grade of students
import java.util.Scanner;

class GradeCalculator {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take input for number of students
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();

		// Create arrays to store marks, percentage and Grade
		double[][] marks = new double[number][3]; // (column 0 -> pysics marks, column 1 -> chemistry marks, column 2 -> maths marks)
		double[] percentage = new double[number];
		char[] grade = new char[number];

		// take marks as input from user
		for(int i=0;i<number;i++){
			System.out.printf("Enter marks for Student %d:\n", i+1);

			for(int j=0;j<3;j++){
				String subject = (j==0) ? "Physics" : (j==1) ? "Chemistry" : "Maths";
				do {
					System.out.printf("%s: ", subject);
					marks[i][j] = input.nextDouble();
					if(marks[i][j]<0){
						System.out.println("Marks cannot be negative. Please enter valid marks.");
					}
				}while(marks[i][j]<0);
			}
		}

		// Calculate percentage for each student
		for(int i=0;i<number;i++){
			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

			// Assign grades based on percentage
			if (percentage[i] >= 80) {
                                grade[i] = 'A';
                        } else if (percentage[i] >= 70) {
                                grade[i] = 'B';
                        } else if (percentage[i] >= 60) {
                                grade[i] = 'C';
                        } else if (percentage[i] >= 50) {
                                grade[i] = 'D';
                        } else if (percentage[i] >= 40) {
                                grade[i] = 'E';
                        } else {
                                grade[i] = 'R';
                        }
		}

		// Display the results
		for(int i=0;i<number;i++){
			System.out.printf("Details of Student %d:\n", i+1);
			System.out.printf("Marks in Physics %.2f, Chemistry %.2f and Maths %.2f\n", marks[i][0], marks[i][1], marks[i][2]);
			System.out.printf("Percentage is %.2f and Grade is %c", percentage[i], grade[i]);
			System.out.println();
		}
		
		// Close the Scanner Object
		input.close();
	}
}
