package assignment;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		String mainwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> s1=driver.getWindowHandles();
		java.util.Iterator<String> it=s1.iterator();
		
		while(it.hasNext()) {
			String child=it.next();
			if(!mainwindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("emailid")).sendKeys("ramesh.vmd@gamil.com");
			}
		}

	}

}
