package qaclickacademy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrokenLinksTest {

	
public WebDriver driver;
	
	@BeforeTest
	public void urlLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	
	@Test
	public void brokenLinksSearch() throws MalformedURLException, IOException {
		SoftAssert sa=new SoftAssert();
		List<WebElement> Links=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		for(WebElement Link:Links) {
			
			String url=Link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println("The response code is: "+respCode);
			sa.assertTrue(respCode<400, "The broken Link is: "+url+" with response code:"+respCode);//it will check all the links and broken links will be shown
		}
		sa.assertAll();
		
		
		driver.close();
	}

}
