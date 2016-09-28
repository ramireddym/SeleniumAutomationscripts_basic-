package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SMSCollectionpage {
	WebDriver driver;
	public SMSCollectionpage(WebDriver driver) {
		this.driver=driver;	
	}
	public void collection(String name,String mobile)
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.id("aSMSCollection")).click();
		driver.switchTo().frame("by2Frame");
		WebElement element=driver.findElement(By.id("spanCategories"));
		element.click();
		/*Select select=new Select(element);
		select.selectByVisibleText("Festivals");*/
		//driver.findElement(By.xpath("//ul/li[contains(text(),'Special Days')]/preceding-sibling::li")).click();
		driver.findElement(By.xpath("//ul/li[contains(text(),'General')]/following-sibling::li")).click();
		driver.findElement(By.cssSelector("input[id='txtSearchCategory']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.findElement(By.xpath("//div[@id='divSendSMS']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobile);
		driver.findElement(By.xpath("//p[@class='mt10 t-r']")).click();
		
	}

}
