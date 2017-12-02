package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import uva.tds.pr2.equipo05.*;
import org.junit.Test;
/**
 * Implementacion de la clase de test de RedAutobuses
 * @author ismael
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
	
	private Linea l1, l2;

	@Before
    public void setUp() throws Exception {
		
		Parada p1= new Parada("1",gd1);
		Parada p2= new Parada("2",gd2);
		Parada p3= new Parada("3",gd3);
		Linea l1= new Linea(1,p_1);
		Linea l2= new Linea(2,p_2);
	}
	
	@After
	public void tearDown() throws Exception{
		Parada p1= null;
		Parada p2= null;
		Parada p3= null;
		Linea l1= null;
		Linea l2= null;
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
	public void testMenosDeDosLineas() { 
		
		Linea[] lista_lineas={l1};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		
		fail("Not yet implemented");
	}
	
	@Test (expected = AssertionError.class)
	public void testIdentifLineasNoUnicos() {
		
		Linea[] lista_lineas={l1,l1};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testDevuelveLineaQueExiste() {
		
		Linea[] lista_lineas={l1,l2};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		Linea copia_l1=red.getLinea("1");
		
		assertEquals(l1,copia_l1);
	}
	
	@Test
	public void testNoDevuelveLineaPorqueNoExiste() {
		RedAutobuses red= new RedAutobuses();
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testNuevaLineaConExito() {
		RedAutobuses red= new RedAutobuses();
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testNuevaLineaNoValida(){ 
		RedAutobuses red= new RedAutobuses();
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testListaDeLineasCorrecta(){
		RedAutobuses red= new RedAutobuses();
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testBuscadorDeParadasEncuentra(){
		RedAutobuses red= new RedAutobuses();
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testBuscadorDeParadasNoEncuentra(){
		RedAutobuses red= new RedAutobuses();
		
		fail("Not yet implemented");
	}

	
}
