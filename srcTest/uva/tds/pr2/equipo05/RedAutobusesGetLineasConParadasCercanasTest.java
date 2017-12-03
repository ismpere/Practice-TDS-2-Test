package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import uva.tds.pr2.equipo05.*;
import org.junit.Test;

/**
 * Implementacion de la clase de test específico del método getLineasConParadasCercanas de RedAutobuses
 * @author ismpere
 * @author martorb
 */
public class RedAutobusesGetLineasConParadasCercanasTest{
	
	private GD gd1 = new GD (-179.00,179.00); 
	private GD gd2 = new GD (-179.00,179.01); //1km dif aprox
	private GD gd3 = new GD (-177.00,177.00);
	private GD gd4 = new GD (-177.01,177.01); //1km dif aprox
	private GD gd5 = new GD (-175.99,175.99);
	private GD gd6 = new GD (-174.99,174.99);
	
	private Parada p1,p2,p3,p4,p5,p6;
	private Parada p_1[] = {p1,p2,p3};
	private Parada p_2[] = {p2,p3,p4};
	private Parada p_3[] = {p4,p1,p2};
	
	private Linea l1, l2,l3;
	
	@Before
	public void setUp(){
		p1= new Parada("1",gd1);
		p2= new Parada("2",gd2); 
		p3= new Parada("3",gd3);
		l1= new Linea(1,p_1);
		l2= new Linea(2,p_2);
		l3= new Linea(3,p_3);
	}
	
	@After
	public void tearDown(){
		p1= null;
		p2= null;
		p3= null;
		l1= null;
		l2= null;
		l3=null;
	}
	
	
	
	@Test
	public void testGetLineasConParadasCercanasValido1LineaCercana(){
		GD gd_busq= new GD(-179.00,179.01);  //pos cercana a p1 pert. a l1
		Linea[] lista_lineas={l1,l2};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		Linea[] lineas_cercanas=red.getLineasConParadasCercanas(gd_busq, 200.00);
		
		assertNotNull(red);
		assertTrue(red.contains(l1));
		assertTrue(red.contains(l2));
		assertTrue(lineas_cercanas.length==1);
		assertFalse(RedAutobuses.lineasRepetidas(lista_lineas));
		assertFalse(RedAutobuses.lineasRepetidas(lineas_cercanas));
		assertTrue(lineas_cercanas[0].equals(l1));
	}
	
	
	
	
	
	
	
	
	
	
}