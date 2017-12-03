package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Implementacion de la clase de test de secuencia de Linea
 * @author ismpere
 * @author martorb
 */
public class LineaSecuenceTest {

	private GD gd1 = new GD (-179.99,179.99); //TODO las direcciones hay que ajustarlas, son aleatorias
	private GD gd2 = new GD (-178.99,178.99);
	private GD gd3 = new GD (-177.99,177.99);
	private Parada p1, p2, p3;

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
    }
    
	@Test
	public void testLineaSecuenciaEliminarParadaValido() {
		GD gd4 = new GD(-160.00,160.00);
		Parada p4 = new Parada("d", gd4);
		
		Parada p[] = {p1,p2,p3,p4};
		Linea l1 = new Linea(1, p);
		
		l1.removeParadaIntermedia(p2);
	}
	
	@Test (expected = AssertionError.class)
	public void testLineaSecuenciaEliminarParadaNoValido() {
		GD gd4 = new GD(-160.00,160.00);
		Parada p4 = new Parada("d", gd4);
		
		Parada p[] = {p1,p2,p3,p4};
		Linea l1 = new Linea(1, p);
		
		l1.removeParadaIntermedia(p2);
		l1.removeParadaIntermedia(p3);
	}
}
