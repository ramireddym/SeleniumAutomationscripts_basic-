package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addcontactpage {
	WebDriver driver;
	public Addcontactpage(WebDriver driver) {
		this.driver=driver;	
	}
	public void addcontact(String name,String number)
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.id("aContacts")).click();
		driver.switchTo().frame("by2Frame");
		driver.findElement(By.id("addname")).sendKeys(name);
		driver.findElement(By.id("addmob")).sendKeys(number);
		WebElement Element=driver.findElement(By.xpath("//input[@value='M'][@name='addgenval']"));
		Element.isSelected();
		Element.click();
		driver.findElement(By.id("adddcon")).click();
	}
	public void search(String name)
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.id("aContacts")).click();
		driver.switchTo().frame("by2Frame");
		driver.findElement(By.xpath("//input[@placeholder='Enter Name or Number']")).sendKeys(name);
		driver.findElement(By.xpath("//span[@class='sp-inside cont-ser-ic']")).click();
	}

}
