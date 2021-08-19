package p1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	 
	System.out.println(allLinks.size());
	driver.close();
		

		
}
}
