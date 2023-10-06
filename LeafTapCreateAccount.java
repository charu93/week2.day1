package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapCreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		String str = "Charmila";
		driver.findElement(By.id("accountName")).sendKeys(str);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select s = new Select(industry);
		s.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select s1 = new Select(ownership);
		s1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select s2 = new Select(source);
		s2.selectByValue("LEAD_EMPLOYEE");

		WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		Select s3 = new Select(marketing);
		s3.selectByIndex(5);

		WebElement stateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select s4 = new Select(stateProvince);
		s4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement err = driver.findElement(By.className("errorMessage"));
	System.out.println(err.getText());
//		WebElement accountName = driver.findElement(By.linkText("Charmila  (11508)"));
//		if (accountName.equals(str)) {
//			System.out.println("The entered name is correct");
//		} else {
//			System.out.println(str + " name is present wrongly");
//		}

	}

}
