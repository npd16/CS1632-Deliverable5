import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {
	
	private Cell c;

	@Test
	public void cellToStringAliveTest() {
		c = new Cell(true); //true is alive, false is not
		assertEquals("X",c.toString());
	}
	
	@Test
	public void cellToStringNotAliveTest() {
		c = new Cell(false); //true is alive, false is not
		assertEquals(".",c.toString());
	}
	
	@Test
	public void cellToStringTest(){
		c = new Cell();
		assertNotNull(c.toString());
		assertEquals(".",c.toString());
	}

}
