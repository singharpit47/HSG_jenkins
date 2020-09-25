package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String args[]) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","$JENKINS_HOME/tools/chromedriver/chromedriver.ext");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("xyz");
		driver.findElement(By.id("pass")).sendKeys("xyz");
		driver.findElement(By.id("u_0_b")).click();
		
	}

}
