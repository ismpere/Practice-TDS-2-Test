package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;
import uva.tds.pr2.equipo05.;
import org.junit.Test;

public class RedAutobusesTest {

	@Test
	public void testDosLineasCorrectas() { 
		Linea l1= new Linea("1");class
		Linea l2= new Linea("2");
		Linea[] lista_lineas={l1,l2};
		RedAutobuses red= new RedAutobuses(lista_lineas);
		
	}
	
	@Test
	public void testMenosDeDosLineas() { 
		Linea l1= new Linea();
		RedAutobuses red= new RedAutobuses({l1});
		
		fail("Not yet implemented");
	}
	
	@Test (expected = AssertionError.class)
	public void testIdentifLineasNoUnicos() {
		Linea l1= new Linea("1");
		Linea l2= new Linea("1");
		RedAutobuses red= new RedAutobuses({l1,l2});
		
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testDevuelveLineaQueExiste() {
		Linea l1= new Linea("1");
		RedAutobuses red= new RedAutobuses();
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
