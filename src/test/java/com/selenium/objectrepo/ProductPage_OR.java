package com.selenium.objectrepo;

import org.openqa.selenium.By;

public interface ProductPage_OR {
	
By prodcutDropdown = By.id("searchDropdownBox");
By searchProduct = By.id("twotabsearchtextbox");
By wrangler = By.xpath("(//img[@title='Wrangler'])[1]");
By search=By.className("nav-input");
By email=By.id("ap_email");
By Password=By.id("ap_password");
By signin=By.className("a-button-input");
By errorMessage=By.xpath("//div[@id='auth-error-message-box']//span");
By continuebutton=By.id("continue");
By signout=By.linkText("Sign Out");
By Search=By.xpath("//div[@class='nav-search-submit nav-sprite']");
By TLink=By.partialLinkText("Samsung Galaxy S8/8 Plus");
By Tlink1=By.partialLinkText("Samsung Galaxy S8 Unlocked 64GB ");

}

