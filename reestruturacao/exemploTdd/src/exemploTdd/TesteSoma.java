package exemploTdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteSoma {

	private Calculadora c;

	@Before
	public void setup() {
		c = new Calculadora(); 
	}
	
	@Test
	public void testSomaInteirosPositivos() {
		c.setOp1(1);
		c.setOp2(3);
		assertEquals(4, c.soma());
	}
	
	@Test
	public void testSomaInteirosNegativos() {
		c.setOp1(-1);
		c.setOp2(-3);
		assertEquals(-4, c.soma());
	}
	
	@Test
	public void testSomaInteirosComplementares() {
		c.setOp1(1);
		c.setOp2(-1);
		assertEquals(0, c.soma());
	}
}
