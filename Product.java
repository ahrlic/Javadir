/*
	 * Student Name: Ariana Hrlic
	 * Lab Professor: Amal Ibrahim
	 * Due Date: week 9
	 * Modified: 03/04/2025
	 * Description: Product abstract class - Lab 05
	 */


public abstract class Product {

	private String name, category;
	private double price; 
	
	public Product(String name, String category, double price){
		this.name=name;
		this.category=category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public abstract String toString();
	
	public abstract String purchaseProduct();
}
