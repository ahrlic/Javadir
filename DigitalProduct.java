/*
	 * Student Name: Ariana Hrlic
	 * Lab Professor: Amal Ibrahim
	 * Due Date: week 9
	 * Modified: 03/04/2025
	 * Description: Digital Product derived class - Lab 05
	 */

public class DigitalProduct extends Product {

	private double fileSize;
	private String downloadLink;
	

	/**
	 * Returns the fileSize of the digital product.
	 * 
	 * @return fileSize
	 */
	public double getFileSize() {
		return fileSize;
	}
	
	
	/**
	 * Sets instance variable fileSize to this parameter
	 * 
	 * @param fileSize to set the digital product fileSize
	 */
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}


	/**
	 * Returns the download Link of the digital product in the form of a string.
	 * 
	 * @return downloadLink
	 */
	public String getDownloadLink() {
		return downloadLink;
	}

	
	/**
	 * Sets instance variable downloadLink to this parameter
	 * 
	 * @param downloadLink to set the digital product download link in the form of a string.
	 */
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public DigitalProduct(String name, String category, double price, double fileSize, String downloadLink) {
		super(name, category, price);
		this.fileSize=fileSize;
		this.downloadLink=downloadLink;
		
	}

	/**
	 * Returns a formatted string that displays the data of the digital product
	 * 
	 * @return a String value
	 */
	@Override
	public String toString() {
		return String.format("Digitial Product: \n" + "Name: %s, \n Category: %s, \n Price: %.2f, \n file Size: %.2f, \n Download Link: %s\n" ,getName(),getCategory(),getPrice(),fileSize,downloadLink);
	}

	
	/**
	 * Returns a message about the product purchase status
	 * 
	 * @return a String value
	 */
	@Override
	public String purchaseProduct() {
		
		return "Your digitial product is ready to download";
	}

}
