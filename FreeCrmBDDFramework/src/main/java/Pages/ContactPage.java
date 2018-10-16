package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	static WebDriver driver;

	public ContactPage(WebDriver driver) {
		ContactPage.driver = driver;
	}
	
	public void preencherCampos(String username, String password, String firstname, 
			String lastname, String position) {
		driver.findElement(By.id("firt_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElements(By.xpath("//input[@type='submit' and @value='Save']")).get(0).click();	
}
	public String capturarMensagemContaSuspensa() {
	    WebElement mensagemTela = driver.findElement(
	    		By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset[1]/legend/big"));
		 return mensagemTela.getText();
	}
}
