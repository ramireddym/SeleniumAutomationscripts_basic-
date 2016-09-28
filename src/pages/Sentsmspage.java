package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sentsmspage {
	WebDriver driver;
	public Sentsmspage(WebDriver driver) {
		this.driver=driver;	
	}
	public void sentsms()
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.id("aSentBox")).click();
		driver.switchTo().frame("by2Frame");
		driver.findElement(By.id("selectDate")).click();
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		driver.findElement(By.linkText("30")).click();
		driver.findElement(By.xpath("//input[@value='Get Data']")).click();
		
		//this code use for click to back button
		/*driver.findElement(By.xpath("html/body/form/div/section/div[2]/div[1]/table/tbody/tr[2]/td[3]/a")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@value='3638599']"));
		ele.isSelected();
		ele.click();
		driver.findElement(By.xpath("//input[@value='Back']")).click();*/
		//
		driver.findElement(By.xpath("html/body/form/div/section/div[2]/div[1]/table/tbody/tr[3]/td[3]/a")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@value='3627189']"));
		ele.isSelected();
		ele.click();
		driver.findElement(By.cssSelector("input[value='Delete']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	

}
