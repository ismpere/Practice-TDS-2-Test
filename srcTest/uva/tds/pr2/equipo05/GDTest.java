package uva.tds.pr2.equipo05;

import uva.tds.pr2.equipo05.GD;
import static org.junit.Assert.*;

import org.junit.Test;

public class GDTest {

	@Test
	public void testInicializaGDValido() {
		GD gd1 = new GD(-179.99, 179.99);
		
		assertEquals(gd1.getLatitud(), -179.99, 0.01);
		assertEquals(gd1.getLongitud(), 179.99, 0.01);
	}
	
	@Test
	public void testCalculaDistanciaEntreDosGDValido(){
		GD gd1 = new GD(-179.99, 179.99);
		GD gd2 = new GD(179.99, -179.99);
		
		assertEquals(GD.getDistanciaEntre(gd1, gd2), 200.00, 0.01); //TODO Es un valor aleatorio, comprobar al implementar
	}
	
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLatitudInferior(){
		GD gd1 = new GD(-180.00, 179.99);
	}
	
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLatitudSuperior(){
		GD gd1 = new GD(180.00, 179.99);
	}
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLongitudInferior(){
		GD gd1 = new GD(-179.99, -180.00);
	}
	
	@Test (expected = AssertionError.class)
	public void testInicializaGDNoValidoLongitudSuperior(){
		GD gd1 = new GD(179.99, 180.00);
	}
	

}
