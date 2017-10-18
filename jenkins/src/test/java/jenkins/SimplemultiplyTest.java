package jenkins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimplemultiplyTest {
	Simplemultiply Obj;
	int a, b;
	@Before
	public void setUp() throws Exception {a=2;
	b=4;
	Obj = new Simplemultiply();

	}

	@Test
	public void test() {
		assertEquals (8, Obj.mul(a, b));
	}

}
