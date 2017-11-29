package uva.tds.pr2.equipo05;

import uva.tds.pr2.equipo05.GD;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Implementacion de la clase de Test para GD
 * @author ismpere
 * @author martorb
 */
public class GDTest {
	
	private final double ERROR_ADMISIBLE = 0.01;
	
	@Test
	public void testInicializaGDValido() {
		GD gd1 = new GD(-179.99, 179.99);
		
		assertNotNull(gd1);
		assertEquals(-179.99, gd1.getLatitud(), ERROR_ADMISIBLE);
		assertEquals(179.99, gd1.getLongitud(), ERROR_ADMISIBLE);
	}
	
	@Test
	public void testCalculaDistanciaEntreDosGDValido(){
		GD gd1 = new GD(-179.99, 179.99);
		GD gd2 = new GD(179.99, -179.99);
		
		assertNotNull(gd1);
		assertNotNull(gd2);
		assertEquals(200.00, GD.getDistanciaEntre(gd1, gd2), ERROR_ADMISIBLE); //TODO Es un valor aleatorio, comprobar al implementar
	}
	
	@Test
	public void testSetLatitudSetLongitudValido(){
		GD gd1 = new GD(-179.99, 179.99);
		
		gd1.setLatitud(-178.99);
		gd1.setLongitud(178.99);
		
		assertNotNull(gd1);
		assertEquals(-178.99, gd1.getLatitud(), ERROR_ADMISIBLE);
		assertEquals(178.99, gd1.getLongitud(), ERROR_ADMISIBLE);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInicializaGDNoValidoLatitudNulo(){
		GD gd1 = new GD((Double)null, 179.99);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testInicializaGDNoValidoLongitudNulo(){
		GD gd1 = new GD(-179.99, (Double)null);
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
	@Test (expected = AssertionError.class)
	public void testSetLatitudNoValidoLatitudInferior(){
		GD gd1 = new GD(-179.99, 179.99);
		
		gd1.setLatitud(-180.00);
	}
	@Test (expected = AssertionError.class)
	public void testSetLatitudNoValidoLatitudSuperior(){
		GD gd1 = new GD(-179.99, 179.99);
		
		gd1.setLatitud(180.00);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSetLatitudNoValidoLatitudNulo(){
		GD gd1 = new GD(-179.99, 179.99);
		
		gd1.setLatitud((Double)null);
	}
	@Test (expected = AssertionError.class)
	public void testSetLongitudNoValidoLongitudInferior(){
		GD gd1 = new GD(-179.99, 179.99);
		
		gd1.setLongitud(-180.00);
	}
	@Test (expected = AssertionError.class)
	public void testSetLongitudNoValidoLongitudSuperior(){
		GD gd1 = new GD(-179.99, 179.99);
		
		gd1.setLongitud(180.00);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSetLongitudNoValidoLongitudNulo(){
		GD gd1 = new GD(-179.99, 179.99);
		
		gd1.setLongitud((Double)null);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalculaDistanciaEntreDosGDNoValidoPrimeroNulo(){
		GD gd1 = null;
		GD gd2 = new GD(179.99, -179.99);
		
		GD.getDistanciaEntre(gd1, gd2);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testCalculaDistanciaEntreDosGDNoValidoSegundoNulo(){
		GD gd1 = new GD(-179.99, 179.99);
		GD gd2 = null;
		
		GD.getDistanciaEntre(gd1, gd2);
	}
}
