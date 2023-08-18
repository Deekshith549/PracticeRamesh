package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); // id
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); // name
		driver.findElement(By.className("signInBtn")).click(); // classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John"); // x-path
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ram@iop"); // css
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // x-path with []index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com"); // css with
																											// index use
																											// (nth-child[])
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn ")).click(); // css with .
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); // css=#id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // css in half value
																									// use *
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath(" //button[contains(@class,'submit')]")).click(); // x-path=half value use contains
																						// and ,

	}
}
