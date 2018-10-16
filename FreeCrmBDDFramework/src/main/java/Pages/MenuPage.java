package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
	
	static WebDriver driver;

	public MenuPage(WebDriver driver) {
		MenuPage.driver = driver;
	}

	public void acessarNewDeal() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		
		action.moveToElement(
				driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.cssSelector("a[title='New Deal']")).click();
	}
	
	public void acessarNewContacts() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(
				driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}
}
