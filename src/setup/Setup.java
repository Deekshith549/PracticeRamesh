package setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle()); 
        System.out.println(driver.getCurrentUrl());
        //driver.close();
       // driver.quit();
	}

}
 