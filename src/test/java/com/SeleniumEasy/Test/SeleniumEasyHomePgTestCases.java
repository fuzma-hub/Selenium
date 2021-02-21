package com.SeleniumEasy.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.SeleniumEasy.ActionsValidations.HomePgActionsValidations;
import com.SeleniumEasy.ActionsValidations.InputFormPgActionsValidations;
import com.SeleniumEasy.Base.TestBase;
import com.SeleniumEasy.Util.SeleniumEasyUtility;

public class SeleniumEasyHomePgTestCases extends TestBase{
	
	HomePgActionsValidations HmePgActnsVal;
	InputFormPgActionsValidations InptFrmPgActnsVal;
	
	public static final Logger log = LogManager.getLogger(SeleniumEasyHomePgTestCases.class);
	
	String sheetName = "SeleniumEasy";
	
	public SeleniumEasyHomePgTestCases()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		Initialize();
	
		HmePgActnsVal= new HomePgActionsValidations();
		InptFrmPgActnsVal = new InputFormPgActionsValidations();
	}
	
	@Test(priority=1)
	public void DemoHomeTest()
	{
		HmePgActnsVal.DemoHomeClick();
		log.info("The Page is clicked");
	}
	
	@DataProvider
	public Object[][] getSeleniumEasyTestData()
	{
		Object data[][]= SeleniumEasyUtility.getTestData(sheetName);
		return data;
	}
	
	/*@Test(priority=2, dataProvider="getSeleniumEasyTestData")
	public void SimpleForm(String Text, int num1,int num2)
	{
		 InptFrmPgActnsVal.SimpleFormEntry(Text,num1,num2);
	}*/
	
	@Test(priority=2)
	public void SimpleForm()
	{
		InptFrmPgActnsVal.SimpleFormEntry("Hello",5,7);
		log.info("The data was successfully entered");
		log.fatal("If not entered , It would result in failure");
	}
	
	
	@AfterTest
	public void TearDown()
	{
		
		driver.quit();
		log.info("The driver is successfully closed after test execution");
		//For git
	}

}
