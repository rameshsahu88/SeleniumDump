import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeteSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String userMnth = "March";
		int userYear = 2024;
		int userday = 31;

		System.setProperty("Webdriver.Chrome.Driver",
				"C:\\Users\\Ramesh Sahu\\Desktop\\Selenium\\Browser driver\\chromedriver_win32.zip\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='departure']")).click();

		// List<WebElement> listMonth =
		// driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));

		String CalenderMntYr = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']")).get(0).getText();
		String[] MnthYrStr = new String[2];
		MnthYrStr = CalenderMntYr.split(" ");
		Boolean datefound = false;
		int cldYr = Integer.parseInt(MnthYrStr[1]);

		// System.out.println("Whie loop started");

		while (datefound != true)

		{
			// System.out.println("If loop started");
			CalenderMntYr = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']")).get(0).getText();
			MnthYrStr = CalenderMntYr.split(" ");
			cldYr = Integer.parseInt(MnthYrStr[1]);
			if (MnthYrStr[0].compareToIgnoreCase(userMnth) == 0)

			{
				// System.out.println("Year found started");

				Thread.sleep(3000);

				if (cldYr == userYear) {

					// select date
					System.out.println("Year and month matched");
					List<WebElement> cntDay = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p"));

					String[] selectDayvalue = new String[2];
					// for (int x = 0; x < 12; x++)
					for (int x = 0; x < cntDay.size(); x++) {
						// y = y + 2;

						// if
						// (driver.findElements(By.xpath("//div[@class='dateInnerCell']/p")).get(x).isEnabled())
						{
							// System.out.println("Days Value "
							// +
							// driver.findElements(By.xpath("//div[@class='dateInnerCell']")).get(x).getText());
							// Thread.sleep(2000);
							String[] selectDay = new String[2];
							selectDay[0] = "";
							// System.out.println("Out of boind value "
							// +driver.findElements(By.xpath("//div[@class='dateInnerCell']/p")).get(x+1).getText()+"
							// Array value "+selectDay[0]);
							selectDay[0] = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p")).get(x + 1)
									.getText();

							// System.out.println("Select Day from browser is "+selectDay[0]+" and "
							// +selectDay[1]);
							// System.out.println(selectDay[0] + " Before Split value");
							selectDayvalue = selectDay[0].split("₹");

						}
						// Thread.sleep(2000);
						// System.out.println("Length is "+selectDayvalue.length+" Final days value
						// after split "+selectDayvalue[0]+"and " +selectDayvalue[0]);
						if (selectDayvalue[0].length() > 0)

						{

							int selectdays = Integer.parseInt(selectDayvalue[0]);
							System.out.println("Please select the day " + selectdays);

							if (userday == selectdays) {
								System.out.println("Flight charges are " + driver
										.findElements(By.xpath("//div[@class='dateInnerCell']/p")).get(x).getText());
								datefound = true;
								driver.findElements(By.xpath("//div[@class='dateInnerCell']/p")).get(x + 1).click();
								driver.findElement(By.xpath("//p[@class='makeFlex vrtlCenter ']/a")).click();
								

								break;

							}
						}

					}
				}
			} else {

				Thread.sleep(2000);
				System.out.println("current year is " + MnthYrStr[1]);
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

			}
		}

		// else
		{

			Thread.sleep(2000);
			System.out.println("current Month is " + MnthYrStr[0]);
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			Thread.sleep(2000);
		}
		driver.close();
	}

}
