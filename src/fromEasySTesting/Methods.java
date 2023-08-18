/*package fromEasyTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.*;
import io.cucumber.java.hu.Ha;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
	WebDriver driver;
	
	@Given("the user launches the website")
	public void LunchWebsite(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://be10x.in/");
	}
	@When("the user clicks on the Blog link")
	public void clickOnBlog() {
		driver.findElement(By.xpath("//*[@id='menu-item-3668']/a/span[2]")).click();
	}
	@Then("the user should be redirected to a blog page with URL containing blog")
	public void verifyUrl() {
			String s=driver.getCurrentUrl();
			System.out.println("my currect url is "+s);
			Assert.assertTrue(s.contains("blog"));
			}
	
}*/
package fromEasySTesting;


