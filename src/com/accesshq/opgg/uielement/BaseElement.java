package com.accesshq.opgg.uielement;

import org.openqa.selenium.WebElement;

public abstract class BaseElement {
	
	protected WebElement element;

	public BaseElement(WebElement element) {
		this.element = element;
	}

}
