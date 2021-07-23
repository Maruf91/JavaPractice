package pwcBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pwcBaseClass {

	public WebDriver driver;
	
	public void launchUrl() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruf\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/flights/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
}
}
