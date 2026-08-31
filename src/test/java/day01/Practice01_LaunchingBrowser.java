package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practice01_LaunchingBrowser {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		String browser="chrome";
		
		switch(browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		default:
			System.out.println("Invalid Browser!!");
		}
		
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("Matched!!");
		}
		else {
			System.out.println("Not Matched!!");
		}
		
		driver.quit();
		

	}

}
