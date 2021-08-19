package aug11;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority = 2)
	public void registerUser()//FAIL
	{
		Reporter.log("registerUser",true);
	Assert.fail();
	}
	
	@Test(priority = 1, dependsOnMethods = {"registerUser"})
	public void deleteUser()//SKIP
	{
		Reporter.log("deleteUser",true);
	}
}
