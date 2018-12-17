package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class FalseTest {

	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.addTest(5,5);
		int wrong = 15;
		Boolean isMatch = true;
		
		if(output == wrong){
			isMatch = true;
		}
		else {
			isMatch = false;
		}
		assertFalse(isMatch);
	}
}
