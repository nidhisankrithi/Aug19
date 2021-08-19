package p1;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*in Selenium there is no method to scroll the page
 * if the element is not visible (its present down)  then selenium will automatically scroll 
 * we can use javascript to scroll 
 * 
 */
public class scroll2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();//up casting 
		driver.get("https://www.actimind.com/");
//		String xp="//a[contains(text(),'Learn') and contains(text(),'more') ]";
//		Point location = driver.findElement(By.xpath(xp)).getLocation();
//		int y=location.getY()-125;
//		Thread.sleep(1000);
//		JavascriptExecutor jse=(JavascriptExecutor)driver;//type casting
//		jse.executeScript("window.scrollBy(0,"+y+")");
//		
		//Scrol to the bottom of the page
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		Thread.sleep(1000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;//type casting
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	}

}

