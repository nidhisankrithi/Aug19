package p1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		//open the browser
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		//enter google.com
		driver.get("file:///D:/JavaSelenium/PopUpDemo.html");
		Thread.sleep(1000);
//		driver.findElement(By.id("A1")).click();
//		//cursor will go to the alert message
//		Alert alert = driver.switchTo().alert();
//		String msg=alert.getText();
//	System.out.println(msg);
	//to click OK Button
//		alert.accept();
//		Thread.sleep(1000);
		
		
		//FIle popUp (Browse)
		//InvalidArgumentException
//		driver.findElement(By.id("A2")).sendKeys("f:/MyCV.docx");
		//WebDriverException-path is not absolute:
//		File f=new File("./Nidhi/CV");
//		String path = f.getAbsolutePath();
//		driver.findElement(By.id("A2")).sendKeys(path);
//		Thread.sleep(1000);
		
		//A3 Download
		driver.findElement(By.id("A3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("PageLink_10")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("DirectLink_12")).click();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		}
}