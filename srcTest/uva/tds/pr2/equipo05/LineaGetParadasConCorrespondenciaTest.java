package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineaGetParadasConCorrespondenciaTest {
	
	private GD gd1 = new GD (-179.99,179.99);
	private GD gd2 = new GD (-178.99,178.99);
	private GD gd3 = new GD (-177.99,177.99);
	private Parada p1, p2, p3;
	private Parada p[] = {p1, p2, p3};
	private Parada pa2[] = {p1, p3, p2};
	private Linea l1, l2;
	
	@Before
    public void setUp() throws Exception {
        p1 = new Parada("a", gd1);
        p2 = new Parada("b", gd2);
        p3 = new Parada("c", gd3);
        l1 = new Linea(1, p);
        l2 = new Linea(2, pa2);
    }
     
    @After
    public void tearDown() throws Exception {
        p1 = null;	
        p2 = null;	
        p3 = null;
        p = null;
        l1 = null;
        l2 = null;
    }
    
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
