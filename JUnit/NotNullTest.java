package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotNullTest {

	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.addTest(5,5);
		@SuppressWarnings("unused")
		String display;
		if(output == 10){
			display = "Correct!";
		}
			assertNotNull(output);
	}

}
