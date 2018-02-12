package com.tmv.resusables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.baspage.Baseclass;
import com.selenium.objectrepo.ProductPage_OR;

public class Resuables extends Baseclass implements ProductPage_OR {

	public void login(String usrname, String password) throws InterruptedException {
		driver.findElement(email).sendKeys(usrname);
		Thread.sleep(3000);
		 List<WebElement> item =driver.findElements(continuebutton);
		if (item.size()!=0) {
			driver.findElement(continuebutton).click();
		}

		driver.findElement(Password).sendKeys(password);
		driver.findElement(signin).click();
	}

	
	public void witforElement(By by) {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
	}
//	public void signout()
//	{
//		WebElement d = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
//		Actions d1 = new Actions(driver);
//		d1.moveToElement(d).build().perform();
//		driver.findElement(signout).click();
//	}
}
