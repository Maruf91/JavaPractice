package qaclickacademy;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement(By.xpath("//a[starts-with(@href,'/dynamic')][1]")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        final WebElement TargetText=driver.findElement(By.xpath("//div[@id='finish']/h4"));
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
        		.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
        
        {
            public WebElement apply(WebDriver driver) 
            {
            
            if(TargetText.isDisplayed())
            {
              return TargetText;
            }
            else
            	return null;
            }	
        }); //first bracket ends here for "until" method closing
        System.out.println(TargetText.getText());
        driver.quit();
}
	
}
