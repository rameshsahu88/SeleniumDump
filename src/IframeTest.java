import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		driver.findElement(By.xpath("//span[text()='File']")).click();
		
		Actions Act = new Actions(driver);
		Act.sc
		
		
	}

}
