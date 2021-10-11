package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import tests.RealizarLoginPageTest;
import utils.Utils;


public class CadastrarNovoEnderecoPage {

    private WebDriver driver;
    private Utils util;
    private RealizarLoginPage loginPage;


    public CadastrarNovoEnderecoPage(WebDriver driver) {
        util = new Utils(driver);
        this.driver = driver;
    }


    public void cadastrarNovoEndereco() {

        util.clickPorxpath("//a[@title='Addresses']");
        util.clickPorxpath("//a[@title='Add an address']");
        util.preencheCampoPorId("address1", "address1");
        util.preencheCampoPorId("address2", "Street name, 615");
        util.preencheCampoPorId("city", "Los Angeles");
        util.preencheCampoPorId("id_state", "California");
        util.preencheCampoPorId("postcode", "90001");
        util.preencheCampoPorId("id_country", "United States");
        util.preencheCampoPorId("phone", "9999999999");
        util.preencheCampoPorId("phone_mobile", "9999999988");
        util.preencheCampoPorId("al","123");
        util.clickPorId("submitAddress");

    }
}

