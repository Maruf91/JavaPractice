package qaclickacademy;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollingExample {
	public WebDriver driver;
	@BeforeTest
	public void urlLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	@Test
	public void scrollToTest() throws InterruptedException {
		int sum=0;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("$(document.querySelector('.tableFixHead').scrollTo(0,900))");
		
		List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody/tr/td[4]"));
		for(WebElement value:values) {
		  int a= Integer.parseInt(value.getText());
		    sum=sum+a;
			System.out.println("The value is: "+a);
			
		}
		System.out.println("Total value is: "+sum);
		driver.close();
	}
	
}
