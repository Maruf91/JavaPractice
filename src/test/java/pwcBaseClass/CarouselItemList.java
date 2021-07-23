package pwcBaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselItemList {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.noon.com/uae-en");
		driver.manage().window().maximize();
		//String recomended_sweep_xpath="(//div[@class='sc-eGCarw jqTxQZ']//div[contains(@class,'swiper-button-next custom-navigation swiper-nav')])[1]";
		//String trending_deals_sweep_xpath="(//div[@class='sc-eGCarw jqTxQZ']//div[contains(@class,'swiper-button-next custom-navigation swiper-nav')])[2]";
		String recom_items_xpath="(//div[@class='swiper-wrapper'])[3]//div[@class='sc-bXDlPE jFuWAH']//div[@class='kcs0h5-0 diNcmV grid']";
		sectionName(recom_items_xpath);
		driver.quit();

	}
	
	public static void sectionName(String recomItems) {
		
		List <WebElement> RecomItems=driver.findElements(By.xpath(recomItems));
		for(WebElement e:RecomItems) {
			System.out.println(e.getAttribute("title"));
			
		}
		
	}

}
