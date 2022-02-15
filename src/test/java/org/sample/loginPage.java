package org.sample;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseClass {
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Username")
	private WebElement txtusername;
	
	@FindBy(id="Password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public void login(String Username,String Password) {
		
	insertValue(getTxtusername(), Username);
	insertValue(getTxtpassword(), Password);
click(btnlogin);
	}
	
	
	
	

}
