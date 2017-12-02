package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.Test;

public class GDBlackBoxTest {

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
	public void testCalculaDistanciaEntreDosGDNoValidoGDNulo(){
		GD gd1 = new GD(179.99, -179.99);
		GD gd2 = null;
		
		gd1.getDistanciaAt(gd2);
	}

}
