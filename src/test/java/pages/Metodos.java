package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Metodos {

	WebDriver driver;

	public void preencher(By elemento, String text) {

		try {
			driver.findElement(elemento).sendKeys(text);

		} catch (Exception e) {
			System.out.println("----ERROR AO PREENCHER----" + e.getMessage());

		}
	}

	public void click(By elemento) {

		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("----ERROR AO CLICAR NO ELEMENTO----" + e.getMessage());

		}

	}

	public void fecharNav() {

		try {
			driver.quit();

		} catch (Exception e) {
			System.out.println("----ERROR AO FECHAR NAVEGADOR----" + e.getMessage());

		}

	}

}
