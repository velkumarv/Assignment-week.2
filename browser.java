package week2.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("vels");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("velkumar");
		
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(element);
		dd1.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("velkumar");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1,00,000");
		
		WebElement Element = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 =new Select(Element);
		dd2.selectByIndex(9);
		WebElement element2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3 =new Select(element2);
		dd3.selectByValue("OWN_PROPRIETOR");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		WebElement element3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd4 = new Select (element3);
		dd4.selectByIndex(2);
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/10/1996");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
		
		WebElement element4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd5=new Select(element4);
		dd5.selectByValue("INR");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		WebElement ele = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		ele.clear();
		ele.sendKeys("+91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840654061");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("V");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("velkuma1996@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("14/13,bharathar street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Udangudi");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("628 203");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Udangudi");
		
		WebElement element5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd6=new Select(element5);
		dd6.selectByValue("IND");
		WebElement element6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd7=new Select(element6);
		dd7.selectByValue("IN-TN");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String text =driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
}
}
