package com.accesshq.opgg.uielement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GameItem extends BaseElement{
	
	public GameItem(WebElement element) {
		super(element);
	}

	public String getName() {
		return this.element.findElement(By.cssSelector("[class='Summoner Requester'] [class='SummonerName']")).getText();
	}

}
