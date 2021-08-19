package p1;



import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*we can use Select class only on the listbox (<select>) else we get UnexpectedTagNameException
 * Action is interface , Actions is a class
 * present in interactions package
 * new ChromeDriver();-----no arg con
 * new Actions(WebDriver);- 1arg con-WebDriver
 * new Select(WebElement); 1arg con-WebElement
 * When we call any method of Actions class we must call perform() at the end 
 */
public class HoverDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///C:/Users/Win8/Desktop/ActionDemo.html");
		driver.get("file:///D:/Java/ActionDemo.html");
		
		//HOVER
//		driver.findElement(By.id("A1")).click();
		
		//Right Click / Context Clicking
//		driver.findElement(By.id("A2")).click();
		
		//Drag and Drop
		driver.findElement(By.id("A4")).click();
		
		
		//Double Click
//		driver.findElement(By.id("A3")).click();
		
		Thread.sleep(1000);
//		String xp="(//a[text()='About us '])[2]";
//		WebElement menu = driver.findElement(By.xpath(xp));
//		Actions actions=new Actions(driver);
//		actions.moveToElement(menu).perform();
//		Thread.sleep(1000);
//		String xp2="(//a[text()='Values '])[2]";
//		driver.findElement(By.xpath(xp2)).click();
//		Thread.sleep(2000);
//		
		//Right CLick
		
//		String xp="//span[text()='right click me']";
//		WebElement element = driver.findElement(By.xpath(xp));
//		Actions actions=new Actions(driver);
//		actions.contextClick(element).perform();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Quit']")).click();
		
		//Double Click
//		String xp="//input[@value='Double Click']";
//		WebElement button = driver.findElement(By.xpath(xp));
//		Actions actions=new Actions(driver);
//		actions.doubleClick(button).perform();
//		
		//Drag and Drop
		
		String xp1="//h1[text()='Block 1']";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		
		String xp3="//h1[text()='Block 3']";
		WebElement block3 = driver.findElement(By.xpath(xp3));
		
		
	Actions actions=new Actions(driver);
//		actions.dragAndDrop(block1, block3).perform();
//		
		Duration d=Duration.ofSeconds(2);
		actions.clickAndHold(block1).pause(d).moveToElement(block3).release().perform();
		
	}

}
