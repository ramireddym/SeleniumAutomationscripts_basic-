package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Myalertspage;

public class Myalertstest {
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
	public void validalert()
	{
		Myalertspage alert=new Myalertspage(driver);
		alert.myalert("K.vinodReddy", "8142001020", "Hai brother YSR full from (Yeduguri Sandinti Rajasekhara Reddy)(8 July 1949 � 2 September 2009)");	
		driver.findElement(By.xpath("//div[@class='con-msg mt4 t-c']/span"));
		System.out.println("Hai");
	}
	@Test(priority=1)
	public void Invalidalert()
	{
		Myalertspage alert=new Myalertspage(driver);
		alert.myalert("K.vinodReddy", "81420010", "Hai brother YSR full from (Yeduguri Sandinti Rajasekhara Reddy) (8 July 1949 � 2 September 2009)");	
		try {
			driver.findElement(By.xpath("//div[@class='con-msg mt4 t-c']/span"));
		} catch (Exception e) {
			System.out.println("Hello");
		}
	}
	
}
