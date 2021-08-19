package p1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Demoautosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter google.com
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		//enter 'selenium' in search box
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		//find all the auto suggestions
		List<WebElement> allASE = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		//print the count
		int count=allASE.size();
		System.out.println(count);
		//print the text
		for(int i=0;i<count;i++) {
			String text=allASE.get(i).getText();
			System.out.println(text);
		}
		
		//select the 1st one
		allASE.get(2).click();
		
		driver.close();
	
		
	}

}