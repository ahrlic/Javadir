// To Do: File Comment Header

import java.util.Scanner;

/* 
 * Simple class, contains main line logic for application.
 */
public class Driver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int hatSize 	= 0;	// User's Canadian hat size
		String gender 	= null;	// User's gender
		String report	= null; // report from object

		System.out.print("Please enter your Canadian hat size ");
		hatSize = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Please enter your gender (male or female) ");
		gender = keyboard.nextLine();
		
		keyboard.close();
		
		HatSizeConverter hatSizeConverter = new HatSizeConverter(hatSize, gender);
		
		report = hatSizeConverter.createReport();

		System.out.println(report);
		// update the line below to include your name
		System.out.println("Program by Junior Programmer");
		System.out.println();
		

		
	}
}



