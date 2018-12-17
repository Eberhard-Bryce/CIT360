package testing;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ThatTest {
	
	@Test
	public void test() {
		@SuppressWarnings("unused")
		JunitTest test = new JunitTest();
		int output = JunitTest.addTest(2, 2);
		boolean result;
		if (output == 4)
			result = true;
		else{
			result = false;
		}
		assertThat(result,is(true));
	}

}
