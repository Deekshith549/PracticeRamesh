package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    //  //a[@value='BLR'] - xapth for bengaluru
		// //a[@value='MAA']  - xpath for chennai
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='BLR']")).click();
	    Thread.sleep(2000); 
	    
	    // Apporach-1
	    //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  // sometimes wrong way to find
       
	    //Apporach-2
	    //Parent-child relationship to identify the object uniquely
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
