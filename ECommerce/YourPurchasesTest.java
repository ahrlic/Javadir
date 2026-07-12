/**
	 * Student Name: Ariana Hrlic
	 * Lab Professor: Amal Ibrahim
	 * Due Date: week 5
	 * Modified: 03/02/25
	 * Description: purchases Test class 
	 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest {

	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment.
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50; //Expecting 3.5 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
	    
		
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE individual TEST CASES 
		//  (NOT ALREADY STATED IN THIS CODE) TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	
	
	@Test 
	public void TestYourPurchases() {
		var purch = new YourPurchases();
		
		double result = purch.getPurchase();
		double expected = 0;
		
		Assert.assertEquals(expected, result, EPSILON);
		
		double result2 = purch.getPayment();
		
		Assert.assertEquals(expected, result2, EPSILON);
		
		
		
	}
	
	@Test 
	public void TestGetPurchase() {
		var purch = new YourPurchases();
		
		double result = purch.getPurchase();
		double expected = 0;
		
		Assert.assertEquals(expected, result, EPSILON);
		
	}
	
	@Test 
	public void TestGetPayment() {
		var purch = new YourPurchases();
		
		double result = purch.getPayment();
		double expected = 0;
		
		Assert.assertEquals(expected, result, EPSILON);
			
	}
	
	
	@Test
	public void TestRecordPurchases() {
		
		var purch = new YourPurchases();
		purch.recordPurchase(5);
		double result = purch.getPurchase();
		double expected = 5;
		Assert.assertEquals(expected,result,EPSILON);
		
	}

	@Test
	public void TestRecievePayment() {
		var purch = new YourPurchases();
		
		purch.receivePayment(2, 2, 0, 0, 0);
		double expected = 2.50;
		double result = purch.getPayment();
		
		Assert.assertEquals(expected, result, EPSILON);
		
		
	}
	
	
	@Test 
	public void TestGiveChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(3);
		aPurchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment.
		double changeResult = aPurchase.giveChange();
		double expected = 2; //Expecting 3.5 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
		
		
	}
	
	

}
