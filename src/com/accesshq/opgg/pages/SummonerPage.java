package com.accesshq.opgg.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.accesshq.opgg.uielement.GameItem;

public class SummonerPage extends BasePage {
	
	private ArrayList<GameItem> gameItems;

	public SummonerPage(WebDriver driver) {
		super(driver);
		gameItems = new ArrayList<GameItem>();
		updateGameItems();
	}

	public String getProfileName() {
		return driver.findElement(By.cssSelector("span[class='Name']")).getText();
	}

	public void updateGameItems() {
		for (WebElement gameItemElement : driver.findElements(By.className("GameItemWrap"))) {
			GameItem loopedGameItem = new GameItem(gameItemElement);
			gameItems.add(loopedGameItem);
		}		
	}
	
	public List<GameItem> getGameItems(){
		return this.gameItems;
	}

	public void clickShowMore() {
		driver.findElement(By.cssSelector("[class='GameMoreButton Box']")).click();		
	}
	
}
