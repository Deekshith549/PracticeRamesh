package locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsCssSelector {

	            public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				  WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        driver.manage().window().maximize();
		        driver.get("https://rahulshettyacademy.com/locatorspractice/");
		        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		        driver.findElement(By.className("signInBtn")).click();
		       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			}

		}
	


