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

import utils.Utils;

public class CadastrarUsuarioUtilsTest {
	
	private ChromeDriver driver;
	private Utils util;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		util = new Utils(driver);
		driver.manage().window().maximize();
	}

	@Test
	public void cadastrarUsuarioUtils() {

		driver.get("http://automationpractice.com/index.php");

		util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");

		util.preencheCampoPorId("email_create", "lay@qa.com");
		util.clickPorCss("button[id='SubmitCreate'] span");
		util.esperarQueOElementoSejaVisivel(driver,By.id("id_gender2"));
		util.clickPorId("id_gender2");
		util.preencheCampoPorId("customer_firstname", "Lay");
		util.preencheCampoPorId("customer_lastname", "QA");
		util.preencheCampoPorId("passwd","babaca");
		util.preencheCampoPorCss("#days", "14");
		util.preencheCampoPorCss("#months", "June");
		util.preencheCampoPorCss("#years", "1959");
		util.preencheCampoPorId("address1", "Street name, 950");
		util.preencheCampoPorId("city", "Chicago");
		util.preencheCampoPorId("id_state", "Illinois");
		util.preencheCampoPorId("postcode", "60007");
		util.preencheCampoPorId("id_country", "United States");
		util.preencheCampoPorId("phone_mobile", "9999999988");
		util.clickPorId("submitAccount");
		util.esperarQueOElementoSejaVisivel(driver,By.cssSelector("a[title='Orders'] span"));
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
	}

	@After
	public void afterCenario() {
		    util.rollbackEmail(driver.findElement(By.id("email_create")));
			driver.quit();
	}

}
