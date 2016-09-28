package tests;

import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.sendsmspage;

public class sendsmstest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Loginpage sigin =new Loginpage(driver);
		sigin.login("9989593467", "ramireddy");
	}
	@Test(priority=0)
	public void validsendsms()
	{
		sendsmspage sms=new sendsmspage(driver);
		sms.sendsms("9989593467","Hi ramireddy how r u");
		driver.findElement(By.xpath("//span[text()='Your message has been sent !!!']"));
		System.out.println("test is pass");
		
	}	
	@Test(priority=1)
	public void Invalidsendsms()
	{
		sendsmspage sms=new sendsmspage(driver);
		sms.sendsms("998959467","Hi ramireddy how r u");
		try {
			driver.findElement(By.xpath("//span[text()='Your message has been sent !!!']"));
		} catch (Exception e) {
			System.out.println("test pass");
		}
		
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
