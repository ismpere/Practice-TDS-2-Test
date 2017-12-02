package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Implementacion de los test para el metodo getParadasCercanas
 * @author ismael
 * @author martorb
 */
public class LineaGetParadasCercanasTest {
	
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
	public void testGetParadasCercanasUnaParadaCercanaValido(){
		
		GD gd4 = new GD(-150.00, 150.00); //TODO son ubicaciones aleatorias, poner una valida que lo cumpla
		
		Parada pa2[] = l1.getParadasCercanas(gd4);
		
		assertNotNull(l1);
		assertNotNull(pa2);
		assertTrue(l1.existeParadasCercanas(gd4));
		assertEquals(1, pa2.length);
		assertEquals(p2, pa2[0]);
		assertEquals(1, l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
	}
	
	@Test
	public void testGetParadasCercanasVariasParadasCercanasValido(){
		
		GD gd4 = new GD(-140.00, 140.00); //TODO son ubicaciones aleatorias, poner una valida que lo cumpla
		
		Parada pa2[] = l1.getParadasCercanas(gd4);
		
		Parada pa3[] = {p2, p3};
		
		assertNotNull(l1);
		assertNotNull(pa2);
		assertTrue(l1.existeParadasCercanas(gd4));
		assertEquals(2, pa2.length);
		assertEquals(1, l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
		assertArrayEquals(pa3, pa2);
	}
	
	@Test
	public void testGetParadasCercanasNingunaParadaCercanaValido(){
		
		GD gd4 = new GD(-130.00, 130.00); //TODO son ubicaciones aleatorias, poner una valida que lo cumpla
		
		Parada pa2[] = l1.getParadasCercanas(gd4);
		
		assertNotNull(l1);
		assertNotNull(pa2);
		assertFalse(l1.existeParadasCercanas(gd4));
		assertEquals(0, pa2.length);
		assertEquals(1, l1.getId());
		assertEquals(p1, l1.getParadaInicio());
		assertEquals(p3, l1.getParadaFin());
		assertArrayEquals(p, l1.getParadas());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testGetParadasCercanasNoValidoGDNulo(){
		l1.getParadasCercanas(null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testExistenParadasCercanasNoValidoGDNulo(){
		l1.existeParadasCercanas(null);
	}

}
