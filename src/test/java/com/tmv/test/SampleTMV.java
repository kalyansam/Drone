package com.tmv.test;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.selenium.objectrepo.ProductPage_OR;
import com.tmv.resusables.Resuables;
import com.tmv.utilities.FileUtilities;

public class SampleTMV extends Resuables implements ProductPage_OR {
	
	FileUtilities utility = new FileUtilities();

	@Test
	public void testTmv() throws InterruptedException, IOException {
		
		WebElement d = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		Actions d1 = new Actions(driver);
		d1.moveToElement(d).build().perform();
		driver.findElement(By.className("nav-action-inner")).click();
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(email)));
		login(utility.getProperties("username"), utility.getProperties("password"));
		Thread.sleep(2000);
	driver.findElement(prodcutDropdown).click();
	Select items = new Select(driver.findElement(prodcutDropdown));
	items.selectByVisibleText("Cell Phones & Accessories");
	driver.findElement(search).click();
	Thread.sleep(3000);
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("window.scrollBy(0,1000)");
	 driver.findElement(TLink).click();
	 Thread.sleep(2000);
	 driver.findElement(Tlink1).click();
//		String Errormsg = "Your password is incorrect";
//		String Actualmsg = driver.findElement(errorMessage).getText();
//		Assert.assertEquals(Errormsg, Actualmsg,"Error msg not displayed");
//		signout();
	
		
	}
	
	
}
