package UnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Simori.ChangeVelocity;
import Simori.GUI;

public class ChangeVelocityModeTest {
	
	private GUI a;
	private final int CHANGEVELOCITYMODE = 3;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new GUI();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a.setVisible(false);
		a.dispose();
	}

	/**
	 * Test method for setTempVelocity(int, int).
	 * Tests a normal use of the method
	 * @author Mihai Bratosin
	 */
	@Test
	public final void testSetTempVelocity() {
		GUI.setCurrentMode(CHANGEVELOCITYMODE);
		ChangeVelocity.setTempVelocity(1, 1);
		assertEquals(ChangeVelocity.getTempVelocity(),17);
	}
	/**
	 * Test method for setTempVelocity(int, int).
	 * Tests the method in the case where the button pressed
	 * represents a value bigger than 128 (maximum velocity).
	 * Temporary velocity should not be set.
	 * @author Mihai Bratosin
	 */
	@Test
	public final void testSetTempVelocityBiggerThanMax() {
		GUI.setCurrentMode(CHANGEVELOCITYMODE);
		ChangeVelocity.setTempVelocity(14, 15);
		assertEquals(ChangeVelocity.getTempVelocity(),0);
	}


	
	
}