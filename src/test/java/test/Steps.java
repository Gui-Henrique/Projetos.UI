package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InfCadastro;
import pages.Metodos;
import pages.Navegador;

public class Steps {

	Navegador browser = new Navegador();
	InfCadastro passoTest = new InfCadastro();
	Metodos mtd = new Metodos();
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String string) {
		browser.abrirNavegador(string);
		
	}

	@When("preencher campos")
	public void preencher_campos() {
		passoTest.cadastro1();

	}

	@Then("valido se foi solicitado o seguro")
	public void valido_se_foi_solicitado_o_seguro() {
		mtd.fecharNav();

	}

}
