import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		ChromeOptions opt = new ChromeOptions();
		driver.get("https://www.google.com");
		System.gc();
		

	}

}
