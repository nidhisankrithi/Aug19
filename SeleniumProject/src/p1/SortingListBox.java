package p1;





import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//print list box content in sorted order
public class SortingListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///C:/Users/Win8/Desktop/ListBox2.html");
		driver.get("file:///D:/Java/ListBox2.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		ArrayList<String> allText=new ArrayList<String>();
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			allText.add(text);
		}
			
		System.out.println(allText);
		
		Collections.sort(allText);//DNSO
	    System.out.println("Sorting" +allText);
		
		
		Collections.reverse(allText);
		System.out.println("Reverse Sorting:"+allText);
		
	   
		
		
		driver.close();
	}

}

