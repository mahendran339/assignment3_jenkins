package jenkins;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class GstTest {
Gst Obj;
int a;

	@Before
	public void setUp() throws Exception {
		Obj=new Gst();
		
		 a=100;
		
	}

	@Test
	public void testMul() {
	assertEquals(111, Obj.mul(a, a));
	
	}

}
