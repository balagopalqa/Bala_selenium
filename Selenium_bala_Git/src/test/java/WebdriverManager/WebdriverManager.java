package WebdriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	
	
	// IN POM.XML
	/*
	 * <dependency> <groupId>io.github.bonigarcia</groupId>
	 * <artifactId>webdrivermanager</artifactId> <version>3.1.1</version>
	 * <scope>test</scope> </dependency>
	 */
	@Test
	public void browser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(); 
    
	driver.get("http://www.facebook.com");
	}
}
