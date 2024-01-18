import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userTypeSelected ="Doctors";
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.makemytrip.com/flights/");
		List<WebElement> listCustomertype = driver.findElements(By.xpath("//ul[@class='specialFareNew']/li/p"));
		for (int i = 0; i < listCustomertype.size(); i++) {
		   if(driver.findElements(By.xpath("//ul[@class='specialFareNew']/li/p")).get(i).getText().contains(userTypeSelected))

		   {
			   System.out.println("Selected value is bool-"+driver.findElements(By.xpath("//ul[@class='specialFareNew']/li")).get(i).isSelected());
			if (driver.findElements(By.xpath("//ul[@class='specialFareNew']/li")).get(i).isSelected() == true) {

			System.out.println("Cutomer Fare type is already selected - "
						+ driver.findElements(By.xpath("//ul[@class='specialFareNew']/li/p")).get(i).getText());
			} 
			else {
				
			 	driver.findElements(By.xpath("//ul[@class='specialFareNew']/li/p")).get(i).click();
			 	System.out.println("Cutomer type fare selected"+driver.findElements(By.xpath("//ul[@class='specialFareNew']/li/p")).get(i).getText());	
			 	System.out.println("Selected value is bool-"+driver.findElements(By.xpath("//ul[@class='specialFareNew']/li/p")).get(i).isSelected());
			}
				

		   }
		}

	}

}
