package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;

public class DealPage {
	
	static WebDriver driver;

	public DealPage(WebDriver driver) {
		DealPage.driver = driver;
	}
	
	public void preencherCampos(DataTable dealDados) {
		List<List<String>> dealValues = dealDados.raw();
	    driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
	    driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
	    driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
	    driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
	}
	public String capturarMensagemContaSuspensa() {
	    WebElement mensagemTela = driver.findElement(
	    		By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset[1]/legend/big"));
		 return mensagemTela.getText();
	}

}
