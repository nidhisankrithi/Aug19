package aug10;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityOrder {
	
	final int i=1;
	@Test(priority = i)
public void TestC()
{
		Reporter.log("Test C",true);
		
}

	@Test(priority = 2)
	public void TestA()
	{
			Reporter.log("Test A",true);
			
	}
	@Test(priority = -3)
	public void TestB()
	{
			Reporter.log("Test B",true);
			
	}
}
