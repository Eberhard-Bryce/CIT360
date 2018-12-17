package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JunitAdd.class, multiplyTest.class, NotNullTest.class
	, FailTest.class, FalseTest.class, NotSameTest.class, ThatTest.class, TrueTest.class})
public class AllTests {

}
