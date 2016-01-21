package automationFramework.testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by wdeister on 20/01/16.
 */
public class Login {

	public static WebDriver driver;

	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1280, 960));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void Login(){

		driver.get("http://master.plentymarkets.com/plenty/ui/admin.html");
		driver.findElement(By.)
		driver.findElement(By.id("login_username")).click();
		driver.findElement(By.id("login_username")).sendKeys("anonymous");

		driver.findElement(By.id("login_password")).click();
		driver.findElement(By.id("login_password")).sendKeys("YourMom");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@AfterTest
	public void closeWindow() {
		driver.close();
	}
}
