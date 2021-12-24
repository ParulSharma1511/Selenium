package comm100.loginpage;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Irctclogin {
	
	WebDriver driver;
	
	@Test
	public void irctclogin()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("WebDriver.chrome.driver", "path of driver executable");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    	driver.get("https:\\irctc.com");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("parul");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@id='button']")).click();
		
		String actualresult="https:\\irctc.com";
		String Expectedresult="https:\\usuusu.com";
		Assert.assertEquals(Expectedresult, actualresult);
	}

	//public static void main(String[] args) {
		

	}


