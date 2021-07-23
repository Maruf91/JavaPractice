package pwcBaseClass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Worldometer {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String combined_xpath="//div[text()='Today' or text()='This year' ]//parent::div//span[@class='rts-counter']";
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");

	    driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.worldometers.info/world-population/");
        int count=1;
		while(count<=10) {
		System.out.println("----------------The population is-----------------");	
		if(count==10) break;
		populationData(combined_xpath);
		System.out.println("====================================================");
		count++;
		}
		
		driver.quit();
	}
	
	public static void populationData(String locator) {
		
		
		List<WebElement> totalPop=driver.findElements(By.xpath(locator));
		for(WebElement e:totalPop) {
			System.out.println(e.getText());
		
		}
		
		
	}

}
