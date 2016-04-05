import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainPanelTest {
	
	int size = 15;
	private MainPanel mp;
	
	@BeforeClass
	public void setUp(){
		mp = new MainPanel(size);
	}
	
	@Test
	public void convertToIntTest() {
		int n = 42;
		assertEquals(mp.convertToInt(n),n);
	}
	
	@Test public void convertToIntMinTest() { //Edge case
		int n = Integer.MIN_VALUE;
		assertEquals(mp.convertToInt(n),n);
	}
	
	@Test public void convertToIntMaxTest() { //Edge case
		int n = Integer.MAX_VALUE;
		assertEquals(mp.convertToInt(n),n);
	}

}
