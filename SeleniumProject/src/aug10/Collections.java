package aug10;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Collections {
@DataProvider
public Iterator<String[]> getData() {
ArrayList<String []> data = new ArrayList<String []>();
String [] s1= {"A1","A2","A3"};
data.add(s1);
String [] s2= {"B1","B2","B3"};
data.add(s2);
Iterator<String []> iData = data.iterator();
return iData;
}
@Test(dataProvider = "getData")
public void sendEmail(String s1, String s2, String s3) {
Reporter.log("-----",true);
Reporter.log(s1,true);
Reporter.log(s2,true);
Reporter.log(s3,true);
Reporter.log("-----",true);
}
}
