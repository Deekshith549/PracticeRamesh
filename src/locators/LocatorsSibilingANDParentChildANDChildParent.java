package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsSibilingANDParentChildANDChildParent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Sibiling and parent to child travers
       ////header/div/button[1]     and    /following-sibling::button[1]
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //child to parent
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText()); //header/div/button[1]/parent::div/button[2]
	}

}
