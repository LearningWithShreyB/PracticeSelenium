package day01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice02_Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		username.sendKeys("Admin");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).isDisplayed();
		
		driver.findElement(By.partialLinkText("OrangeHRM")).isEnabled();

		driver.quit();
	}

}
