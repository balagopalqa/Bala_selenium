package Window_Switch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWindow {

	public static WebDriver driver;

	public static void main(String[] args) {

		// Create a new instance of the Firefox driver
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL

        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        // Click on the Button "Alert Box"

        driver.findElement(By.id("alert")).click();

        // Switch to JavaScript Alert window

        Alert myAlert = driver.switchTo().alert();

        // Accept the Alert

        myAlert.accept();

        // Close Original window

      //  driver.close();

}


}
