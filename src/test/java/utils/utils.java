package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
    private WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void preencheCampoPorId(String id_campo, String value) {

        driver.findElement(By.id(id_campo)).sendKeys(value);
    }

    public void rollbackEmail(WebElement email_create){
        driver.findElement(By.id(String.valueOf(email_create))).clear();
    }

    public void preencheCampoPorCss(String id_campo, String value) {

        driver.findElement(By.cssSelector(id_campo)).sendKeys(value);
    }

    public void clickPorCss(String css_campo) {

        driver.findElement(By.cssSelector(css_campo)).click();
    }

    public void clickPorxpath(String xpath_campo){
        driver.findElement(By.xpath(xpath_campo)).click();

    }

    public void clickPorNome(String name_campo) {

        driver.findElement(By.name(name_campo)).click();
    }

    public void clickPorId(String id_campo) {

        driver.findElement(By.id(id_campo)).click();
    }

    /**
     * Método para aguardar o elemento aparecer na página
     */
    }

    public static void SeleniumWaits() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Mobile");
		
		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gh-ac\"]")));

		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();

		driver.close();
		driver.quit();
	}
