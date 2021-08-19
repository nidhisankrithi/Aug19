package p1;
import java.util.List;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///C:/Users/Win8/Desktop/Demo4.html");
		driver.get("file:///D:/JavaSelenium/Demo4.html");
		String xp="//input[@type='text']";
//		WebElement element = driver.findElement(By.xpath(xp));
//		element.sendKeys("bhanu");
		
		List<WebElement> allElements = driver.findElements(By.xpath(xp));
		//System.out.println(allElements.getClass().getName());
		String[] data= {"Akshara","Bhanu","Divya"};
		int count = allElements.size();
		System.out.println(count);
//		for(int i=0;i<count;i++) {
//			WebElement e = allElements.get(i);
//			e.sendKeys(data[i]);
//		}
		
		for(WebElement element:allElements)
		{
			element.sendKeys("bhanu");
		}
		
//		driver.close();
		
	}

}
