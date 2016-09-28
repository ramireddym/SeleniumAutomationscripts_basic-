package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Addcontactpage;
import pages.Loginpage;

public class Addcontacttest {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Loginpage sigin =new Loginpage(driver);
		sigin.login("9989593467", "ramireddy");
	}
	@Test(priority=0)
	public void validcon()
	{
		Addcontactpage con=new Addcontactpage(driver);
		con.addcontact("thrivenireddy","9666860641");
		driver.findElement(By.xpath("//div[@class='con-msg mt10 t-c']/span"));
		System.out.println("Hai");
	}

	
	@Test(priority=1)
	public void Invalidcon()
	{
		Addcontactpage con=new Addcontactpage(driver);
		con.addcontact("","9666860641");
		try {
			driver.findElement(By.xpath("//div[@class='con-msg mt10 t-c']/span"));
		} catch (Exception e) {
			System.out.println("How r u");
		}
	}

	@Test(priority=2)
	public void validsea()
	{
		Addcontactpage con=new Addcontactpage(driver);
		con.search("srinath");
	}
	@Test(priority=3)
	public void Invalidsea()
	{
		Addcontactpage con=new Addcontactpage(driver);
		con.search("   ");
	}
	/*@AfterMethod
	public void quit()
	{
		driver.quit();
	}*/
}
