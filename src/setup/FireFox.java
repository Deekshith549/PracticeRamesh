package setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFox {

	public static void main(String[] args) {
		//WebDriverManager.getWebDriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle()); 
        System.out.println(driver.getCurrentUrl());
        //driver.close();
       // driver.quit();

	}

}
