package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;

public class LoginPage {
	
	static WebDriver driver;

	public LoginPage(WebDriver driver) {

		LoginPage.driver = driver;
	}
	
	public boolean validarTituloTela() {
		String title = driver.getTitle();
		System.out.println(title);
		Boolean validarMsg;
		if(title.contains("CRM")) {
			validarMsg = true;
		}
		else {
			validarMsg = false;
		}
		
		return validarMsg;
	}
	
	public void entrarComCredenciais(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	
	public void entrarComUsuarioSenha(String username, String password ) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void acionarBotaoLogin() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//para que serve???
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	public void validarLoginComSucesso() {
		String title = driver.getTitle();
		System.out.println("Home Page Title :: " +title);
		Assert.assertEquals("CRMPRO", title);
	}

}
