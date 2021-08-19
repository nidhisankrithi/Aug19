package aug10;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ObjectType {
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[3][2];
	data[0][0]="Ankith";
	data[0][1]=896;
	data[1][0]="Anil";
	data[1][1]=123;
	data[2][0]="Arjun";
	data[2][1]=789;
	return data;
}
@Test(dataProvider="getData")
public void sendEmail(String name,int id) {
	Reporter.log("Name"+name+"ID"+id);
}
}
