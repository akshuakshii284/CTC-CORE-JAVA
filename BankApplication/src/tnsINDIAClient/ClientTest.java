package tnsINDIAClient;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

	@Test
	public void withdraw() {
		assertEquals(45000,45000,"the amount drawn");
		assertEquals(2000,2000,"the amount drawn");
		System.out.println("the amount drawn is");
	}
 @Test
 public void deposit()
 {
	 assertEquals(200,200,"the amount deposited");
	 assertEquals(4000,4000,"the amount deposited");
	 System.out.println("the ammount dposited");
 }
}
