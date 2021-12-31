package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pgs\\eclipse-workspace\\BigTask\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	WebElement txtUsername = driver.findElement(By.xpath("input[@name='username']"));
	txtUsername.sendKeys("Manisengodi");
	
	}
	
}
