package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Basic_class 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Idcardkodro");
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		username.sendKeys("kotte");
}
}
