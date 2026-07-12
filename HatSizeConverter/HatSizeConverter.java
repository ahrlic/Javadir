// To Do: File Comment Header
/*
 * Student Name: Ariana Hrlic
 * Lab Professor: Sara Khan
 * Due Date: November 06/2024
 * Modified: November 06/2024
 * Description: Hat size converter
 */ 

// To Do: Programmer Comments throughout
public class HatSizeConverter {
	int hatSize 	= 0;	// User's Canadian hat size
	String gender	= null;	// User's gender
	
	//default constructor 
 	public HatSizeConverter() {
		this(0,"");
	}
 
 	//overridden constructor 
	public HatSizeConverter(int hatSize, String gender) {
		this.hatSize = hatSize;
		this.gender = gender;
	}

	// accessor, get info from the user
	public double gethatSize() {
		return hatSize;
	}

	//mutator, set/ modify the value of the hatSize to use in object
	public void sethatSize(int hatSize) {
		this.hatSize = hatSize;
	}

	//accessor, get info from user
	public String getGender() {
		return gender;
	}

	//mutator, set/ modify the value for gender in the object to use
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// TODO Implement the following parameterless worker method
	// from your pseudocode
	
	//convert hat size depending on gender using switch and if/else statements
	public String createReport() {
		String report = null;
		

			switch (hatSize) {
			
			case 1: 
					if (hatSize == 6 ) {
						report = (gender +", UK Size = 5, EU Size = 38");
					}
					
				break;
			
			case 2: 
				if (gender == "male" && hatSize == 7) {
					report = ("male, UK Size = 6, EU Size = 40");
				} else if (gender == "female" && hatSize == 7) {
					report = ("female, UK Size = 5.5, EU Size = 39");
					
				}
				break;
				
			case 3:
				if (hatSize == 8) {
					report = (gender + "UK Size = 7, EU Size = 42");
				}
					
			default:
				report = ("hat size not found");
			}
	
		
		return report;
	}
}


