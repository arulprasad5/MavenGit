package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="username")
	WebElement nameUser;
	@FindBy (id="password")
	WebElement passUser;
	@FindBy (id="login")
	WebElement butLog;
	public WebElement getNameUser() {
		return nameUser;
	}
	public void setNameUser(WebElement nameUser) {
		this.nameUser = nameUser;
	}
	public WebElement getPassUser() {
		return passUser;
	}
	public void setPassUser(WebElement passUser) {
		this.passUser = passUser;
	}
	public WebElement getButLog() {
		return butLog;
	}
	public void setButLog(WebElement butLog) {
		this.butLog = butLog;
	}
	public void login(String nameUser, String passUser) {
		setText(getNameUser(), nameUser);
		setText(getPassUser(), passUser);
		clickBtn(getButLog());
  }
}
