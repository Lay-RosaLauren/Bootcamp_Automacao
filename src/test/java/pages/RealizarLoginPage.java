package pages;

import org.openqa.selenium.WebDriver;

import utils.Utils;

public class RealizarLoginPage {

    private WebDriver driver;
    private Utils util;

    public RealizarLoginPage(WebDriver driver) {
        this.driver = driver;
        util = new Utils(driver);
    }

    public void RealizarLogin() {

        driver.get("http://automationpractice.com/index.php");

        util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
        util.preencheCampoPorId("email", "rosa.qa@everis.com");
        util.preencheCampoPorId("passwd", "coringa");
        util.clickPorNome("SubmitLogin");

    }

}
