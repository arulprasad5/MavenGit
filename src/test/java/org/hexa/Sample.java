package org.hexa;

import java.io.IOException;

import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.BookHotelPage;
import org.pages.BookingConfirmation;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Sample {
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal lib = new LibGlobal();
		WebDriver driver = lib.launchBrowser("firefox");
		lib.loadurl("http://adactinhotelapp.com/");
		LoginPage loginPage = new LoginPage();
		loginPage.login(lib.getDataFromExcel("Login", 1, 0), lib.getDataFromExcel("Login", 1, 1));
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		searchHotelPage.search(lib.getDataFromExcel("Login", 1, 2), lib.getDataFromExcel("Login", 1, 3), lib.getDataFromExcel("Login", 1, 4), lib.getDataFromExcel("Login", 1, 5), lib.getDataFromExcel("Login", 1, 6), lib.getDataFromExcel("Login", 1, 7), lib.getDataFromExcel("Login", 1, 8), lib.getDataFromExcel("Login", 1, 9));
		SelectHotelPage selectHotelPage = new SelectHotelPage();
		selectHotelPage.select();
		BookHotelPage bookHotelPage = new BookHotelPage();
		bookHotelPage.BookHotel(lib.getDataFromExcel("Login", 1, 10), lib.getDataFromExcel("Login", 1, 11), lib.getDataFromExcel("Login", 1, 12), lib.getDataFromExcel("Login", 1, 13), lib.getDataFromExcel("Login", 1, 14), lib.getDataFromExcel("Login", 1, 15), lib.getDataFromExcel("Login", 1, 16), lib.getDataFromExcel("Login", 1, 17));
		Thread.sleep(7000);
		BookingConfirmation bookingConfirmation = new BookingConfirmation();
		WebElement getOrd = bookingConfirmation.getGetOrd();
        String text = lib.getAttribute(getOrd);
		System.out.println(text);
		String value = lib.getAttribute(getOrd);
		lib.updateDataInExcel("Login", 0, 18, "OrderNo");
		lib.updateDataInExcel("Login", 1, 18, value);
    }    
}
