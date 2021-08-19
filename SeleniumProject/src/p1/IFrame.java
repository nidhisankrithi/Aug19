package p1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/JavaSelenium/sampleframe1.html");
//		driver.switchTo().frame(0);//using index (int)
		
//		driver.switchTo().frame("f1");//using id (String)
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='sampleframe2.html']"));
		driver.switchTo().frame(frameElement);//using address (WebElement)
		
		driver.findElement(By.id("t2")).sendKeys("prakash");
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("bhanu");
	}

}
