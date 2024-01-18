import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.openqa.common.io.Files;
import com.google.common.io.FileUtils;

public class PassportRegitration_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://portal2.passportindia.gov.in/");
		Actions Act=new Actions(driver);
		System.out.println("Please click");
		Thread.sleep(5000);
		Act.moveToElement(driver.findElement(By.xpath("//a[@class='twoyears-close-btn']"))).click().build().perform();
		//Thread.sleep(3000);
		Act.moveToElement(driver.findElement(By.xpath("//li[@id='passportoffices']/a"))).click().build().perform();
		//Act.clickAndHold(driver.findElement(By.xpath("//li[@id='passportoffices']/a"))).click().build().perform();
		//Thread.sleep(2000);
		//Act.moveToElement(driver.findElement(By.xpath("//a[@id='passportoffices1']"))).click().build().perform();
		//Act.click(driver.findElement(By.xpath("//a[@id='passportoffices1']"))).build().perform();
		//Act.moveToElement(driver.findElement(By.xpath("//a[text()='Passport Offices in India']"))).click().build().perform();
		
		//Act.click(driver.findElement(By.xpath("//a[text()='Passport Offices in India']"))).build().perform();
		
		
		//li[@id='passportoffices']/a
		
		//driver.switchTo().alert().dismiss();
		/*
		 * Set<String> Windowshandle=driver.getWindowHandles(); Iterator<String>
		 * Itr=Windowshandle.iterator(); String ParentWinId = Itr.next(); String
		 * ChildWinID = Itr.next(); driver.switchTo().window(ChildWinID);
		 Thread.sleep(5000);
		 * driver.findElement(By.xpath("//a[@class='twoyears-close-btn']"));
		 */
		
		Select selLoc = new Select(driver.findElement(By.id("dcdrLocation")));
		
		selLoc.selectByVisibleText("Goa");
		String selcvale = selLoc.getFirstSelectedOption().getText();
		System.out.println("Selected item is - "+selcvale);
		System.out.println("Selected item directly - "+selLoc.getFirstSelectedOption().getText());
		Set<String> WinHandle = driver.getWindowHandles();
		Iterator<String> Itr=WinHandle.iterator();
		String ParentWnd = Itr.next();
		String ChildWnd = Itr.next();
		driver.switchTo().window(ChildWnd);
		System.out.println("Visited on location page "+driver.getTitle());
		
		
		TakesScreenshot tkScn=(TakesScreenshot)driver;
		File Src =tkScn.getScreenshotAs(OutputType.FILE);
		File Trg= new File("C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Screenshots\\screenshot.jpg");
		//FileUtils.
	
	}

}
