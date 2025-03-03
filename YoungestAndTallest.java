// Create YoungestAndTallest Class to find the youngest and tallest among three friends
import java.util.Scanner;

class YoungestAndTallest {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Create two arrays named ages and heights to store age and height of three friends
		int[] ages = new int[3];
		double[] heights = new double[3];
		String[] names = {"Amar", "Akbar", "Anthony"};

       		// Taking input for age and height
        	for (int i = 0; i < 3; i++) {
            		System.out.printf("Enter age of %s: ", names[i]);
            		ages[i] = input.nextInt();
            
			System.out.printf("Enter height of %s (in cm): ", names[i]);
            		heights[i] = input.nextDouble();
        	}

		// Create variables for youngest and tallest along with their Indexes
		int youngestIndex = 0;
		int minAge = ages[0];
		int tallestIndex = 0;
		double maxHeight = heights[0];

     		// Iterate to find the youngest and tallest
		for(int i=1;i<3;i++){
			// Find the youngest friend
			if(ages[i] < minAge){
				minAge = ages[i];
				youngestIndex = i;
			}
			// Find the tallest friend
			if(heights[i] > maxHeight){
				maxHeight = heights[i];
				tallestIndex = i;
			}
		}
	
		// Display the results
		System.out.printf("The youngest friend is %s with age %d years\n", names[youngestIndex], ages[youngestIndex]);
		System.out.printf("The tallest friend is %s with height %.2f cms", names[tallestIndex], heights[tallestIndex]);

		// Close the Scanner Object
		input.close();
	}
}
