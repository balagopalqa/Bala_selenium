package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	@Test
	public void impwait() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//HERE
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("new@gmail.com");
	}

}
