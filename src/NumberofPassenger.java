import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberofPassenger {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browser driver\\chromedriver_win32.zip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		
		NumberofPassenger Numpas = new NumberofPassenger();
		
		//**********************Adult passenger selection*****************
		int numberOfadultPsngr=5;
		driver.findElement(By.xpath("//p[@class='blackText font20 code lineHeight36']/span/span")).click();
		Thread.sleep(3000);
		List<WebElement> PassengerCntList = driver.findElements(By.xpath("//div[@class='fltTravellers gbTravellers']/div/ul/li"));
		System.out.println("total list" +PassengerCntList.size());
		for(int i=0;i<PassengerCntList.size();i++)
		{
			//System.out.printlndriver(.findElements(By.xpath("//div[@class='fltTravellers gbTravellers']/div/ul/li")).get(i).getText());
			String cntPsg = driver.findElements(By.xpath("//div[@class='fltTravellers gbTravellers']/div/ul/li")).get(i).getText();
			if (Integer.parseInt(cntPsg) == numberOfadultPsngr)
			{
				driver.findElements(By.xpath("//div[@class='fltTravellers gbTravellers']/div/ul/li")).get(i).click();
				System.out.println("Number of adult passenger "+driver.findElements(By.xpath("//div[@class='fltTravellers gbTravellers']/div/ul/li")).get(i).getText());
				Numpas.TakeScreenshot(driver,1);
				
				break;
			}
					
		
		}
		
		
//**********************Children selection*******************************		
		
		int numberOfchildPsngr=6;
		System.out.println("Child selectionn started");
		List<WebElement> PassengerChildCntList = driver.findElements(By.xpath("//div[@class='makeFlex column childCounter']//li"));
		System.out.println("total child list" +PassengerChildCntList.size());
		for(int i=0;i<PassengerChildCntList.size();i++)
		{
			//System.out.printlndriver(.findElements(By.xpath("//div[@class='fltTravellers gbTravellers']/div/ul/li")).get(i).getText());
			String cntChldPsg = driver.findElements(By.xpath("//div[@class='makeFlex column childCounter']//li")).get(i).getText();
			if (Integer.parseInt(cntChldPsg) == numberOfchildPsngr)
			{
				driver.findElements(By.xpath("//div[@class='makeFlex column childCounter']//li")).get(i).click();
				System.out.println("Number of adult passenger "+driver.findElements(By.xpath("//div[@class='makeFlex column childCounter']//li")).get(i).getText());
				Numpas.TakeScreenshot(driver,2);
				break;
				
			}
					
		
		}
		
		driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

	public void TakeScreenshot(ChromeDriver driver,int i) throws IOException
	{
		
		TakesScreenshot tkScn=(TakesScreenshot)driver;
		File Src =tkScn.getScreenshotAs(OutputType.FILE);
		File Trg = new File("C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Screenshots\\screenshot"+this.getClass().getName()+i+".jpg");
		FileUtils.copyFile(Src, Trg);
		
		System.out.println("Screenshot taken ");
		
	}
	public void TakeScreenshot1(ChromeDriver driver,int i) throws IOException
	{
		
		TakesScreenshot tkScn=(TakesScreenshot)driver;
		File Src =tkScn.getScreenshotAs(OutputType.FILE);
		File Trg = new File("C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Screenshots\\screenshot"+this.getClass().getName()+i+".jpg");
		FileUtils.copyFile(Src, Trg);
		
		System.out.println("Screenshot taken ");
		
	}
}

