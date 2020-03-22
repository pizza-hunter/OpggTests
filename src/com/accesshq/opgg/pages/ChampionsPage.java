package com.accesshq.opgg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.accesshq.opgg.uielement.ChampionIndexList;

public class ChampionsPage extends BasePage {
	
	protected ChampionIndexList championIndexList;

	public ChampionsPage(WebDriver driver) {
		super(driver);
		this.championIndexList = new ChampionIndexList(driver.findElement(By.cssSelector("[class='champion-index__champion-list']"))); 
	}

	public void setChampionSearch(String championName) {
		driver.findElement(By.cssSelector("[class='champion-list-filter__keyword'] input")).sendKeys(championName);		
	}

	public ChampionIndexList getChampionElements() {
		return this.championIndexList;
	}
	
	public void UpdateChampionIndexList() {
		this.championIndexList.updateVisibleList();
	}

}
