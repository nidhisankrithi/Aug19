package p1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter google.com
//		driver.get("file:///C:/Users/Win8/Desktop/ListBox1.html");
		driver.get("file:///D:/Java/ListBox1.html");
		Thread.sleep(1000);
		
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select=new Select(listBox);
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByValue("a");
		Thread.sleep(1000);
		select.selectByVisibleText("Chennai");
//		boolean v = select.isMultiple();
//		System.out.println(v);
//		select.deselectByIndex(0);
		
}
}
