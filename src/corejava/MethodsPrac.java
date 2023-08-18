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

public class MethodsPrac {
	WebDriver driver;

	@Before
	public void beforeScenario() {
		System.out.println("i am before");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@After
	public void afterScenario() {
		System.out.println("i am after");
		driver.quit();
	}

	@Given("the user launches the website")
	public void LunchWebsite() {

		driver.get("https://www.virtualdj.com/");
	}

	@When("the user click on the products link")
	public void ClickOnproducts() {
		driver.findElement(By.xpath("//*[@id=\"topmenu-full\"]/li[2]/a")).click();
	}

	@Then("the user should be redirected to a products page with URL containing products")
	public void VerifyUrl() {
		String s1 = driver.getCurrentUrl();
		System.out.println("my current url is" + s1);
		Assert.assertTrue(s1.contains("products"));
	}
}
