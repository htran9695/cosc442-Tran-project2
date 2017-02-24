package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	VendingMachineItem item;
	VendingMachine theMachine;
	@Before
	public void setUp() throws Exception {
		item = new VendingMachineItem("Candy",2);
		theMachine= new VendingMachine();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddItem() {
		assert(theMachine.addItem(item, "A"));
		
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertMoney() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakePurchase() {
		fail("Not yet implemented");
	}

	@Test
	public void testReturnChange() {
		fail("Not yet implemented");
	}

}
