package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineaTest {
	
	private GD gd1 = new GD (-179.99,179.99);
	private GD gd2 = new GD (-178.99,178.99);
	private GD gd3 = new GD (-177.99,177.99);
	private Parada p1, p2, p3;

	@Before
    public void setUp() throws Exception {
        p1 = new Parada("1", gd1);
        p2 = new Parada("2", gd2);
        p3 = new Parada("3", gd3);
    }
     
    @After
    public void tearDown() throws Exception {
        p1 = null;	
        p2 = null;	
        p3 = null;
    }
	
	@Test
	public void testInicializaLineaValido() {
		Parada p[] = {p1,p2,p3};
		Linea l1 = new Linea("1", p);
		
		assertNotNull(l1);
		assertEquals("1", l1.getId());
		assertEquals(p, l1.getParadas());
	}

}
