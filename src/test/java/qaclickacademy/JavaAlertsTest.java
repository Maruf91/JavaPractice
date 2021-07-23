package qaclickacademy;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertsTest {
	public  WebDriver driver;
	
	
	public void urlLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void JSAlertTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();
		String ResultText=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result JSAlertTest string is:"+ResultText);
		Thread.sleep(5000);
		}
	
	
	
	public void jsConfirmAlert() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert().accept();
		String ResultText=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result jsConfirmAlert string is:"+ResultText);
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert().dismiss();
		String ResultText2=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result jsConfirmAlert string is:"+ResultText2);
	}
	

	public void JSPrompt() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("Hello");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		String ResultText=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println("Result JSAlertTest string is:"+ResultText);
		
		}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		JavaAlertsTest jat=new JavaAlertsTest();
		jat.urlLaunch();
		jat.JSAlertTest();
		jat.jsConfirmAlert();
		jat.JSPrompt();
		jat.closeBrowser();
		
		
	}

}
