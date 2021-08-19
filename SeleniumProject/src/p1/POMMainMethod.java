package p1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test class
public class POMMainMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		POMDemo loginPage=new POMDemo(driver);
		loginPage.setUN("abcd");
		loginPage.setPassword("abcd");
		Thread.sleep(1000);
		loginPage.clickLogin();
		loginPage.verifyErrDispalyed(driver);
		Thread.sleep(1000);
		loginPage.setUN("admin");
		loginPage.setPassword("mamager");
		Thread.sleep(1000);
		loginPage.clickLogin();
		loginPage.verifyErrDispalyed(driver);
		driver.close();
	}
}
