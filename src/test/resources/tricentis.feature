#Author: gh314277@gmail.com

Feature: Acessar o site da Tricentis
  Eu como usuario quero acessar o site para solicitar um seguro para meu veiculo

  Scenario: Realizar cadastro no site
    Given que eu esteja no "http://sampleapp.tricentis.com/101/app.php"
    When preencher campos
  	Then valido se foi solicitado o seguro
    