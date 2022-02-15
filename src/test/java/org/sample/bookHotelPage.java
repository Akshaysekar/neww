package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bookHotelPage {
	
	@FindBy(id="first_name")
	private WebElement dDnFirstName;
	
	@FindBy(id="last_name")
	private WebElement dDnLastName;
	
	@FindBy(id="address")
	private WebElement dDnAddress;
	
	@FindBy(id="cc_num")
	private WebElement dDnCart;
	
	@FindBy(id="cc_type")
	private WebElement dDnCartType;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnYear;
	
	@FindBy(id="cc_cvv")
	private WebElement dDnCvNo;
	
	@FindBy(id="book_now")
	private WebElement btnButton;

	
	
	public WebElement getdDnFirstName() {
		return dDnFirstName;
	}



	public WebElement getdDnLastName() {
		return dDnLastName;
	}



	public WebElement getdDnAddress() {
		return dDnAddress;
	}



	public WebElement getdDnCart() {
		return dDnCart;
	}



	public WebElement getdDnCartType() {
		return dDnCartType;
	}



	public WebElement getdDnMonth() {
		return dDnMonth;
	}



	public WebElement getdDnYear() {
		return dDnYear;
	}



	public WebElement getdDnCvNo() {
		return dDnCvNo;
	}



	public WebElement getBtnButton() {
		return btnButton;
	}



	private void bookHotel() {
		

	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
