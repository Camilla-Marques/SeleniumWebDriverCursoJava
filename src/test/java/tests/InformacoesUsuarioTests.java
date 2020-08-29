package tests;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InformacoesUsuarioTests {
	private WebDriver navegador;
	
	@Before
	public void setUp() {
		
		//Abrindo o navegador
				WebDriverManager.firefoxdriver().setup();
				navegador = new FirefoxDriver();
				navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				navegador.manage().window().maximize();
				//WebDriverManager navegador = new FirefoxDriver();
				
				//Navegando para a página do Taskit!
				navegador.get("http://www.juliodelima.com.br/taskit");	
	}
	
	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario () {
		
		
		// Clicar no link que possui o texto "Sign in"
		
		navegador.findElement(By.linkText("Sign in")).click();;
		
		// Identificando o formulário de login
		
		WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));
		
		// Digitar no campo com name "login" que est� dentro do formul�rio de id "signinbox" o texto "julio0001"
		
		formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");
		
		// Digitar no campo com name "password" que est� dentro do formul�rio de id "signinbox" o texto "123456"
		
		formularioSignInBox.findElement(By.name("password")).sendKeys("123456");
		
		// Clicar no link com o texto "SIGN IN"
		
		navegador.findElement(By.linkText("SIGN IN")).click();
		
		//Clicar em um link que tenha class me
		
		//Clicar em um link que tenha o texto More data about you
		
		//Clicar no bot�o atrav�s do xpath //button[@data-target="addmoredata"]
		
		//Identificar a popup onde est� o formul�rio de id add more data
		
		//Na combo de name "type" escolher a op��o E-mail
		
		//No campo de name "contact" informar o e-mail test@test.com.br
		
		//Clicar no link de text "Save" que est� na popup
		
		//Na mensagem de id "toast container" validar que  texto � "Your contact has been added!"
		
		
		
	}
	
	@After
	public void tearDown() {
		// Fechar o navegador
		navegador.quit();
	}
}
