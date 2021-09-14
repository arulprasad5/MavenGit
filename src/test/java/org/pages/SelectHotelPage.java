package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="radiobutton_0")
	WebElement radioClick;
	@FindBy (id="continue")
	WebElement btnCont;
	public WebElement getRadioClick() {
		return radioClick;
	}
	public void setRadioClick(WebElement radioClick) {
		this.radioClick = radioClick;
	}
	public WebElement getBtnCont() {
		return btnCont;
	}
	public void setBtnCont(WebElement btnCont) {
		this.btnCont = btnCont;
	}
	public void select() {
		clickBtn(getRadioClick());
		clickBtn(getBtnCont());
    }
}
