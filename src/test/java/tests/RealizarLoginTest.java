public class RealizarLoginTest {

	private ChromeDriver driver;
	private Utils utils;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		utils = new Utils(driver);
		driver.manage().window().maximize();
	}

	@Test
	public void logar() {

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		driver.findElement(By.id("email")).sendKeys("lay@qa.com");
		driver.findElement(By.id("passwd")).sendKeys("babaca");
		driver.findElement(By.name("SubmitLogin")).click();
    }

	@After
	public void afterCenario() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

}
