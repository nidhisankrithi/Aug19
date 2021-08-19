package p1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonautosuggestion {


static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
public static void main(String[] args) throws IOException, InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//enter google.com
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);
	//enter 'selenium' in search box
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv");
	Thread.sleep(1000);
	//find all the auto suggestions
	List<WebElement> allASE = driver.findElements(By.className("s-suggestion"));

	int count=allASE.size();
	
	//print the text
	for(int i=0;i<count;i++) {
		String text=allASE.get(i).getText();
		System.out.println(text);
	}
	
	//select the 1st one
	allASE.get(0).click();
	
	driver.close();

	
	
	
	
	
		
	}
}
