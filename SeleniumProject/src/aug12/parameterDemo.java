package aug12;



import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterDemo {

	@Parameters({"city","pin"})
	@Test
	public void testA(String s,@Optional("56001")String a)
	{
		Reporter.log(s,true);
		Reporter.log(a,true);
	}
}
