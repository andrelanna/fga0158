package exemploTdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteDivisao {

	private Calculadora c;

	@Before
	public void setup() {
		c = new Calculadora(); 
	}
	
	@Test
	public void testDivisaoInteirosPositivos() {
		c.setOp1(1);
		c.setOp2(3);
		assertEquals(0, c.divisao());
	}
	
	@Test
	public void testDivisaoInteirosNegativos() {
		c.setOp1(-3);
		c.setOp2(-1);
		assertEquals(3, c.divisao());
	}
	
	@Test
	public void testDivisaoInteirosComplementares() {
		c.setOp1(1);
		c.setOp2(-1);
		assertEquals(-1, c.divisao());
	}

}
