package com.java.abdul.bari.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		ChromeOptions op =new ChromeOptions();
		op.setBinary("C:\\Users\\91973\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://guide.blazemeter.com/hc/en-us");
		Thread.sleep(5000);
		ArrayList<String> list = new ArrayList<String>();
		list.add("Functional Testing");
		list.add("Getting started");
		List<WebElement> list1= driver.findElements(By.xpath("//ul[@id='categories']/li"));
		for(WebElement el:list1) {
			System.out.println(el.getText());
		}
		System.out.println("Size of the list: "+list1.size());
	}

}
