package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	VendingMachineItem item;

	@Before
	public void setUp() throws Exception {
		item = new VendingMachineItem("Candy",2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVendingMachineItem() {
		assertNotNull(item);
		
	}

	@Test
	public void testGetName() {
		assertEquals(item.getName(), "Candy");
	}

	@Test
	public void testGetPrice() {
		double x = item.getPrice();
		assertEquals(x, 2,0.001);
	}

}
