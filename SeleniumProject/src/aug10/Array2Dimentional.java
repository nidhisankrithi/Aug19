package aug10;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array2Dimentional {
	@DataProvider
	public String[][] getData() {

		String [][] data=new String [2][3];
		data[0][0]="Banu";
		data[0][1]="Ram";
		data[0][2]="Manu";
		
		data[1][0]="Arun";
		data[1][1]="Anil";
		data[1][2]="Bye";
		return data;
	}
		
		@Test(dataProvider = "getData")
		public void sendEmail(String to, String sub, String id) {
		Reporter.log("To "+to+" Subject "+sub+" ID "+id,true);
		}
		}
