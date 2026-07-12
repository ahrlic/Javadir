/*
 * Student Name: Ariana Hrlic
 * Lab Professor: Sara Khan
 * Due Date: November 24/2024
 * Modified: November 11/2024
 * Description: Battery Tolerance Checker
 */ 

public class BatteryChecker {

	// ToDo: create private final values for the following constants

	// EPSILON_DIAMETER as the acceptable diameter tolerance (in mm)
	final double EPSILON_DIAMETER = 0.1 +10E-14;
	// EPSILON_HEIGHT as the acceptable height tolerance (in mm)
	final double EPSILON_HEIGHT = 0.3 + 10E-14;

	
	/**
	 * Check the if the battery dimensions are within tolerance
	 * @param battery
	 * @return boolean 
	 */
	public boolean checkWithinTolerance(Battery battery) {

		// ToDo:
		// create local variables as required
		double diameter = battery.getDiameter();
		double height = battery.getHeight();

		boolean validH, validD;
	
		/*
		 * Determine tolerances: make sure that the dimensions do not differ more than
		 * the acceptable tolerance using the constants from this class and from the
		 * Battery class (do not hard code values).
		 */
		if ((Math.abs(battery.EXPECTED_DIAMETER - diameter) < EPSILON_DIAMETER )) {
			validD = true;
		} else {
			validD = false; 
		}
		
		if ((Math.abs(battery.EXPECTED_HEIGHT - height) < EPSILON_HEIGHT)) {
			validH = true;
		} else {
			validH = false;
		}

		return validH && validD;
		
	}
}
