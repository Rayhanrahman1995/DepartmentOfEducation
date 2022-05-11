package com.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EarlyChildhood {

	@FindBy(xpath = "(//span[@class='rtsTxt'])[2]")
	public WebElement EarlyChildhodButton;
	
	public EarlyChildhood(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void earlyChildhoodButton() {
		EarlyChildhodButton.click();
	}
	
}
