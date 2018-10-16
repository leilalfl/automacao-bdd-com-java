package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Pages.ContactPage;
import Pages.LoginPage;
import Pages.MenuPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import suporte.Web;

public class LoginStepDefinition {
	
	static WebDriver navegador;
	static LoginPage loginPages;
	static MenuPage menuPages;
	static ContactPage contactPages;
	
	@Given("usuario ja esta na pagina de Login")
	public void usuario_ja_esta_na_pagina_de_Login() {
		navegador = Web.createChrome();
		loginPages = new LoginPage(navegador);
		menuPages = new MenuPage(navegador);
		contactPages = new ContactPage(navegador);
	}
	
	@When("^titulo da tela de Login for Free CRM$")
	public void titulo_da_tela_de_Login_for_Free_CRM() {
		Assert.assertTrue("Não exibiu o titulo da tela correto", loginPages.validarTituloTela());
	}
	
	@Then("^usuario entra com \"(.*)\" e \"(.*)\"$")
	public void usuario_entra_com_username_e_senha(String username, String password ) {
		loginPages.entrarComUsuarioSenha(username, password);
	}
	
	@Then("^usuario clica no botao de login$")
	public void usuario_clica_no_botao_de_login() {
		loginPages.acionarBotaoLogin();
	}
	
	@Then("^usuario estara na home page$")
	public void usuario_estara_na_home_page() {
		loginPages.validarLoginComSucesso();
	}
	
	@Then("^user acessa Novo Contato Page$")
	public void user_acessa_Novo_Contato_Page() {
		menuPages.acessarNewContacts();
	}
	
	@Then("^usuario entra com dados do contato \"(.*)\" e \"(.*)\" e \"(.*)\"$")
	public void usuario_entra_com_dados_do_contato(String username, String password, String firstname, 
			String lastname, String position) {
		contactPages.preencherCampos(username, password, firstname, lastname, position);
	}

	@Then("^fecha o browser$")
	public void fecha_o_browser() {
		navegador.quit();
	}
	

	@Then("^Visualiza a mensagem \"([^\"]*)\"$")
	public void visualiza_a_mensagem(String msg) {
		Assert.assertEquals(msg, contactPages.capturarMensagemContaSuspensa());
		
	}

}
