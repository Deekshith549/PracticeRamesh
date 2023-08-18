package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingPractice {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[@class='ntc__chip-label']")).click();
	    Set<String> s= driver.getWindowHandles();
	    java.util.Iterator <String> I1=s.iterator();
	    while (I1.hasNext())
	    {
	    	String child_window=I1.next();


	    	if(!parent.equals(child_window))
	    	{
	    	driver.switchTo().window(child_window);
	  }

  }
	    	
	    	
	    
	}

}
