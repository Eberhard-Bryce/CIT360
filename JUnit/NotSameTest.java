package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotSameTest {

	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.addTest(5,5);
		int output2 = JunitTest.multiTest(5,5);
		assertNotSame(output, output2);
	}

}
