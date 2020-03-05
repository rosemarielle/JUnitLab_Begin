package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest {
	@Test
	public void getIssuingStore() {
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	@Test
	public void deduct() {
		double amount;
		String result;
		
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		amount = 50.00;
		balance -= amount;
		
		result = "Remaining Balance: " + String.format("%6.2f",
                Math.abs(balance));
		
		assertEquals("deduct(amount)", result, card.deduct(amount));
	}
}