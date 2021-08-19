package aug11;



import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeClass
	  public void beforeClass() {
		 Reporter.log("BC",true);
	  }

	  @AfterClass
	  public void afterClass() {
		  
		  Reporter.log("AC",true);
	  }

	  
	  @BeforeMethod//execute this method before each TestMethod(@Test) iteration
	  public void beforeMethod() {
		  Reporter.log("BM",true);
	  }

	  @AfterMethod//execute this method after each TestMethod(@Test) iteration
	  public void afterMethod() {
		  Reporter.log("AM",true);
	  }
	  
	@Test
	public void testA()
	{
		Reporter.log("testA",true);
	}
	
	@Test(invocationCount = 2)
	public void testB()
	{
		Reporter.log("testB",true);
	}
}
