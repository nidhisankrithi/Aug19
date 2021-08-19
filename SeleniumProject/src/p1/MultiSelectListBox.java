package p1;




import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///C:/Users/Win8/Desktop/ListBox2.html");
		driver.get("file:///D:/Java/ListBox2.html");
//		Thread.sleep(1000);
//		WebElement listBox = driver.findElement(By.id("A2"));
		
		
//		Select select=new Select(listBox);
//		select.selectByIndex(0);
//		Thread.sleep(1000);
//		select.selectByValue("b");
//		Thread.sleep(1000);
//		select.selectByVisibleText("Snacks");
//		Thread.sleep(1000);
//		select.deselectByIndex(0);
//		Thread.sleep(1000);
//		select.deselectByValue("b");
//		Thread.sleep(1000);
//		select.deselectByVisibleText("Snacks");
//		System.out.println(select.isMultiple());//true
		
		WebElement listBox = driver.findElement(By.id("A3"));
		Select select=new Select(listBox);
		
//		 WebElement element = select.getWrappedElement();
//		System.out.println(element.getText());
		
       List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		int count=selectedOptions.size();
		System.out.println("Number of selected options:"+count);
		
		for(int i=0;i<count;i++) 
		{
			WebElement option = selectedOptions.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		WebElement option = select.getFirstSelectedOption();
		System.out.println("First Selected option:"+option.getText());
		
		List<WebElement> allOptions = select.getOptions();
		int count2=allOptions.size();
		System.out.println("Number of options:"+count2);
		
		for(int i=0;i<count2;i++)
		{
			String text=allOptions.get(i).getText();
			System.out.println(text);
		}
		
	}

}
