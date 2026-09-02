package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Testing CSS Selectors Locators");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#name")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#name")).sendKeys("Mobile");
		
		driver.findElement(By.cssSelector("input.form-check-input")).click();
		
		
		driver.findElement(By.cssSelector("input[placeholder='Enter EMail']")).sendKeys("abc@abc.com");
		driver.findElement(By.cssSelector("[placeholder='Enter Phone']")).sendKeys("12345678909");
		
		
		driver.findElement(By.cssSelector(".form-check-input[value='female']")).click();
		
		driver.quit();

	}

}
