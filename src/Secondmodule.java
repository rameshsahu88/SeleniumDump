import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Durations;

public class Secondmodule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver",
				"C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browserdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

					
		
		
		// System.setProperty("Webdriver.edge.driver","C:\\Users\\Ramesh
		// Sahu\\Desktop\\Selenium\\Browser
		// driver\\edgedriver_win64.zip\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();;

		// System.setProperty("Webdriver.Gecko.driver", "C:\\Users\\Ramesh
		// Sahu\\Desktop\\Selenium\\Browser
		// driver\\geckodriver-v0.32.2-win-aarch64.zip\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);
		System.out.println("Test read is above");
		int numofLinks = driver.findElements(By.className("headerIcons")).size();
		
		//String[] arrayLinks = new String[numofLinks];
		//numofLinks = driver.findElements(By.className("headerIcons")).size();

		System.out.println("Number of links " +numofLinks);
		for (int i = 0; i < numofLinks; i++) {

			driver.findElements(By.className("headerIcons")).get(i).click();
			//Thread.sleep(10000);
			System.out.println(driver.findElements(By.className("headerIcons")).get(i).getAttribute("href"));

		}
        Thread.sleep(10);
		System.out.println("Out of loop");
        Thread.sleep(10);
		driver.findElement(By.xpath("//p[@data-cy='LoginHeaderText']")).click();
		
				
		//driver.findElement(By.cssSelector("span[class='userNameIcon whiteText makeFlex perfectCenter latoBlack appendRight10']")).click();
		//System.out.println(driver.findElements(By.className("userNameIcon whiteText makeFlex perfectCenter latoBlack appendRight10")).size());;
		System.out.println("loggin clicked");

		driver.close();

	}

}
