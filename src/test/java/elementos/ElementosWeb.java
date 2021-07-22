package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By automovel = By.id("nav_automobile");
	private By make = By.name("Make");
	private By carro = By.cssSelector("#make > option:nth-child(14)");
	private By enginePerf = By.id("engineperformance");
	private By dataFabricacao = By.id("dateofmanufacture");
	private By numberSeats = By.id("numberofseats");
	private By assentos = By.cssSelector("#numberofseats > option:nth-child(6)");
	private By combustivelTipo = By.id("fuel");
	private By combustivo = By.cssSelector("#fuel > option:nth-child(2)");
	private By precoVeiculo = By.id("listprice");
	private By matricula = By.id("licenseplatenumber");
	private By quilometragem = By.id("annualmileage");
	private By next = By.id("nextenterinsurantdata");
	private By primeiroNome = By.id("firstname");
	private By segundoNome = By.id("lastname");
	private By nasc = By.id("birthdate");
	private By sexo = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)");
	private By endereco = By.id("streetaddress");
	private By paisButton = By.id("country");
	private By pais = By.xpath("//*[@id=\"country\"]/option[32]");
	private By codePostal = By.id("zipcode");
	private By cidade = By.id("city");
	private By ocupacao = By.id("occupation");
	private By ocupSelec = By.cssSelector("#occupation > option:nth-child(6)");
	private By hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5)");
	private By next2 = By.id("nextenterproductdata");
	
	public By getNext2() {
		return next2;
	}

	public By getPrimeiroNome() {
		return primeiroNome;
	}

	public By getSegundoNome() {
		return segundoNome;
	}

	public By getSexo() {
		return sexo;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getPaisButton() {
		return paisButton;
	}

	public By getPais() {
		return pais;
	}

	public By getCodePostal() {
		return codePostal;
	}

	public By getCidade() {
		return cidade;
	}

	public By getOcupacao() {
		return ocupacao;
	}

	public By getOcupSelec() {
		return ocupSelec;
	}

	public By getHobbies() {
		return hobbies;
	}

	public By getNasc() {
		return nasc;
	}

	public By getPrecoVeiculo() {
		return precoVeiculo;
	}

	public By getMatricula() {
		return matricula;
	}

	public By getQuilometragem() {
		return quilometragem;
	}

	public By getNext() {
		return next;
	}

	public By getNumberSeats() {
		return numberSeats;
	}

	public By getCombustivelTipo() {
		return combustivelTipo;
	}

	public By getCombustivo() {
		return combustivo;
	}

	public By getAssentos() {
		return assentos;
	}

	public By getAutomovel() {
		return automovel;
	}

	public By getDataFabricacao() {
		return dataFabricacao;
	}

	public By getEnginePerf() {
		return enginePerf;
	}

	public By getCarro() {
		return carro;
	}

	public By getMake() {
		return make;
	}
	
}
