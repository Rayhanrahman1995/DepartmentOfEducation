package com.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchField {

	@FindBy(xpath = "//input[@class='sfsearchTxt']")
	public WebElement SearchFieldBox;
	
	public SearchField(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchFieldBox(String value) {
		SearchFieldBox.sendKeys(value);
	}
	public String displayText() {
		String text=SearchFieldBox.getText();
		System.out.println(text);
		return text;
	}
}
