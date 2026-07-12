/*
	 * Student Name: Ariana Hrlic
	 * Lab Professor: Amal Ibrahim
	 * Due Date: week 9
	 * Modified: 03/04/2025
	 * Description: Physical Product Derived class - Lab 05
	 */


public class PhysicalProduct extends Product {

	private double weight, shippingCost;
	
	/**
	 * Returns the weight of the product.
	 * 
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets instance variable weight to this parameter
	 * 
	 * @param weight to set the initial weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Returns the shipping cost.
	 * 
	 * @return shippingCost
	 */
	public double getShippingCost() {
		return shippingCost;
	}

	/**
	 * Sets instance variable shippingCost to this parameter
	 * 
	 * @param shippingCost to set the shipping Cost
	 */
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	/**
	 * The default constructor sets name, category, price, weight, shippingCost to the current values.
	 */
	public PhysicalProduct(String name, String category, double price, double weight, double shippingCost) {
		super(name, category, price);
		this.weight = weight;
		this.shippingCost = shippingCost;
	}

	
	/**
	 * Returns a formatted string that displays the data of the physical product
	 * 
	 * @return a String value
	 */
	@Override
	public String toString() {
		return  String.format("Physical Product: \n" + "Name: %s, \n Category: %s, \n Price: %.2f, \n Weight: %.2f, \n Shipping Cost: %.2f \n" ,getName(),getCategory(),getPrice(),weight,shippingCost);
	}

	/**
	 * Returns a message about the product purchase status
	 * 
	 * @return a String value
	 */
	@Override
	public String purchaseProduct() {
		return "Your product is going to be shipped soon";
	}

}
