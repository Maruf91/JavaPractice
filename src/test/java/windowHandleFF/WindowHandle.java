package windowHandleFF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandle {

	public static void main(String[] args) {
	        
			// Setting system properties of FirefoxDriver
	        //System.setProperty("webdriver.gecko.driver","./src/main/java/resources/geckodriver.exe");
	        System.setProperty("webdriver.chrome.driver","./src/main/java/resources/chromedriver_110.exe"); 
	       
	        //WebDriver driver = new FirefoxDriver();
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/browser-windows");

	        // Open new child window within the main window
	        driver.findElement(By.id("windowButton")).click();
	        //Get handles of the windows
	        String mainWindowHandle = driver.getWindowHandle();
	        System.out.println("main window handle id is: " +mainWindowHandle);
	        //Set<String> allWindowHandles = driver.getWindowHandles();
	        
	        List<String> allWindowHandles= new ArrayList<String>();
	        allWindowHandles.addAll(driver.getWindowHandles());
	        
	        //Iterator<String> iterator = allWindowHandles.iterator();

	        /* Here we will check if child window has other child windows and will 
	        fetch the heading of the child window */
	        
	        for(int i=0; i<allWindowHandles.size(); i++) {
	        	System.out.println("each window id in for loop : "+allWindowHandles.get(i));
	        }
	        		driver.switchTo().window(allWindowHandles.get(1));
	        	
	        
	        
	        
	        /******* use of for-each loop  ********************/
	       
	        /*for(String eachHandleID:allWindowHandles) {
	        	System.out.println("Each handle is : "+eachHandleID);
	        	if(!mainWindowHandle.equalsIgnoreCase(eachHandleID)) {
	        		driver.switchTo().window(eachHandleID);*/
	        	
	      
	        
	        
	        /*while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	            	System.out.println("child window handle id is: " +ChildWindow);
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);*/
	        
	                System.out.println("***************Switched to child window**********");
	                WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	                System.out.println("Heading of child window is: " + text.getText());
	                driver.close();
	                driver.switchTo().window(allWindowHandles.get(0));
	                driver.close();
	        	
	        
	    }
}