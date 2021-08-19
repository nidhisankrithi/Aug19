package p1;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//close specific browser
//close only parent browser
//close only child browsers (all browsers except parent)

public class OpenLink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Recruiters']")).click();
		Thread.sleep(3000);
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());

		for(String whs:allWHS)
		{
			driver.switchTo().window(whs);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(1000);
		}
		
	}

}

