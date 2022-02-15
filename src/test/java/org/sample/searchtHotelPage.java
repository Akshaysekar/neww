package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchtHotelPage extends BaseClass {
	 public searchtHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnNoOfRoom;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckInOut;

	@FindBy(id="adult_room")
	private WebElement dDnAdultPerRoom;

	@FindBy(id="child_room")
	private WebElement dDnChildrenPerRoom;
	
	@FindBy(id="submit")
	private WebElement btnSearch;
	

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRoom() {
		return dDnNoOfRoom;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckInOut() {
		return txtCheckInOut;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
		
	}

	
	public void searchHotel(String location,String hotels,String roomtype,String noofrooms,String adultsperroom,String checkindate,String checkoutdate,String childenperroom) {
		
		selectoptionsByText(getdDnLocation(), location);
		selectoptionsByText(getdDnHotels(), hotels);
		selectoptionsByText(getdDnRoomType(), roomtype);
		selectoptionsByText(getdDnNoOfRoom(), noofrooms);
		insertValue(txtCheckInDate, checkindate);
		insertValue(getTxtCheckInOut(), checkoutdate);
		selectoptionsByText(getdDnAdultPerRoom(), adultsperroom);
		selectoptionsByText(getdDnChildrenPerRoom(), checkoutdate);
		click(btnSearch);

	}

	
	
	
	
	
	
	
	
	
	
	
	

}
