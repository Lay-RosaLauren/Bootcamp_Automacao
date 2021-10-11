package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class CadastrarUsuarioPage {

	private WebDriver driver;
	private Utils util;

	public CadastrarUsuarioPage(WebDriver driver) {
		util = new Utils(driver);
		this.driver = driver;
	}

	public void cadastrarusuario() {

		WebDriverWait wait = new WebDriverWait(driver, 400);

		driver.get("http://automationpractice.com/index.php");

		util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
		util.preencheCampoPorId("email_create", "rosa.qa@everis.com");
		util.clickPorCss("button[id='SubmitCreate'] span");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		util.clickPorId("id_gender2");
		util.preencheCampoPorId("customer_firstname", "Rosa");
		util.preencheCampoPorId("customer_lastname", "QA");
		util.preencheCampoPorId("passwd", "coringa");
		util.preencheCampoPorCss("#days", "14");
		util.preencheCampoPorCss("#months", "June");
		util.preencheCampoPorCss("#years", "1959");
		util.preencheCampoPorId("address1", "Street name, 515");
		util.preencheCampoPorId("city", "Los Angeles");
		util.preencheCampoPorId("id_state", "California");
		util.preencheCampoPorId("postcode", "90001");
		util.preencheCampoPorId("id_country", "United States");
		util.preencheCampoPorId("phone_mobile", "9999999999");
		util.clickPorId("submitAccount");

	}

}