import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Withlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver",
				"C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browserdriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//p[@data-cy='LoginHeaderText']")).click();
Thread.sleep(5000);
		System.out.println("loggin clicked");
		
		
	driver.findElement(By.id("username")).click();
	System.out.println("username");
	driver.findElement(By.id("username")).sendKeys("rameshsahu88@gmail.com");
	System.out.println("enterred");
	Thread.sleep(10000);

	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/form[1]/div[2]/button[1]/span[1]")).click();
	//WebElement Btnn = driver.findElement(By.xpath("(//span[normalize-space()='Continue'])[1]"));
	
	//Actions Act= new Actions(driver);
	
	//Act.doubleClick(Btnn).perform();
	
	
	
	System.out.println("Clicked");
	
	//Thread.sleep(5000);
	//driver.close();
	
	}
}
