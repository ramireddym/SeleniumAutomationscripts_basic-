package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.SMSCollectionpage;

public class SMSCollectiontest {
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
	public void validcollection()
	{
		SMSCollectionpage Collection=new SMSCollectionpage(driver);
		Collection.collection("Holi","8142001020");
		driver.findElement(By.xpath("//div[@class='msg-box']/p[contains(text(),'Its time 2 celebrate the different colors of our beautiful')]"));
		System.out.println("Hai ram");
		
	}
	@Test(priority=1)
	public void Invalidcollection()
	{
		SMSCollectionpage Collection=new SMSCollectionpage(driver);
		Collection.collection("H","8142001020");
		try {
			driver.findElement(By.xpath("//div[@class='msg-box']/p[contains(text(),'Its time 2 celebrate the different colors of our beautiful')]"));
		} catch (Exception e) {
			System.out.println("how r u");
		}
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
