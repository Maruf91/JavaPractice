package qaclickacademy;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseActions {

	public WebDriver driver;
	
	
	//java Alerts handles
	@Test(enabled=false)
	public void basicAuthentication() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		String authText=driver.findElement(By.xpath("//div[@class='example']/p")).getText();
		System.out.println("The text is:"+authText);
		driver.close();
		
		
	}
	
	@Test(enabled=false)
	public void robotApiTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		Robot robot=new Robot();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-converter");
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Thread.sleep(7000);
		//js.executeScript("document.getElementById('file-upload').click()");
		//driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		//driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		
		robot.setAutoDelay(2000);
		//below 2 lines work for CTRL+C
		StringSelection stc=new StringSelection("C:\\Users\\Maruf\\Downloads\\menu.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stc, null);
		robot.setAutoDelay(2000);
		
		//below 2 lines work for CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
		
		
	}
	
	@Test
	public void frameSwitching() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
	
	
	
	
	
}
