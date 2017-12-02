package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParadaBlackBoxTest {
	
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

	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdVacio(){
		p1 = new Parada("", gd1);
	}
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdGrande(){
		p1 = new Parada("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco+", gd1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testInicializaParadaNoValidoIdNulo(){
		p1 = new Parada(null, gd1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testInicializaParadaNoValidoGDNulo(){
		p1 = new Parada("a", null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculaDistanciaEntreParadasPrimeraNulo(){
		p1 = new Parada("a", gd1);
		Parada p2 = null;
		
		p1.getDistanciaEntre(p2);
	}
	@Test(expected = AssertionError.class)
	public void testSetIdNoValidoIdVacio(){
		p1 = new Parada("a", gd1);
		p1.setId("");
	}
	@Test(expected = AssertionError.class)
	public void testSetIdNoValidoIdGrande(){
		p1 = new Parada("a", gd1);
		p1.setId("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco+");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetIdNoValidoIdNulo(){
		p1 = new Parada("a", gd1);
		p1.setId(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetGDNoValidoGDNulo(){
		p1 = new Parada("1", gd1);
		
		p1.setGD(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testExistenParadasIgualesNoValidoParadasNulo(){
		
		Parada.existeAlgunaParadaRepetida(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testExistenParadasIgualesNoValidoUnaParadaNulo(){
		Parada pa2[] = {null};
		
		Parada.existeAlgunaParadaRepetida(pa2);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testExistenParadasIgualesNoValidoAlgunaParadaNulo(){
		Parada pa2[] = {p1, null};
		
		Parada.existeAlgunaParadaRepetida(pa2);
	}
}
