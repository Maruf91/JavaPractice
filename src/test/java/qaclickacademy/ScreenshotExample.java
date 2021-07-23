package qaclickacademy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotExample {

public  WebDriver driver;
	
	@BeforeTest
	public void urlLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void Screenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	    String dest=System.getProperty("user.dir")+"\\reports\\"+"test.png";
	    //String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	    FileUtils.copyFile(source, new File(dest));
	    driver.close();
	    
	
}
}
