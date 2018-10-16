package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
		public static WebDriver createChrome(){
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		// driver = new FirefoxDriver();
		WebDriver navegador = new ChromeDriver();
		navegador.get(
				"https://www.freecrm.com");
		navegador.manage().window().maximize();
		return navegador;
		
	}

}
