package uva.tds.pr2.equipo05;

import uva.tds.pr2.equipo05.GD;
import static org.junit.Assert.*;

import org.junit.Test;

public class GDTest {

	@Test
	public void testInicializaGDValido() {
		GD gd1 = new GD(-180.00, 180.00);
		
		assertEquals(gd1.getLatitud(), -180.00);
		assertEquals(gd1.getLongitud(), 180.00);
	}

}
