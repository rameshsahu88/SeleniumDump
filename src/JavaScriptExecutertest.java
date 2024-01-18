import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.espncricinfo.com/");
		//driver.findElement(By.xpath("//a[text()='Search']")).click();
		JavascriptExecutor Js= (JavascriptExecutor)driver;
		
	    Js.executeScript("window.scrollBy(5,2500)");
	    
		

	}

}
