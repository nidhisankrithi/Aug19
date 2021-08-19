package p1;



import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searching {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Please Enter Option to Search");
		Scanner sc=new Scanner(System.in);
		String expected=sc.nextLine();
		System.out.println("Searching");
		
		
//		String expected="Lunch";
      	String msg=expected+" not found";
		WebDriver driver=new ChromeDriver();
//		value
		driver.get("file:///C:/Users/Win8/Desktop/ListBox2.html");
		driver.get("file:///D:/Java/ListBox2.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		int count=allOptions.size();
		for(int i=0;i<count;i++)
		{
			String actual=allOptions.get(i).getText();
			if(actual.equals(expected))
			{
				msg=actual+" is found at:"+i;
				break;
			}

		}
		
		System.out.println(msg);
		driver.close();
		
	}

}
