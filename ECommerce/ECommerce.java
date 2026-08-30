
public class ECommerce {
	
	
	public static void main(String []args) {
		
		PhysicalProduct physProduct = new PhysicalProduct("Nissan Altama", "cars", 13000, 2000, 1500);
		DigitalProduct digiProduct = new DigitalProduct("Nissan Altama Picture", "Photo of car", 10.0, 1.2, "download");
		
		
		System.out.println(physProduct.toString() + physProduct.purchaseProduct() + "\n");
		
		
		System.out.println(digiProduct.toString() + digiProduct.purchaseProduct());
	
	
	
		
	}

}
