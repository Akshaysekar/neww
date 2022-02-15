package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class CancelBooking extends BaseClass {
		public CancelBooking() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="order_id_text")
		private WebElement txtSearch;
		@FindBy(id="search_hotel_id")
		private WebElement btnGo;
		@FindBy(name="cancelall")
		private WebElement btnCancel;
		public WebElement getTxtSearch() {
			return txtSearch;
		}
		public WebElement getBtnGo() {
			return btnGo;
		}
		public WebElement getBtnCancel() {
			return btnCancel;
		}
		public void Cancel(String CancelOrder) {
			insertValue(getTxtSearch(), CancelOrder);
			click(getBtnGo());
			click(getBtnCancel());
			
		}
		
	}


