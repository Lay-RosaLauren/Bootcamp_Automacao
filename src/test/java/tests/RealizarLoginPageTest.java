package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.RealizarLoginPage;
import utils.Utils;

public class RealizarLoginPageTest {
	
	private WebDriver driver;
	private Utils util;

	private RealizarLoginPage realizarLoginPage;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		util = new Utils(driver);
		realizarLoginPage = new RealizarLoginPage(driver);
		driver.manage().window().maximize();
	}
	
	@Test
	public void realizarlogin() {

		realizarLoginPage.RealizarLogin();
		util.esperarQueOElementoSejaVisivel(driver,By.cssSelector("a[title='Orders'] span"));
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
	}
	
	@After
	public void quit() {
		driver.quit();
	}

}
