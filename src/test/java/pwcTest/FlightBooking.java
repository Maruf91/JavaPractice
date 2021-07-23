package pwcTest;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pwcBaseClass.pwcBaseClass;

public class FlightBooking extends pwcBaseClass{

	@Test(priority=1)
	public void setup() throws InterruptedException {
		
		launchUrl();
		
	}
	
	@Test(priority=2)
	public void flightCheck() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("ccu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Kolkata, India']")).click();
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("mum");
		/*WebElement ele=driver.findElement(By.xpath("//input[@placeholder='To']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arg[0].click()",ele);
		ele.sendKeys("del");*/
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Jul 08 2021']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[text()='View Prices'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Book Now'][1]")).click();
		
	}
	@Test(priority=3)
	public void reviewBooking() throws InterruptedException {
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow= it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		String TargerText=driver.findElement(By.xpath("//span[text()='Total Amount:']")).getText();
		System.out.println("The Target text is: "+TargerText);
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
	
	
	
}
