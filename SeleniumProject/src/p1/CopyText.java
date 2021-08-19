package p1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CopyText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		WebElement pwTB = driver.findElement(By.name("pwd"));
		Actions actions=new Actions(driver);
		actions.sendKeys("trainee").perform();
		Thread.sleep(1000);
		unTB.sendKeys(Keys.CONTROL+"a");
		unTB.sendKeys(Keys.CONTROL+"c");
		pwTB.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);		
		
		
	}
	}