
/**
 * ButtonTester class for CuttonCounter
 */
public class ButtonTester {

	/**
	 * Main method for ButtonTester
	 * 
	 * @param args The command line arguments.
	 * 
	 **/
	public static void main(String[] args) {

		ButtonCounter test = new ButtonCounter();

		// add two clicks
		test.clicks();
		test.clicks();

		// remove one click, but that's still one too many
		test.Undo();

		// reset clicks, clicks can start at zero now
		test.reset();

		// test for three clicks!
		for (int i = 0; i < 3; i++) {
			test.clicks();
		}

		// testing outcome
		System.out.println("Expected number of clicks: 3 ");
		System.out.println("Actual number of clicks: " + test.getValue());
		System.out.println("program by Ariana Hrlic ");
	}
}
