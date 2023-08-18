package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingPractice2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mocrefund.crcs.gov.in/");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//label[text()='आवेदन कैसे करें?']")).click();
		 Set<String> S= driver.getWindowHandles();
		    java.util.Iterator <String> sh=S.iterator();
		    while (sh.hasNext())
		    {
		    	String child_window=sh.next();


		    	if(!parent.equals(child_window))
		    	{
		    	driver.switchTo().window(child_window);
		  }

	  }

	}

}
