package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends LibGlobal {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="order_no")
	WebElement getOrd;

	public WebElement getGetOrd() {
		return getOrd;
	}

	public void setGetOrd(WebElement getOrd) {
		this.getOrd = getOrd;
	}
	public void confirm(String getOrd) {
		setText(getGetOrd(), getOrd);
   }

	
}
