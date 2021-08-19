package aug11;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubofBaseTest1 extends BaseTest{

	@Test
	public void test1()
	{
		Reporter.log("test1",true);
	}
	
}