package day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Testing Xpath Locators");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement male=driver.findElement(By.xpath("//input[@class='form-check-label' and @id='male]"));
		boolean status1=male.isSelected();
		System.out.println(status1);
		male.click();
		status1=male.isSelected();
		System.out.println(status1);
		
		
	}

}
