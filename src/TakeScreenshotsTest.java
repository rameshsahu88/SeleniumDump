import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class TakeScreenshotsTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         ChromeOptions Opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		driver.manage().deleteAllCookies();
		
		TakesScreenshot Ts= (TakesScreenshot)driver;
		 File Src = Ts.getScreenshotAs(OutputType.FILE);
		 File Dstn = new File(("C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Screenshots\\test.png"));
		 FileUtils.copyFile(Src, Dstn);
		 
		   
		
		
	
	}

}
