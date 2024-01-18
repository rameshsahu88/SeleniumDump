import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificateISsue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions Options = new ChromeOptions();
		
		Options.setAcceptInsecureCerts(true);
		//Options.
		//Options.addExtension("C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\eclipse-java-2023-12-R-win32-x86_64\\eclipse\\eclipse.exe");
		
		
		
		WebDriver driver = new ChromeDriver(Options);
		driver.get("https://expired.badssl.com/");
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
	}

}
