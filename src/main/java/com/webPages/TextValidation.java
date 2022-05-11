package com.webPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextValidation {

	@FindBy(xpath = "//strong[text()='Child Care Facility Licensing Information']")
	public WebElement ChildCareText;
	
	public TextValidation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void childCareTextValidation(String expected) {
	String text=ChildCareText.getText();
	System.out.println("Actual: "+text);
	Assert.assertEquals(text, expected);
	}
}
