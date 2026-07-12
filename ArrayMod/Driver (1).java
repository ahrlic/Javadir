// TODO: Add missing comments
/*
	 * Student Name: Ariana Hrlic
	 * Lab Professor: Sara Khan
	 * Due Date: End of lab class
	 * Modified: November 11/24
	 * Description: driver class for array modifier
	 */
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbersToCollect;
		int[] numbers;
		int count = 0;
		ArrayModifier arrayModifier;
		
		System.out.println("How many numbers would you like to collect?");
		numbersToCollect = input.nextInt();
		input.nextLine();
		numbers = new int[numbersToCollect];
		
		while (count < numbersToCollect) {
			System.out.printf("Enter value #%d: ", count + 1);
			int number = input.nextInt();
			input.nextLine();
			numbers[count] = number;
			++count;
		}
		
		arrayModifier = new ArrayModifier();
		arrayModifier.setValues(numbers);
		
		arrayModifier.modifyArray();
		
		System.out.println("The modifier array is:");

		// TODO use a loop to print the modified array, one element per line.
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// TODO print your name below
		System.out.println("Program modified by Ariana Hrlic");
		input.close();
	}
}
