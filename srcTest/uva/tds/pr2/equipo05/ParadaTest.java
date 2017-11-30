package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParadaTest {

	@Test
	public void testInicializaParadasValido() {
		GD gd1= new GD (-179.99,179.99);
		Parada p1= new Parada(1, gd1);
		
		assertNotNull(p1);
		assertEquals(1,p1.getId());
		assertEquals(gd1,p1.getGD());
	}
	
	@Test
	public void testSetIDValido(){
		GD gd1= new GD (-179.99,179.99);
		Parada p1= new Parada(1, gd1);
		
		p1.setId(2);
		
		assertNotNull(p1);
		assertEquals(2,p1.getId());
		assertEquals(gd1,p1.getGD());
	}
}
