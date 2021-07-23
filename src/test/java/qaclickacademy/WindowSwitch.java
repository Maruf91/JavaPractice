package qaclickacademy;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
        Iterator<String>it = windows.iterator();

		String parentId = it.next();
		String childId = it.next();	
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.xpath("(//*[text()='New Window'])[2]")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//*[text()='Opening a new window']")).getText());
		driver.quit();
	}

}
