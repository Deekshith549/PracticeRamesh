package corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SaharaMethodsPrac {
	WebDriver driver;

	@Before
	public void beforeScenario() {
		System.out.println("i am S before");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@After
	public void afterScenario() {
		System.out.println("i am S after");
		driver.quit();
	}

	@Given("user launches the website")
	public void LunchWebsite() {

		driver.get("https://mocrefund.crcs.gov.in/");
	}

	@When("user click on the Depositor link")
	public void ClickOnproducts() {
		driver.findElement(By.xpath("//*[@id=\"main-menu-link-content5e8469ae-9ce4-49de-b055-74096f3333bf\"]")).click();
	}

	@Then("user should be redirected to a Depositor page with URL containing products")
	public void VerifyUrl() {
		String s2 = driver.getCurrentUrl();
		System.out.println("my current url " + s2);
		Assert.assertTrue(s2.contains("Depositor"));
	}
}
