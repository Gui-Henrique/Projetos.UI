package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {
	
	WebDriver driver;

	public void abrirNavegador(String site) {

		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			System.out.println("----ERROR AO ABRIR NAVEGADOR----" + e.getMessage());
			
		}
		
	}

}
