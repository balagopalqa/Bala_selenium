package Wait;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaits {
	@Test
	public static void fluentWaitMethod(){
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//button[text()='Click Me - Fluent Wait']")).click();
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(14, TimeUnit.SECONDS)
	       .pollingEvery(10, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
				String getTextOnPage = element.getText();
				if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
					System.out.println(getTextOnPage);
					return element;
				}else{
					System.out.println("FluentWait Failed");
					return null;
				}
			}
		});
	}
}