

/**
	 * Student Name: Ariana Hrlic
	 * Lab Professor: Amal Ibrahim
	 * Due Date: week 2
	 * Modified: 01/06/24
	 * Description: button counter object  
	 */

/**
 * Button Counter class object
 * 
 */
public class ButtonCounter {

	/**
	 * Declarations 
	 * 
	 */
	private int count = 0;

	/**
	 * Default Constructor
	 * Constructs and initializes a count at 0
	 */
	public ButtonCounter() {
		this.count = 0;

	}

	/**
	 * Sets instance variable count to this parameter
	 * 
	 * @param clicks the clicks to set
	 */
	public void setValue(int clicks) {
		this.count = clicks;
	}

	/**
	 * Get the current value of count
	 * @return count 
	 */
	public int getValue() {
		return count;

	}

	/**
	 * The accumulated count of clicks
	 * @return the count + 1 per click
	 */
	public int clicks() {
		return count += 1;
	}

	/**
	 * Remove one from the count
	 * @return the count - 1 
	 */
	public int Undo() {
		return count -= 1;
	}

	/**
	 * Reset the counter accordingly
	 * @return the count reset to 0
	 */
	public int reset() {
		return count = 0;

	}
}
