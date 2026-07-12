/*
 * Student Name: Ariana Hrlic
 * Lab Professor: Sara Khan
 * Due Date: November 24/2024
 * Modified: November 011/2024
 * Description: Driver class for battery checker assignment
 */ 


import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		//create objects
		BatteryChecker batteryChecker = new BatteryChecker();
		Battery battery = new Battery();
		Scanner input = new Scanner(System.in);
		
		// Declarations(other variables as needed)
		String decision = "yes";
		int counter = 0;
		
		// ToDo:
		// 
		// Output the following, noting that the values for the battery
		// dimensions are displayed using the static constants from
		// class Battery: "Enter battery dimensions (expected: 3.500 for
		// diameter, 10.300 for height)"
		System.out.println("Enter battery dimensions (expected: 3.500 "
										+ "for diameter, 10.300 for height");
		
		while (decision.equals("yes")) {
			
		// Using static methods from class User, prompt the user to
		// enter the diameter and height as measured.
		// set the dimensions into an instance of Battery
		battery.setDiameter(User.inputDouble("Enter the diameter:"));
		battery.setHeight(User.inputDouble("Enter the height:"));
		
		// Use the toString method of class Battery
		// to output the information for the battery. 
		System.out.println(battery.toString());
	
		// Use the BatteryChecker method to check if the
		// battery is within specifications for diameter and height
		// by passing that method the Battery reference-value as an argument.
		boolean acceptance = batteryChecker.checkWithinTolerance(battery);
		
		
		// Report to the user if the battery is within tolerance or not.
		// (See Sample Program Run for report format)
		// Keep track of how many were not within tolerance for later reporting
		if (acceptance == true) {
			System.out.print("The battery is within tolerance");
		} else {
			System.out.print("The battery is not within tolerance,");
			counter++; 
		}
		System.out.print(" is there anymore data to enter? e.g yes");
		decision = input.next();
		
		if (decision.equalsIgnoreCase("no")) {
			System.out.println("Total out of tolerance: " + counter);
			// Print out your name on screen
			System.out.println(" Program by Ariana Hrlic");
			break;
		}
		// Using a loop ask if there is more data to enter (yes, no)
		// by using static methods from class User, and continue
		// only if the user enters some form of yes
		// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)
		// if yes, processing should repeat in outputting the menu as above.
		
		// If there is no more data to enter, let the user know how many times
		// the battery were out of tolerance.

		// Note: You can use any decision structure or loop for this program,
		// however consider that we don't know in advance how many times
		// the loop will run.
		
		
		}
		//close the scanner
		input.close();
		
	}
}