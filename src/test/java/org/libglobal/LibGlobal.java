package org.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.DisplayAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else if (browserName.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	//WebDriver
	public void loadurl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String pageUrl() {
		String url = null;
		try {
			url = driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return url;
	}
	public String pageTitle() {
		String title = null; 
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return title;
	}
	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void navigate() {
		try {
			driver.navigate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void manage() {
		try {
			driver.manage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
   }
   public void Switchto() {
	try {
		driver.switchTo();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
  }
   public void getWindowHandle() {
	try {
		driver.getWindowHandle();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
  }
   public void getWindowHandles() {
	try {
		driver.getWindowHandles();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
   }
   
   //webElement
   public void setText(WebElement e, String data) {
	try {
		if (isEnabled(e) && isDisplayed(e)) {
			e.sendKeys(data);
		}
	} catch (Exception e2) {
		System.out.println(e2.getMessage());
	}
   }
   public void clickBtn(WebElement e) {
	   try {
		   if (isEnabled(e) && isDisplayed(e)) {
			   e.click();
		}
		   
		} catch (Exception e2) {
		System.out.println(e2.getMessage());
	   }
   }
   public String getText(WebElement element) {
	   String text = null;
	  try {
		  text = element.getText();
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	  }
	  return text;
   }
 
   public String getAttribute(WebElement element)  {
	     String attribute = null; 
	   try {
		attribute = element.getAttribute("value");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return attribute;
  }
   public boolean isDisplayed(WebElement element) {
	   boolean displayed = false;
	   try {
		   displayed = element.isDisplayed();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	   return displayed;
  }
   public boolean isselected(WebElement e) {
	  boolean selected = false;
	   try {
		  selected = e.isSelected();
	} catch (Exception e2) {
		System.out.println(e2.getMessage());
	}
	   return selected;
	}
   public boolean isEnabled(WebElement e) {
	   boolean enabled = false;
	   try {
		   enabled = e.isEnabled();
	} catch (Exception e2) {
		System.out.println(e2.getMessage());
	}
	  return enabled;
   }
   public void textClear(WebElement ele) {
	   try {
		   ele.clear();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
   
   //Alert
   public Alert switchToAlert() {
	Alert alert = driver.switchTo().alert();
	return alert;
}
   public void accepts() {
	  Alert a = switchToAlert();
	  a.accept();
   }
   public void disMiss() {
	   Alert a = switchToAlert();
	   a.dismiss();
  }
   public Alert sendKeys() {
	   Alert alert = switchToAlert();
	   alert.sendKeys("automate");
	   return alert;
 }
   public Alert getTexts() {
	Alert alert1 = switchToAlert();
	alert1.getText();
	return alert1;
}
   //Actions
   public void moveTOElement(WebElement ele) {
	   try {
		   Actions action = new Actions(driver);
		   action.moveToElement(ele).perform();

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	      }
   public void dragAndDrop(WebElement src, WebElement des) {
	try {
		Actions action1 = new Actions(driver);
		action1.dragAndDrop(src, des).perform();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
   public void contextClick(WebElement elem) {
	try {
		Actions action1 = new Actions(driver);
		action1.contextClick();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
   public void doubleClick(WebElement ele) {
	  try {
		  Actions accti = new Actions(driver);
		   accti.doubleClick(ele);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
   public void performAct() {
	   try {
		   Actions ac = new Actions(driver);
		   ac.perform();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
   //Select
 
   public void selectByIndex(WebElement elem, int ind) {
	try {
		Select s = new Select(elem);
		s.selectByIndex(ind);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
   public void selectByVisibleText(WebElement elem, String data) {
	  try {
		  Select s = new Select(elem);
		   s.selectByVisibleText(data);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
   public void selectByValue(WebElement ele, String data) {
	try {
		Select s = new Select(ele);
		s.selectByValue(data);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
   public List<WebElement> getOptions(WebElement ele) {
	   List<WebElement> options = null;
	   try {
		Select s = new Select(ele);
		options = s.getOptions();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return options;
}
   public WebElement getFirstSelectedOption(WebElement ele) {
	   WebElement firstSelectedOption = null;
	   try {
		Select s = new Select(ele);
		firstSelectedOption = s.getFirstSelectedOption();
		firstSelectedOption.getText();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return firstSelectedOption;
}
   public List<WebElement> getAllselected(WebElement ele) {
	   List<WebElement> allSelectedOptions = null;
	   try {
		Select s = new Select(ele);
		allSelectedOptions = s.getAllSelectedOptions();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return allSelectedOptions;
}
   public boolean isMultiple(WebElement elem) {
	   boolean multiple = false;
	   try {
		Select s = new Select(elem);
		multiple = s.isMultiple();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return multiple;
}
   public void deselectByIndex(WebElement ele, int index) {
	   try {
		   Select s = new Select(ele);
		   s.deselectByIndex(index);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
   public void deselectByVisible(WebElement element, String data) {
	   try {
		   Select s = new Select(element);
		   s.deselectByVisibleText(data);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
   public void deslectByValue(WebElement ele,String data) {
	try {
		Select s = new Select(ele);
		s.deselectByValue(data);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
   public void deslectAll(WebElement e) {
	try {
		Select s = new Select(e);
		s.deselectAll();
	} catch (Exception e2) {
		System.out.println(e2.getMessage());
	}
}
//Frame
   public TargetLocator switchTOTargetElement() {
	   TargetLocator switchTo = null; 
	   try {
		switchTo = driver.switchTo();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return switchTo;

}
   public void switchTOFrameId(int id) {
	 try {
		  switchTOTargetElement().frame(id);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
   public void switchToFrameName(String id) {
   try {
	   switchTOTargetElement().frame(id);
} catch (Exception e) {
	System.out.println(e.getMessage());
}
}
   public void switchToFrameWeb(WebElement ele) {
	   try {
		   switchTOTargetElement().frame(ele);

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	   }
  public void parentFrame() {
	try {
		switchTOTargetElement().parentFrame();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
  public void defaultContent() {
	try {
		switchTOTargetElement().defaultContent();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
  //Navigation
  public Navigation navigat() {
	  Navigation navigate = null;
	  try {
		navigate = driver.navigate();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return navigate;

}
  public void navigationBack() {
	try {
		navigat().back();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
  public void navigationTo(String url) {
	  try {
		  navigat().to(url);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
  }
  public void navigationForward() {
	try {
		navigat().forward();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
  public void navigationRefresh() {
	 try {
		 navigat().refresh();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
  //JavascriptExecution
  public void jsExecution(String data, WebElement e) {
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('value','"+ data +"')", e);
 }
//excelsheetRead
  public String getDataFromExcel(String sheet, int row, int cell) throws IOException {
	  String value = null;
	  try {
			File excelLoc = new File("C:\\Users\\arulp\\eclipse-workspace\\SampleMaven\\TestData\\simple.xlsx");
			FileInputStream stream = new FileInputStream(excelLoc);
			Workbook w = new XSSFWorkbook(stream);
			Sheet s = w.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			int type = c.getCellType();
			if (type == 1) {
				value = c.getStringCellValue();
			}
			if (type == 0) {
				boolean b = DateUtil.isCellDateFormatted(c);
				if (b) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					value = sim.format(d);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);
				}
			}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return value;
}
  //excelUpdate
  public void updateDataInExcel(String sheet, int row, int cell, String value) throws IOException {
	  try {
		  File excelLoc = new File("C:\\Users\\arulp\\eclipse-workspace\\SampleMaven\\TestData\\simple.xlsx");
		  FileInputStream stream = new FileInputStream(excelLoc);
		  Workbook w = new XSSFWorkbook(stream);
		  Sheet s = w.getSheet(sheet);
		  Row r = s.getRow(row);
		  Cell c = r.createCell(cell);
		  c.setCellValue(value);
		  FileOutputStream outputStream = new FileOutputStream(excelLoc);
		  w.write(outputStream);
		  
	} catch (Exception e) {
		System.out.println(e.getMessage());
}
}
}

