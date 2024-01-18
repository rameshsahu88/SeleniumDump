import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AirlineFilters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver",
				"C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		Thread.sleep(15000);
		Actions Act = new Actions(driver);
		Act.click().build().perform();
		Thread.sleep(5000);
		Act.scrollByAmount(15, 2000).build().perform();

		System.out.println("Screen is scrolled ");
		if (driver.findElement(By.xpath("//div[@class='hsw v2']")).isDisplayed() == true) {
			System.out.println("Enterred in if loop");
			Act.scrollByAmount(15, 4000).build().perform();
			Thread.sleep(2000);
			Act.scrollByAmount(15, 10000).build().perform();
			Act.scrollToElement(driver.findElement(By.xpath("//p[@class='appendBottom15']/span"))).click().build()
					.perform();

			// driver.findElement(By.xpath("//p[@class='appendBottom15']/span")).click();
			WebElement driverArln = driver.findElement(By.xpath("//div[@class='listingLhs']/div/div[position()=6]"));
			List<WebElement> chkbxAirlineName = driverArln.findElements(By.id("listingFilterCheckbox"));
			System.out.println("Total Airliknes available " + chkbxAirlineName.size());
			for (int i = 0; i < chkbxAirlineName.size(); i++) {
				System.out.println("Airline names are - "
						+ driverArln.findElements(By.xpath("//div[@class='checkboxContent']/p")).get(i).getText());
				// System.out.println("Airline names are - "
				// +chkbxAirlineName.get(i).getText());
			}

		}
		driver.close();
	}

}
