package com.accesshq.opgg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

	protected WebDriver driver;
	
	public BasePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickHomePage() {
		driver.findElement(By.className(".menu [href='/'")).click();;
	}
	
	public void clickChampionsPage() {
		driver.findElement(By.cssSelector(".menu [href='/champion/statistics']")).click();
	}
	
	public void clickStatsPage() {
		driver.findElement(By.className(".menu [href='/statistics/']")).click();
	}
	
	public void setSearchbarName(String summonerName) {
		driver.findElement(By.cssSelector("[name='userName']")).sendKeys(summonerName);
	}
}
