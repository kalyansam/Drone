package com.tmv.test;

import java.io.IOException;
import java.util.List;

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

import com.relevantcodes.extentreports.ExtentReports;
import com.selenium.objectrepo.ProductPage_OR;
import com.tmv.resusables.Resuables;
import com.tmv.utilities.FileUtilities;

public class SampleTMVTest extends Resuables implements ProductPage_OR {

	FileUtilities utility = new FileUtilities();

	@Test
	public void testTmv() throws InterruptedException, IOException {
        ExtentReports extent=new ExtentReports("C://Users//t160670//Downloads//TMV%20Details//TMV_Eclipse//Drone25//report.html", true);
        extent.startTest("amazon");
		WebElement d = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		Actions d1 = new Actions(driver);
		d1.moveToElement(d).build().perform();
		driver.findElement(By.className("nav-action-inner")).click();
		witforElement(email);
		login(utility.getProperties("username"), utility.getProperties("password"));
		Thread.sleep(6000);
		driver.findElement(cart).click();
		Thread.sleep(3000);
		List<WebElement>product = driver.findElements(delete);
		if(product.size()!=0) {
		driver.findElement(delete).click();
		}
	
		//witforElement(prodcutDropdown);
		//driver.findElement(prodcutDropdown).click();
		Select items = new Select(driver.findElement(prodcutDropdown));
		items.selectByVisibleText("Cell Phones & Accessories");
		driver.findElement(search).click();
		witforElement(TLink);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(TLink).click();
		witforElement(Tlink1);
		driver.findElement(Tlink1).click();
		driver.findElement(AddToCart).click();
		//witforElement(no_thanks);
		Thread.sleep(5000);
		driver.findElement(no_thanks).click();
		driver.findElement(proceed).click();
		// String Errormsg = "Your password is incorrect";
		// String Actualmsg = driver.findElement(errorMessage).getText();
		// Assert.assertEquals(Errormsg, Actualmsg,"Error msg not displayed");
		// signout();
		extent.flush();

	}

}
