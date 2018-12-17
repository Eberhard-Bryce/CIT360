package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrueTest {

	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.multiTest(5,5);
		int right = 25;
		Boolean isMatch = false;
		
		if(output == right){
			isMatch = true;
		}
		else {
			isMatch = false;
		}
		assertTrue(isMatch);
	}

}
