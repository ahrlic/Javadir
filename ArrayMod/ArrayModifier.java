// TODO: Add missing comments
/*
	 * Student Name: Ariana Hrlic
	 * Lab Professor: Sara Khan
	 * Due Date: End of lab class
	 * Modified: November 11/24
	 * Description: modify array
	 */
public class ArrayModifier {
	
	private int[] values;
	
	//constructor 
	public ArrayModifier() {
		values = null;
	}
	
	//gets array of values 
	public int[] getValues() {
		return values;
	}

	//sets the values in the array
	public void setValues(int[] values) {
		this.values = values;
	}

	  // Method to modify the array: square even numbers, negate odd numbers
     public void modifyArray() {
        /* This method modifies the array as follows:
         * - Even numbers are squared (multiplied by themselves).
         * - Odd numbers are negated (multiplied by -1).
         */
    	 
    	 for(int i = 0; i < values.length; i++) {
    		if (values[i] % 2 == 0) {
    			values[i] *= values[i];
    		} else if (values[i] %2 != 0) {
    			values[i] *= -1;
    		}
    		
    	 }
	}
}
