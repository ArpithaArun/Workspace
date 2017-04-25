package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Login {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "/Users/vinod/Documents/workspace/node_modules/nightwatch/bin/geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.udemy.com/");
	driver.findElement(By.partialLinkText("Udemy for Busi")).click();
	Thread.sleep(10000);
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it= handles.iterator();
    String parentid = it.next();
    String childid = it.next();
    driver.switchTo().window(childid);
	
	driver.findElement(By.partialLinkText("Get a Free")).click();
	driver.switchTo().window(parentid);
	driver.findElement(By.xpath(".//*[@id='udemy']/div[2]/div[1]/div[2]/div[2]/form/div/input")).sendKeys("Selenium");
	
	//driver.quit();
	
	}

}
