package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParadaTest {
	
	private GD gd1;
	
	@Before
    public void setUp() throws Exception {
        gd1 = new GD (-179.99,179.99);
    }
     
    @After
    public void tearDown() throws Exception {
        gd1 = null;
    }

	@Test
	public void testInicializaParadasValido() {
		Parada p1= new Parada(1, gd1);
		
		assertNotNull(p1);
		assertEquals(1,p1.getId());
		assertEquals(gd1,p1.getGD());
	}
	
	@Test
	public void testSetIDValido(){
		Parada p1= new Parada(1, gd1);
		
		p1.setId(2);
		
		assertNotNull(p1);
		assertEquals(2,p1.getId());
		assertEquals(gd1,p1.getGD());
	}
	
	@Test
	public void testSetGDValido(){
		Parada p1= new Parada(1, gd1);
		GD gd2 = new GD(179.99, -179.99);
		
		p1.setGD(gd2);
		
		assertNotNull(p1);
		assertEquals(2,p1.getId());
		assertEquals(gd2,p1.getGD());
	}
	
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdCero(){
		Parada p1 = new Parada(0, gd1);
	}
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdNegativo(){
		Parada p1 = new Parada(-1, gd1);
	}
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoGDNulo(){
		Parada p1 = new Parada(1, null);
	}
	
}
