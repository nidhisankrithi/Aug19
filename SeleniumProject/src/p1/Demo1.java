package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		
//		driver.get("file:///C:/Users/Win8/Desktop/Demo.html");
		driver.get("file:///D:/Java/Demo.html");
		 WebElement element = driver.findElement(By.id("A1"));
			Thread.sleep(1000);
			
			
			element.clear();
			Thread.sleep(1000);
			
			element.sendKeys("Nidhi");
			
			driver.findElement(By.id("A2"));
			
			element.click();
			
			System.out.println(driver.findElement(By.id("A2")).isDisplayed());
			
	boolean value1 = driver.findElement(By.id("A5")).isEnabled();
	System.out.println(value1);
		 boolean value = driver.findElement(By.id("A3")).isDisplayed();
		 System.out.println(value);
		 
		  boolean value2 = driver.findElement(By.id("A6")).isEnabled();
		  System.out.println(value2);
		  
		  driver.findElement(By.id("A7")).click();
		  
		  
		  
		int x = driver.findElement(By.id("A1")).getLocation().getX();
		System.out.println("Horizontal is "+x+" pixels");
		int y = driver.findElement(By.id("A1")).getLocation().getY();
		System.out.println("Horizontal is "+y+" pixels");
		
		 int h = driver.findElement(By.id("A1")).getSize().getHeight();
		 System.out.println("Height:"+h);
		 int w = driver.findElement(By.id("A1")).getSize().getHeight();
		 System.out.println("Width:"+w);
		   
		 Rectangle r = driver.findElement(By.id("A1")).getRect();
		 System.out.println(r.getHeight());
		 System.out.println(r.getWidth());
		 System.out.println(r.getX());
		 System.out.println(r.getY());
		 
		 
		  
		  
		  
		 driver.close();
			}

}
