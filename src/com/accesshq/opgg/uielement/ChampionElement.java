package com.accesshq.opgg.uielement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChampionElement extends BaseElement {

	public ChampionElement(WebElement element) {
		super(element);
	}

	public String getName() {
		return this.element.findElement(By.cssSelector("[class='champion-index__champion-item__name']")).getText();
	}
	
}
