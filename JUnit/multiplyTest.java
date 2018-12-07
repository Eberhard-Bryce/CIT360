package testing;

import static org.junit.Assert.*;

import org.junit.Test;
public class multiplyTest {

	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.multiTest(5, 5);
				assertEquals(25, output);
	}

}
