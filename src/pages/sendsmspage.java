package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendsmspage {
	WebDriver driver;

	public sendsmspage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sendsms(String phonenumber, String text)
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("by2Frame");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number or Name']")).sendKeys(phonenumber);
		driver.findElement(By.id("sendSMSMsg")).sendKeys(text);
		driver.findElement(By.id("btnsendsms")).click();
		/*driver.findElement(By.xpath("//td[text()='k.rao']")).click();
		driver.findElement(By.xpath("html/body/form/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.id("btnsendsms")).click();*/
		/*driver.switchTo().defaultContent();
		driver.findElement(By.id("aGroupSMS")).click();
		driver.getTitle();
		driver.navigate().back();
		driver.findElement(By.id("aContacts")).click();
		driver.getTitle();
		driver.navigate().back();
		driver.findElement(By.id("aSentBox")).click();
		driver.getTitle();
		driver.navigate().back();
		driver.findElement(By.id("aSMSCollection")).click();
		driver.getTitle();
		driver.navigate().back();
		driver.findElement(By.id("aMyAlerts")).click();
		driver.getTitle();
		driver.navigate().back();
		*/
	}
}
