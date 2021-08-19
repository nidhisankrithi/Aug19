package aug10;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
public void TestA() {
//	Reporter.log("Excuting TestA ",true);
	Reporter.log("My Test Demo1 Hi");
	Reporter.log("My Test Demo1 Bye", false);
	Reporter.log("My Test Demo1 Tata", true);
	}
}
