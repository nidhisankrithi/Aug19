package aug12;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplebrowserandSystem {

	@Parameters({"browser","url"})
	@Test
	public void testA(String browserName,String urlValue) throws MalformedURLException, InterruptedException
	{
		URL url=new URL(urlValue);
		DesiredCapabilities browser;
		int x;
		if(browserName.equals("chrome"))
		{
			browser=DesiredCapabilities.chrome();
			x=10;
		}
		else
		{
			browser= DesiredCapabilities.firefox();
			x=800;
		}
		
		WebDriver driver=new RemoteWebDriver(url,browser);
		
		Dimension d=new Dimension(400,400);
		driver.manage().window().setSize(d);//resize
		
		Point p=new Point(x, 10);
		driver.manage().window().setPosition(p);//move
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		Reporter.log(title,true);
		
		for(int i=1;i<=5;i++) {
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("bhanu");
		Thread.sleep(500);
		driver.findElement(By.name("q")).clear();
		}
		driver.close();
	}
}
