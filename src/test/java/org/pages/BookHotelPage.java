package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends LibGlobal {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="first_name")
	WebElement nameFirst;
	@FindBy (id="last_name")
	WebElement nameLast;
	@FindBy (id="address")
	WebElement billAddress;
	@FindBy (id="cc_num")
	WebElement cardNO;
	@FindBy (id="cc_type")
	WebElement cardType;
	@FindBy (id="cc_exp_month")
	WebElement monthExp;
	@FindBy (id="cc_exp_year")
	WebElement yearExp;
	@FindBy (id="cc_cvv")
	WebElement numberCvv;
	@FindBy (id="book_now")
	WebElement clickBtn;
	public WebElement getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(WebElement nameFirst) {
		this.nameFirst = nameFirst;
	}
	public WebElement getNameLast() {
		return nameLast;
	}
	public void setNameLast(WebElement nameLast) {
		this.nameLast = nameLast;
	}
	public WebElement getBillAddress() {
		return billAddress;
	}
	public void setBillAddress(WebElement billAddress) {
		this.billAddress = billAddress;
	}
	public WebElement getCardNO() {
		return cardNO;
	}
	public void setCardNO(WebElement cardNO) {
		this.cardNO = cardNO;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public void setCardType(WebElement cardType) {
		this.cardType = cardType;
	}
	public WebElement getMonthExp() {
		return monthExp;
	}
	public void setMonthExp(WebElement monthExp) {
		this.monthExp = monthExp;
	}
	public WebElement getYearExp() {
		return yearExp;
	}
	public void setYearExp(WebElement yearExp) {
		this.yearExp = yearExp;
	}
	public WebElement getNumberCvv() {
		return numberCvv;
	}
	public void setNumberCvv(WebElement numberCvv) {
		this.numberCvv = numberCvv;
	}
	public WebElement getClickBtn() {
		return clickBtn;
	}
	public void setClickBtn(WebElement clickBtn) {
		this.clickBtn = clickBtn;
	}
	public void BookHotel(String nameFirst, String nameLast, String billAddress, String cardNO, String cardType, String monthExp, String yearExp, String numberCvv) {
        setText(getNameFirst(), nameFirst);
        setText(getNameLast(), nameLast);
        setText(getBillAddress(), billAddress);
        setText(getCardNO(), cardNO);
        setText(getCardType() , cardType);
        setText(getMonthExp(), monthExp);
        setText(getYearExp(), yearExp);
        setText(getNumberCvv(), numberCvv);
        clickBtn(clickBtn);
      }
}
