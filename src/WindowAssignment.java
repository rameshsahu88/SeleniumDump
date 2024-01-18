import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		 Set<String> Windset = driver.getWindowHandles();
		 Iterator<String> It =  Windset.iterator();
		 String ParentWind = It.next();
		 String ChildWind= It.next();
		 driver.switchTo().window(ChildWind);
		 System.out.println("Child page name is - "+driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText());
		 driver.switchTo().window(ParentWind);
		 System.out.println("Parent page name - "+driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText());
		 
		 
		
	}

}
