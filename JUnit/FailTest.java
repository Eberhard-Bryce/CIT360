package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class FailTest {

	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.addTest(5,5);
			assertNotNull(output);
	}

}
