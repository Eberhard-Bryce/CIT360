package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitAdd {

	
	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.addTest(20, 5);
				assertEquals(25, output);
	}

}
