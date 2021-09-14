package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends LibGlobal {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="location")
	WebElement lcat;
	@FindBy (id="hotels")
	WebElement selHos;
	@FindBy (id="room_type")
	WebElement roomHos;
	@FindBy (id="room_nos")
	WebElement orderNo;
	@FindBy (id="datepick_in")
	WebElement inDate;
	@FindBy (id="datepick_out")
	WebElement outDate;
	@FindBy (id="adult_room")
	WebElement roomAdul;
	@FindBy (id="child_room")
	WebElement roomChild;
	@FindBy (id="Submit")
	WebElement buttonSubmit;
	public WebElement getLcat() {
		return lcat;
	}
	public void setLcat(WebElement lcat) {
		this.lcat = lcat;
	}
	public WebElement getSelHos() {
		return selHos;
	}
	public void setSelHos(WebElement selHos) {
		this.selHos = selHos;
	}
	public WebElement getRoomHos() {
		return roomHos;
	}
	public void setRoomHos(WebElement roomHos) {
		this.roomHos = roomHos;
	}
	public WebElement getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(WebElement orderNo) {
		this.orderNo = orderNo;
	}
	public WebElement getInDate() {
		return inDate;
	}
	public void setInDate(WebElement inDate) {
		this.inDate = inDate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public void setOutDate(WebElement outDate) {
		this.outDate = outDate;
	}
	public WebElement getRoomAdul() {
		return roomAdul;
	}
	public void setRoomAdul(WebElement roomAdul) {
		this.roomAdul = roomAdul;
	}
	public WebElement getRoomChild() {
		return roomChild;
	}
	public void setRoomChild(WebElement roomChild) {
		this.roomChild = roomChild;
	}
	public WebElement getButtonSubmit() {
		return buttonSubmit;
	}
	public void setButtonSubmit(WebElement buttonSubmit) {
		this.buttonSubmit = buttonSubmit;
	}
	public void search(String lcat, String selHos, String roomHos, String orderNo, String inDate, String outDate, String roomAdul, String roomChild) {
		setText(getLcat(), lcat);
		setText(getSelHos(), selHos);
		setText(getRoomHos(), roomHos);
		setText(getOrderNo(), orderNo);
		setText(getInDate(), inDate);
		setText(getOutDate(), outDate);
		setText(getRoomAdul(), roomAdul);
		setText(getRoomChild(), roomChild);
		clickBtn(getButtonSubmit());
	}
}
