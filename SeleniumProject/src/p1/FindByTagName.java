package p1;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByTagName {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(2000);
		
		WebElement errElement = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		
			String color=errElement.getCssValue("color");
			System.out.println(color);
			
	    
			
			
			File srcFile = errElement.getScreenshotAs(OutputType.FILE);
			System.out.println(srcFile);
			
			 FileUtils.copyFile(srcFile, new File("./images/error1.png")); 
			
			 driver.close();
			 
	
}
}
