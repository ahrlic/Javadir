
import java.util.Scanner;

/**
 * Driver class for lab1, ButtonCounter 
 */
public class Driver {

	/**
	 * Main method for driver class
	 * @param args The command line arguments.
	 * 
	 **/
	public static void main(String[] args) {

		// Declarations
		Scanner input = new Scanner(System.in);
		ButtonCounter count = new ButtonCounter();
		String userInput = "y";

		// insure counter begins at zero
		count.reset();

		while (true) {
			System.out.println("Would you like to click the button? y | n" + " | r to remove a click");
			userInput = input.next();
			userInput.toLowerCase();

			if (userInput.equals("y")) {
				count.clicks();

			} else if (userInput.equals("r")) {

				// insure that we do not get a negative value at any point
				if (count.getValue() > 0) {
					count.Undo();
				}

			} else if (userInput.equals("n")) {
				//display the results to the user
				System.out.println("Total clicks " + count.getValue());
				input.close();
			}

		}

	}

}
