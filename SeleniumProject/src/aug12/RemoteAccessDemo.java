package aug12;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RemoteAccessDemo {

	@Test
	public void testA() throws MalformedURLException
	{
		
		URL url=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities browser = DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(url,browser);
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		Reporter.log(title,true);
		driver.close();
	}
}
