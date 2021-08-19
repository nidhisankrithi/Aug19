package p1;






import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//print list box content in sorted order
//check if list box has any duplicate options
//print list box content in reverse sorted order
public class Deselecting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///C:/Users/Win8/Desktop/ListBox2.html");
		driver.get("file:///D:/Java/ListBox2.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		
		int count=select.getOptions().size();
		for(int i=0;i<count;i++)
		{
			select.selectByIndex(i);
		}
		select.deselectAll();
	
		driver.close();
	}

}
