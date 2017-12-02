package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import uva.tds.pr2.equipo05.*;
import org.junit.Test;

/**
 * Implementacion de la clase de test de caja negra (incompleta) de la clase RedAutobuses
 * @author martorb
 * @author ismpere
 *
 */
public class RedAutobusesBlackBoxTest {
	
	private GD gd1 = new GD (-179.99,179.99);
	private GD gd2 = new GD (-178.99,178.99);
	private GD gd3 = new GD (-177.99,177.99);
	private GD gd4 = new GD (-176.99,176.99);
	private GD gd5 = new GD (-175.99,175.99);
	private GD gd6 = new GD (-174.99,174.99);
	
	private Parada p1,p2,p3,p4,p5,p6;
	private Parada p_1[] = {p1,p2,p3};
	private Parada p_2[] = {p2,p3,p4};
	private Parada p_3[] = {p4,p1,p2};
	
	private Linea l1, l2,l3;
	
	@Before
    public void setUp() throws Exception {
		
		p1= new Parada("1",gd1);
		p2= new Parada("2",gd2);
		p3= new Parada("3",gd3);
		l1= new Linea(1,p_1);
		l2= new Linea(2,p_2);
		l3= new Linea(3,p_3);
	}
	
	@After
	public void tearDown() throws Exception{
		p1= null;
		p2= null;
		p3= null;
		l1= null;
		l2= null;
		l3= null;
	}
	
	@Test (expected = AssertionError.class)
	public void testInicializaRedNoValidoSolo2Lineas() {
		
		Linea[] lista_lineas={l1};
		RedAutobuses red= new RedAutobuses(lista_lineas);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInicializaRedNoValidoSinListaLineas() {
		
		RedAutobuses red= new RedAutobuses(null);
		fail("Not yet implemented");
	}
	
	@Test
	public void testInicializaRedNoValidoLineasRepetidas() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetLineaNoValidoNoExisteEnRed(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddLineaNoValidoLineaNulo() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testDeleteLineaNoValidoLineaNulo() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDeleteLineaNoValidoLineaNoExisteEnRed() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
