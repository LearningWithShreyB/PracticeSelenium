package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Testing CSS Selectors Locators");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.cssSelector("input#name")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#name")).sendKeys("Mobile");

	}

}
