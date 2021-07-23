package qaclickacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBWS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maruf\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.navigate().to("https://kfplc-my.sharepoint.com/:x:/r/personal/biswag02_kits_kfplc_com/_layouts/15/guestaccess.aspx?email=MdMaruf.Mallick%40kingfisher.com&e=4%3AHG4tHh&at=9&CID=b8cf4e43-6d62-2e43-aa02-c3831046e577&share=ESKcwrxS7eFCn5nRu9e2xUIBAcxlbOn3B7LbRiyBoZZs9w");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Power7890");
	    
	}

}
