package Switch_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameSwitching {
	@Test
	public void iframes() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//HERE
   // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.manage().window().maximize();
	driver.get("http://www.toolsqa.com/iframe-practice-page/");
	Thread.sleep(3000);
//SWITCHING TO THE FRAME 
	
	//the below code id or name
//	driver.switchTo().frame("iframe1");
	
	//the below is by index 
	//driver.switchTo().frame(0);

	//the below is for web element 
	WebElement ele=driver.findElement(By.name("iframe1"));
	driver.switchTo().frame(ele);
	driver.findElement(By.xpath("//li[text()='Automation Practice Form']//preceding-sibling::li[@typeof='v:Breadcrumb']/child::a[text()='Home']")).click();

//SWITCHING BACK TO PARENT FRAME
//	driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	WebElement elem= driver.findElement(By.xpath("//h1[text()='IFrame practice page']"));
	String str1=elem.getText();
	System.out.println(str1);
	}
}
