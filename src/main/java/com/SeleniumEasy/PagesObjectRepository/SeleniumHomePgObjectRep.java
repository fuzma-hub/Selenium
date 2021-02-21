package com.SeleniumEasy.PagesObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.SeleniumEasy.Base.TestBase;

public class SeleniumHomePgObjectRep extends TestBase {
	
	public SeleniumHomePgObjectRep()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Close()
	{
		 WebElement Clse = driver.findElement(By.xpath("//a[@title='Close']"));
	     return Clse;
	}
	public WebElement DemoHome()
	{
    WebElement DemoHme = driver.findElement(By.xpath("//a[text()='Demo Home']"));
     return DemoHme;
    }
	
	public WebElement AllExamplesLink()
	{
    WebElement AlExmpsLnk = driver.findElement(By.xpath("//a[text()='All Examples']"));
     return AlExmpsLnk;
    }
	public WebElement InputFormLink()
	{
    WebElement InptFrmlnk = driver.findElement(By.xpath("//a[text()='Input Forms']"));
     return InptFrmlnk;
    }
	
	public WebElement DatePickersLink()
	{
    WebElement DtePckrsLnk = driver.findElement(By.xpath("//a[text()='Date pickers']"));
     return DtePckrsLnk;
    }
	
	public WebElement TableLink()
	{
    WebElement TbleLnk = driver.findElement(By.xpath("//a[text()='Table']"));
     return TbleLnk;
    }
	
	public WebElement ProgressBarsSlidersLink()
	{
    WebElement PrgrsBrSldrsLnk = driver.findElement(By.xpath("//a[text()='Progress Bars & Sliders']"));
     return PrgrsBrSldrsLnk;
    }
	
	public WebElement AlertsModalsLink()
	{
    WebElement AlrtsMdlsLnk = driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
     return AlrtsMdlsLnk;
    }
	
	public WebElement ListBoxLink()
	{
    WebElement LstBxLnk = driver.findElement(By.xpath("//a[text()='List Box']"));
     return LstBxLnk;
    }
	
	public WebElement OthersLink()
	{
    WebElement LstBxLnk = driver.findElement(By.xpath("//a[text()='Others']"));
     return LstBxLnk;
    }
}
