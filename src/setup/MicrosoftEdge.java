package setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MicrosoftEdge {

	public static void main(String[] args) {
		//WebDriverManager.getWebDriver().setup();
				WebDriver driver= new EdgeDriver();
				driver.manage().window().maximize();
		        driver.get("https://rahulshettyacademy.com");
		        System.out.println(driver.getTitle()); 
		        System.out.println(driver.getCurrentUrl());
		        //driver.close();
		       // driver.quit();


	}

}
