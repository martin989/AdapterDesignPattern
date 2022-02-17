import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CarSpecTest {

	private final CarSpec carspec = new CarSpec(100, 110, "GMC", "Acadia", "2022", 10.2);
	

	@Test
	void testGetMaxSpeed() {		
		 Assert.assertEquals(110, carspec.getMaxSpeed());
	}

	@Test
	void testGetfullCarname() {
		Assert.assertEquals("2022 GMC Acadia", carspec.getfullCarname());
	}

	@Test
	void testGetCarFuelCap() {
		Assert.assertEquals(10.2, carspec.getCarFuelCapacity());
	}

}
