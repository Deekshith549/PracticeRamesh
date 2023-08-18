package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSLawcet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lawcet.tsche.ac.in/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//li[@class='home']")).click();
		driver.findElement(By.xpath("//li[@class='about']")).click();
		driver.close();
		/*driver.findElement(By.xpath("//li[@class='cour']")).click();
		driver.findElement(By.xpath("//li[@class='elig']")).click();
		driver.findElement(By.xpath("//li[@class='zones']")).click();
		driver.findElement(By.xpath("//li[@class='contact']")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Hall Ticket')]")).click();
		driver.findElement(By.xpath("//a[@href='TSLAWCET/TSLAWCET_GetPrintApplication.aspx']/b")).click();
	   */
		
		/*driver.findElement(By.xpath("//a[contains( text(),\"Test\")]")).click();
	   Thread.sleep(3000);
	   driver.close();*/
	}

}
//a[contains( text(),"Test")]//