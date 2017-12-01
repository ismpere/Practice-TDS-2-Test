package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class LineaTest {
	
	private GD gd1 = new GD (-179.99,179.99);
	private GD gd2 = new GD (-178.99,178.99);
	private GD gd3 = new GD (-177.99,177.99);
	private Parada p1, p2, p3;
	private Parada p[] = {p1, p2, p3};

	@Before
    public void setUp() throws Exception {
        p1 = new Parada("a", gd1);
        p2 = new Parada("b", gd2);
        p3 = new Parada("c", gd3);
    }
     
    @After
    public void tearDown() throws Exception {
        p1 = null;	
        p2 = null;	
        p3 = null;
        p = null;
    }
	
	@Test
	public void testInicializaLineaValido() {
		Linea l1 = new Linea("1", p);
		
		assertNotNull(l1);
		assertEquals("1", l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
	}
	
	@Test
	public void testSetParadaInicioValido(){
		Linea l1 = new Linea("1", p);
		
		GD gd4 = new GD(-150.00, 150.00);
		Parada p4 = new Parada("d", gd4);
		
		l1.setParadaInicio(p4);
		
		Parada pa2[] = {p4, p1, p2, p3};
		assertNotNull(l1);
		assertEquals("1", l1.getId());
		assertEquals(p4, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(pa2, l1.getParadas());
	}
	
	@Test
	public void testSetParadaFinValido(){
		Linea l1 = new Linea("1", p);
		
		GD gd4 = new GD(-150.00, 150.00);
		Parada p4 = new Parada("d", gd4);
		
		l1.setParadaFin(p4);
		
		Parada pa2[] = {p1, p2, p3, p4};
		assertNotNull(l1);
		assertEquals("2", l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p4, l1.getParadaFin());
		assertArrayEquals(pa2, l1.getParadas());
	}
	
	@Test
	public void testAñadeParadaIntermediaValido(){
		Linea l1 = new Linea("1", p);
		
		GD gd4 = new GD(-150.00, 150.00);
		Parada p4 = new Parada("d", gd4);
		
		l1.addParadaIntermedia(p4);
		
		Parada pa2[] = {p1, p4, p2, p3};
		assertNotNull(l1);
		assertEquals("1", l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(pa2, l1.getParadas());
	}
	
	@Test
	public void testAñadeParadaEnPosicionValido(){
		Linea l1 = new Linea("1", p);
		
		GD gd4 = new GD(-150.00, 150.00);
		Parada p4 = new Parada("d", gd4);
		
		l1.addParadaAt(p4, 3);
		
		Parada pa2[] = {p1, p2, p4, p3};
		assertNotNull(l1);
		assertEquals("1", l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(pa2, l1.getParadas());
	}
	
	@Test
	public void testEliminaParadaIntermediaValido(){
		GD gd4 = new GD(-150.00, 150.00);
		Parada p4 = new Parada("d", gd4);
		
		Parada pa2[] = {p1, p2, p4, p3};
		
		Linea l1 = new Linea("1", pa2);
		
		l1.removeParadaIntermedia(p4);
		
		assertNotNull(l1);
		assertEquals("1", l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
	}
}
