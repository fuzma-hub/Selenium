package com.SeleniumEasy.PagesObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.SeleniumEasy.Base.TestBase;

public class InputFormsPageObjectRepository extends TestBase{
	
	public InputFormsPageObjectRepository()
	{
	PageFactory.initElements(driver, this);

    }
	//Input Form Elements
	public WebElement SimpleFormDemoLink()
	{
		 WebElement SimpleFrmLnk = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li/ul/li/a[text()='Simple Form Demo']"));
	     return SimpleFrmLnk;
	}
	
	public WebElement CheckBoxDemoLink()
	{
		 WebElement ChkBxDmoLnk = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li/ul/li[2]/a[text()='Checkbox Demo']"));
	     return ChkBxDmoLnk;
	}
	
	public WebElement RadioButtonDemoLink()
	{
		 WebElement RdBtnDemoLnk = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li/ul/li[3]/a[text()='Radio Buttons Demo']"));
	     return RdBtnDemoLnk;
	}
	
	public WebElement SelectDropDownLink()
	{
		 WebElement SlctDrpdwnLnk = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li/ul/li[4]/a[text()='Select Dropdown List']"));
	     return SlctDrpdwnLnk;
	}
	
	public WebElement InputFormSubmitLink()
	{
		 WebElement InptFrmSbmtLnk = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li/ul/li[5]/a[text()='Input Form Submit']"));
	     return InptFrmSbmtLnk;
	}
	
	public WebElement AjaxFormSubmitLink()
	{
		 WebElement AjxFrmSbmtLnk = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li/ul/li[6]/a[text()='Ajax Form Submit']"));
	     return AjxFrmSbmtLnk;
	}
	
	public WebElement JQuerySelectDropDownLink()
	{
		 WebElement JqrySlctDrpdwnLnk = driver.findElement(By.xpath("//li[@class='tree-branch']/ul/li/ul/li[7]/a[text()='JQuery Select dropdown']"));
	     return JqrySlctDrpdwnLnk;
	}
	
	//InputForm->SimpleForm Elements
	
	public WebElement EnterMessageTextBox()
	{
		 WebElement EntrMsgTxt = driver.findElement(By.xpath("//input[@id='user-message']"));
	     return EntrMsgTxt;
	}
	
	public WebElement ShowMessageButton()
	{
		 WebElement ShwMsgBtn = driver.findElement(By.xpath("//button[text()='Show Message']"));
	     return ShwMsgBtn;
	}
	
	public WebElement YourMessage()
	{
		 WebElement yrMsg = driver.findElement(By.xpath("//span[@id='display']"));
	     return yrMsg;
	}
	
	public WebElement InputA()
	{
		 WebElement InptA = driver.findElement(By.xpath("//input[@id='sum1']"));
	     return InptA;
	}
	
	public WebElement InputB()
	{
		 WebElement InptB = driver.findElement(By.xpath("//input[@id='sum2']"));
	     return InptB;
	}
	
	public WebElement GetTotalButton()
	{
		WebElement GetTttlBtn = driver.findElement(By.xpath("//button[text()='Get Total']"));
	     return GetTttlBtn;
	}
	
	public WebElement Total()
	{
		WebElement Tttl = driver.findElement(By.xpath("//span[@id='displayvalue']"));
	     return Tttl;
	}
	
}
