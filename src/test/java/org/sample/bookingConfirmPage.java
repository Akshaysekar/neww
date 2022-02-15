package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingConfirmPage extends BaseClass {
	public bookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "order_no")
	private WebElement txtOrderNo;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement txtBookedHotels;
	
	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	public WebElement getTxtBookedHotels() {
		return txtBookedHotels;
	}
	public void HotelsBooked() {
		
		click(getTxtBookedHotels());
	}
	
}
