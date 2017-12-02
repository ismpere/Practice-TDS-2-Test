package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import uva.tds.pr2.equipo05.*;
import org.junit.Test;
/**
 * Implementacion de la clase de test de RedAutobuses
 * @author ismpere
 * @author martorb
 */
public class RedAutobusesTDDTest {

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
		l3=null;
	}
	
	@Test
	public void testInicializaRedValido() { 
		
		Linea[] lista_lineas={l1,l2};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		
		assertNotNull(red);
		assertEquals(l1,red.getLinea(1));
		assertEquals(l2,red.getLinea(2));
	}
	
	@Test
	public void testAddLineaValido(){
		
		Linea[] lista_lineas={l1,l2};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		red.addLinea(l3);
		
		assertNotNull(red);
		assertEquals(l1,red.getLinea(1));
		assertEquals(l2,red.getLinea(2));
		assertEquals(l3,red.getLinea(3));
		
	}
	
	@Test
	public void testDeleteLineaValido() {
		Linea[] lista_lineas={l1,l2,l3};
		Linea[] lista_lineas2={l1,l2};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		red.deleteLinea(l3);
		
		assertNotNull(red);
		assertEquals(l1,red.getLinea(1));
		assertEquals(l2,red.getLinea(2));
		assertArrayEquals(lista_lineas2,lista_lineas);
		
		fail("Not yet implemented");
	}


	@Test
	public void testGetAllLineasValido() {
		Linea[] lista_lineas={l1,l2};
		Linea[] lista_lineas2;
		RedAutobuses red= new RedAutobuses(lista_lineas);
		lista_lineas2=red.getAllLineas();
		
		assertNotNull(red);
		assertArrayEquals(lista_lineas2,lista_lineas);
	}
	
}
