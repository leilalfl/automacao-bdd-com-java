//package stepDefinitions;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import Pages.DealPage;
//import Pages.LoginPage;
//import Pages.MenuPage;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import suporte.Web;
//
//public class DealStepDefinition {
//	
//	static WebDriver navegador;
//	static LoginPage loginPages;
//	static MenuPage menuPages;
//	static DealPage dealPages;
//	
//	@Given("usuario ja esta na pagina de Login")
//	public void usuario_ja_esta_na_pagina_de_Login() {
//		navegador = Web.createChrome();
//		loginPages = new LoginPage(navegador);
//		dealPages = new DealPage(navegador);
//	}
//	
//	@When("^titulo da tela de Login for Free CRM$")
//	public void titulo_da_tela_de_Login_for_Free_CRM() {
//		Assert.assertTrue("Não exibiu o titulo da tela correto", loginPages.validarTituloTela());
//	}
//	
//	@Then("^usuario entra com username e password$")
//	public void usuario_entra_com_username_e_password(DataTable credentials) {
//		loginPages.entrarComCredenciais(credentials);
//	}
//	
//	@Then("^usuario clica no botao de login$")
//	public void usuario_clica_no_botao_de_login() {
//		loginPages.acionarBotaoLogin();
//		
//	}
//	@Then("^usuario estara na home page$")
//	public void usuario_estara_na_home_page() {
//		loginPages.validarLoginComSucesso();
//	}
//	
//
//	@Then("^usuario acessa Novo Deal Page$")
//	public void usuario_acessa_Novo_Deal_Page(){
//		menuPages = new MenuPage(navegador);
//		menuPages.acessarNewDeal();
//
//	}
//
//	@Then("^usuario entra deal com os dados$")
//	public void usuario_entra_deal_com_os_dados(DataTable dealDados) {
//			dealPages.preencherCampos(dealDados);
//	}
//	
//
//	@Then("^Visualiza a mensagem$")
//	public void visualiza_a_mensagem(DataTable mensagem) {
//		List<List<String>> dealMsg = mensagem.raw();
//		String txt = dealPages.capturarMensagemContaSuspensa();
//		Assert.assertEquals(dealMsg.get(0).get(0), txt);
//	}
//	
//	@Then("^fecha o browser$")
//	public void fecha_o_browser() {
//		//navegador.quit();
//	}
//}
