package aug10;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayListDemo {
	@DataProvider
	public Iterator<String[]> getData() {
	ArrayList<String []> data = new ArrayList<String []>();
	String [] s1= {"A1"};
	data.add(s1);
	String [] s2= {"B1","B2"};
	data.add(s2);
	String [] s3= {"C1","C2","C3"};
	data.add(s3);
	Iterator<String []> iData = data.iterator();
	return iData;
	}
	@Test(dataProvider = "getData")
	public void sendEmail(String...s) { // var arg concept
	Reporter.log("-----",true);
	for(String v:s) {
	System.out.println(v);
	}
	Reporter.log("-----",true);
	}
	}

