package uva.tds.pr2.equipo05;

import uva.tds.pr2.equipo05.GD;
import static org.junit.Assert.*;

import org.junit.Test;

public class GDTest {

	@Test
	public void testInicializaGDValido() {
		GD gd1 = new GD(-180.00, 180.00);
		
		assertEquals(gd1.getLatitud(), -180.00, 0.01);
		assertEquals(gd1.getLongitud(), 180.00, 0.01);
	}
	
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLatitudInferior(){
		GD gd1 = new GD(-180.01, 180.00);
	}
	
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLatitudSuperior(){
		GD gd1 = new GD(180.02, 180.00);
	}
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLongitudInferior(){
		GD gd1 = new GD(-180.00, -180.01);
	}
	
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLongitudSuperior(){
		GD gd1 = new GD(180.00, 180.01);
	}

}
