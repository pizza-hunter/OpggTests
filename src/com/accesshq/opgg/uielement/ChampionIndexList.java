package com.accesshq.opgg.uielement;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChampionIndexList extends BaseElement {
	
	protected ArrayList<ChampionElement> championElements;

	public ChampionIndexList(WebElement element) {
		super(element);
		championElements = new ArrayList<ChampionElement>();
		updateVisibleList();
		
	}

	public void updateVisibleList() {	
		for (WebElement championElement : this.element.findElements(By.className("show"))) {
			championElements.add(new ChampionElement(championElement));
		}
	}
	
	public ArrayList<ChampionElement> getChampionElements(){
		return this.championElements;
	}

	public String getName(String championName) throws Exception {
		
		for (ChampionElement championElement : championElements) {
			if(championElement.getName() == championName) {
				return championElement.getName();
			}
		}
		throw new Exception("Could not find champion name in list");
	}
	
	
}
