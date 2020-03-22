package com.accesshq.opgg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickSearch() {
		driver.findElement(By.cssSelector(".__spSite")).click();;
	}

	
	
	

}
