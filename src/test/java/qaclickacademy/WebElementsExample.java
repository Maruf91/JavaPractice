package qaclickacademy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsExample {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hubspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement productList=driver.findElement(By.xpath("(//div[@class='home-products-feature__card--list'])[1]/ul"));
       //List<WebElement> WL= productList.findElements(By.tagName("li"));
		List<WebElement> WL= driver.findElements(By.xpath("(//div[@class='home-products-feature__card--list'])[1]/ul"));
       for(WebElement element:WL) 
       {
	   System.out.println("list is: "+element.getText());	
	  
       }
       driver.quit();

	}

}
