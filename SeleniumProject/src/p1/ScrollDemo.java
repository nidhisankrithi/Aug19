package p1;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*in Selenium there is no method to scroll the page
 * if the element is not visible (its present down)  then selenium will automatically scroll 
 * we can use javascript to scroll 
 * 
 */
public class ScrollDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();//up casting 
		driver.get("https://www.actimind.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;//type casting
		
		//scroll down
		for(int i=1;i<=10;i++) 
		{
			jse.executeScript("window.scrollBy(0,100)");
			Thread.sleep(500);
		}
		
		//scroll up
		for(int i=1;i<=10;i++) 
		{
			jse.executeScript("window.scrollBy(0,-100)");
			Thread.sleep(500);
		}
	
	}

}
