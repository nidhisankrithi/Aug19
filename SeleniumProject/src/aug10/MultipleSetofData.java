package aug10;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleSetofData {
@DataProvider
public String[] getData() {
String[] data = {"Bhanu","Prakash","Ankith"};
return data;
}

@Test(dataProvider = "getData")
public void sendEmail(String s) {
Reporter.log("To "+s,true);
Reporter.log("Click Send",true);
}
}

