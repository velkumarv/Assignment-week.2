package week2.day6;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kumar");
	driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vell");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("velkuma1996");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
	
	//driver.findElement(By.xpath("(//select[@name='birthday_day'])[3]")).click();
	//driver.findElement(By.xpath("(//select[@name='birthday_month'])[10]")).click();
	//driver.findElement(By.xpath("(//select[@name='birthday_year'])[1996]")).click();
	WebElement element = driver.findElement(By.id("day"));
	Select dd1=new Select (element);
	dd1.selectByValue("3");
	WebElement element2 = driver.findElement(By.id("month"));
	Select dd2=new Select(element2);
	dd2.selectByValue("10");
	WebElement element3 = driver.findElement(By.id("year"));
	Select dd3=new Select(element3);
	dd3.selectByValue("1996");
	driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	driver.close();
}
}
