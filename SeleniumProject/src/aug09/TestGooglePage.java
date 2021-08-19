package aug09;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGooglePage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://Google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		googlePage l=new googlePage(driver);
		System.out.println(l.getSize());
		l.PrintAllLinks();
		
}
}
