package exemploTdd;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;



@RunWith(Parameterized.class)
public class TestesParametrizados {

	private int op1, 
	            op2, 
	            rSoma, 
	            rDivisao;
	private Calculadora c;
	
	
	public TestesParametrizados(int op1, int op2, int rSoma, int rDivisao) {
		this.op1 = op1; 
		this.op2 = op2; 
		this.rSoma = rSoma;
		this.rDivisao = rDivisao;
	}
	
	
	@Before
	public void setup() {
		c = new Calculadora();
		c.setOp1(op1);
		c.setOp2(op2);
	}
	
	@Parameters
	public static List<Object[]> getParameters() {
		Object[][] parametros = new Object[][] {
			{ 1,  3,  4,  0}, 
			{-3, -1, -4,  3}, 
			{ 1, -1,  0, -1}, 
			{ 3, -1,  2, -3}, 
			{-3,  1, -2, -3}
		};
		return Arrays.asList(parametros);
	}
	
	@Test
	public void testSoma() {
		assertEquals(rSoma, c.soma());
	}
	
	@Test
	public void testDivisao() {
		assertEquals(rDivisao, c.divisao());
	}

}
