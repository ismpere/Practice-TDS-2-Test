package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParadaTest {
	
	private static final double ERROR_ADMISIBLE = 0.01;
	private GD gd1;
	private Parada p1;
	
	@Before
    public void setUp() throws Exception {
        gd1 = new GD (-179.99,179.99);
    }
     
    @After
    public void tearDown() throws Exception {
        gd1 = null;
        p1 = null;
    }

	@Test
	public void testInicializaParadasValido() {
		p1 = new Parada(1, gd1);
		
		assertNotNull(p1);
		assertEquals(1,p1.getId());
		assertEquals(gd1,p1.getGD());
	}
	
	@Test
	public void testSetIDValido(){
		p1 = new Parada(1, gd1);
		
		p1.setId(2);
		
		assertNotNull(p1);
		assertEquals(2,p1.getId());
		assertEquals(gd1,p1.getGD());
	}
	
	@Test
	public void testSetGDValido(){
		p1 = new Parada(1, gd1);
		GD gd2 = new GD(179.99, -179.99);
		
		p1.setGD(gd2);
		
		assertNotNull(p1);
		assertEquals(2,p1.getId());
		assertEquals(gd2,p1.getGD());
	}
	
	@Test
	public void testCalculaDistanciaEntreParadasGDValido(){
		p1 = new Parada(1, gd1);
		GD gd2 = new GD(179.99, -179.99);
		Parada p2 = new Parada(2, gd2);
		
		double distancia = Parada.getDistanciaEntre(p1, p2);
		
		assertNotNull(p1);
		assertNotNull(p2);
		assertEquals(200.00, distancia, ERROR_ADMISIBLE); //TODO Es un valor aleatorio, comprobar al implementar
	}
	
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdCero(){
		p1 = new Parada(0, gd1);
	}
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdNegativo(){
		p1 = new Parada(-1, gd1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testInicializaParadaNoValidoGDNulo(){
		p1 = new Parada(1, null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculaDistanciaEntreParadasPrimeraNulo(){
		p1 = new Parada(1, gd1);
		Parada p2 = null;
		
		double distancia = Parada.getDistanciaEntre(p1, p2);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculaDistanciaEntreParadasSegundaNulo(){
		p1 = new Parada(1, gd1);
		Parada p2 = null;
		
		double distancia = Parada.getDistanciaEntre(p2, p1);
	}
	
}
