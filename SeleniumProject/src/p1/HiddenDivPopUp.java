package p1;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/JavaSelenium/PopUpDemo.html");
//		driver.findElement(By.id("A4")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bhanu");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bhanu");
//		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
//		
//		
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> allWHS = driver.getWindowHandles();		
		for(String whs:allWHS)
		{
			driver.switchTo().window(whs);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().contains("Cognizant"))
			driver.close();
		}
		
		
		
		
}
}
