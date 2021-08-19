package aug10;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTimesCallingMethod {
@Test(invocationCount=5)
public void TestA()
{
	Reporter.log("Test A",true);
}
}
