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
import pages.CadastrarNovoEnderecoPage;
import pages.RealizarLoginPage;
import utils.Utils;

public class CadastrarNovoEnderecoPageTest {

    private WebDriver driver;
    private RealizarLoginPage loginPage;
    private CadastrarNovoEnderecoPage cadastrarNovoEnderecoPage;
    private Utils util;

    @Before
    public void inicializa(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new RealizarLoginPage(driver);
        cadastrarNovoEnderecoPage = new CadastrarNovoEnderecoPage(driver);
        driver.manage().window().maximize();

    }

    @Test
    public void cadastrarNovoEnderecoPage(){
        loginPage.RealizarLogin();
        cadastrarNovoEnderecoPage.cadastrarNovoEndereco();
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Update'] span")));
        WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Add an address'] span"));
        Assert.assertEquals("Add a new address",validaTexto.getText());

    }

    @After
    public void afterCenario() {
        driver.quit();
    }
}
