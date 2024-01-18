import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browser driver\\chromedriver_win32.zip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip%5D&ef_id=:G:s");

		String searchCity = "Mumbai";
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(searchCity);

		List<WebElement> nameAirport = driver.findElements(By.xpath("//div[@class='calc60']/p"));
		//System.out.println(nameAirport.size());

		for (int i = 0; i < nameAirport.size(); i++) {

			String Airportname = driver.findElements(By.xpath("//div[@class='calc60']/p")).get(i).getText();
			// System.out.println(Airportname);
			Thread.sleep(2000);
			if (Airportname.contains(searchCity)) {
				driver.findElements(By.xpath("//div[@class='calc60']/p")).get(i).click();
				System.out.println("Seected From Airport is " + Airportname);
				break;
			}

		}
		
		String ToCity = "Singapore";
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(ToCity);
		List<WebElement> toAirport = driver.findElements(By.xpath("//div[@class='calc60']/p"));
		//System.out.println(toAirport.size());
		for (int i = 0; i < toAirport.size(); i++) {

			String toAirportname = driver.findElements(By.xpath("//div[@class='calc60']/p")).get(i).getText();
			// System.out.println(Airportname);
			Thread.sleep(2000);
			if (toAirportname.contains(ToCity)) {
				driver.findElements(By.xpath("//div[@class='calc60']/p")).get(i).click();
				System.out.println("Seected To Airport is " + toAirportname);
				break;
			}

		}
		
		
		Thread.sleep(3000);
		
		
		
		driver.close();

	}

}
