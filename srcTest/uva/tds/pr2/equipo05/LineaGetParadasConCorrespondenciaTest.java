package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineaGetParadasConCorrespondenciaTest {
	
	private GD gd1 = new GD (-179.99,179.99);
	private GD gd2 = new GD (-178.99,178.99);
	private GD gd3 = new GD (-177.99,177.99);
	private Parada p1, p2, p3;
	private Parada p[] = {p1, p2, p3};
	private Linea l1;
	
	@Before
    public void setUp() throws Exception {
        p1 = new Parada("a", gd1);
        p2 = new Parada("b", gd2);
        p3 = new Parada("c", gd3);
        l1 = new Linea(1, p);
    }
     
    @After
    public void tearDown() throws Exception {
        p1 = null;	
        p2 = null;	
        p3 = null;
        p = null;
        l1 = null;
    }
    
    @Test
	public void testGetParadasConCorrespondenciaUnaParadaConCorrespondenciaValido(){
    	
    	GD gd4 = new GD(-100.00, 100.00);
    	Parada p4 = new Parada("d", gd4);
    	GD gd5 = new GD(-110.00, 110.00);
    	Parada p5 = new Parada("d", gd5);
		
		Parada pa3[] = {p1, p4, p5}; //TODO son paradas aleatorias, poner paradas que lo cumplan
		Linea l2 = new Linea(2, pa3);
		
		Parada pcc[] = l1.getParadasConCorrespondencia(l2);
		
		assertNotNull(l1);
		assertNotNull(pcc);
		assertTrue(l1.existeCorrespondencia(l2));
		assertEquals(1, pcc.length);
		assertEquals(p1, pcc[0]);
		assertEquals(1, l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
	}
	
	@Test
	public void testGetParadasConCorrespondenciaVariasParadasConCorrespondenciaValido(){
		
		GD gd4 = new GD(-100.00, 100.00);
    	Parada p4 = new Parada("d", gd4);
		
		Parada pa3[] = {p1, p4, p3}; //TODO son paradas aleatorias, poner paradas que lo cumplan
		Linea l2 = new Linea(2, pa3);
		
		Parada pcc[] = l1.getParadasConCorrespondencia(l2);
		
		Parada pa4[] = {p1, p3};
		
		assertNotNull(l1);
		assertNotNull(pcc);
		assertTrue(l1.existeCorrespondencia(l2));
		assertEquals(2, pcc.length);
		assertEquals(1, l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
		assertArrayEquals(pa4, pcc);
	}
	
	@Test
	public void testGetParadasConCorrespondenciaNingunaParadaConCorrespondenciaValido(){
		
		GD gd4 = new GD(-100.00, 100.00);
    	Parada p4 = new Parada("d", gd4);
    	GD gd5 = new GD(-110.00, 110.00);
    	Parada p5 = new Parada("d", gd5);
    	GD gd6 = new GD(-115.00, 115.00);
    	Parada p6 = new Parada("d", gd6);
		
		Parada pa3[] = {p4, p5, p6}; //TODO son paradas aleatorias, poner paradas que lo cumplan
		Linea l2 = new Linea(2, pa3);
		
		Parada pcc[] = l1.getParadasConCorrespondencia(l2);
		
		assertNotNull(l1);
		assertNotNull(pcc);
		assertFalse(l1.existeCorrespondencia(l2));
		assertEquals(0, pcc.length);
		assertEquals(1, l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetParadasConCorrespondenciaNoValidoLineaNulo(){
		l1.getParadasConCorrespondencia(null);
	}
	
	@Test (expected = AssertionError.class)
	public void testGetParadasConCorrespondenciaNoValidoLineaIgual(){
		l1.getParadasConCorrespondencia(l1);
	}

}
