package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotelPage extends BaseClass {
	
	public selectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	 
	
	@FindBy(name="radiobutton_2")
	private WebElement dDnRadioButton;

	@FindBy(name="continue")
	private WebElement btnContinue;

	
	
	public WebElement getdDnRadioButton() {
		return dDnRadioButton;
	}



	public WebElement getBtnContinue() {
		return btnContinue;
	}



	public void selectHotelPage() {
		
	click(getdDnRadioButton());
	click(getdDnRadioButton());

	}
	
	
	
	

}
