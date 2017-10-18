package jenkins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperatorTest {
	Operator Obj;
	int a, b;

	@Before
	public void setUp() throws Exception {
		a=2;
		b=4;
		Obj = new Operator();
	}

	@Test
	public void test() {
	assertEquals (6, Obj.add(a, b));
	}

}
