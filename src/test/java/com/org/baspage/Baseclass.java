package com.org.baspage;

import java.util.concurrent.TimeUnit;
import javax.swing.text.Caret;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.selenium.objectrepo.ProductPage_OR;

public class Baseclass implements ProductPage_OR {

	public WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\t160670\\Downloads\\TMV Details\\TMV_Eclipse\\TMVSample\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();

	}

}
