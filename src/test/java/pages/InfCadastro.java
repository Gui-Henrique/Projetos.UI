package pages;

import org.openqa.selenium.WebDriver;

import elementos.ElementosWeb;

public class InfCadastro {
	
	WebDriver driver;
	ElementosWeb elm = new ElementosWeb();
	Metodos mtd = new Metodos();
	
	public void cadastro1() {
		
		//entrar em automovel e preencher
		mtd.click(elm.getAutomovel());
		//Make
		mtd.click(elm.getMake());
		mtd.click(elm.getCarro());
		//Engine Performance [kW]
		mtd.preencher(elm.getEnginePerf(), "1000");
		//Date of Manufacture
		mtd.preencher(elm.getDataFabricacao(), "02/04/2017");
		//Number of Seats
		mtd.click(elm.getNumberSeats());
		mtd.click(elm.getAssentos());
		//Fuel Type
		mtd.click(elm.getCombustivelTipo());
		mtd.click(elm.getCombustivo());
		//List Price [$]
		mtd.preencher(elm.getPrecoVeiculo(), "70000");
		//License Plate Number
		mtd.preencher(elm.getMatricula(), "24532");
		//Annual Mileage [mi]
		mtd.preencher(elm.getQuilometragem(), "20000");
		//clicar em next
		mtd.click(elm.getNext());
		
	}

}
