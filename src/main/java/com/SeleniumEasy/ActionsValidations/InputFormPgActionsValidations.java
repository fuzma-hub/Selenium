package com.SeleniumEasy.ActionsValidations;

//import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.SeleniumEasy.PagesObjectRepository.InputFormsPageObjectRepository;
import com.SeleniumEasy.PagesObjectRepository.SeleniumHomePgObjectRep;

public class InputFormPgActionsValidations extends InputFormsPageObjectRepository {

	SeleniumHomePgObjectRep SelHmeObjrep = new SeleniumHomePgObjectRep();
	InputFormsPageObjectRepository InptPgObjRep = new InputFormsPageObjectRepository();
	
	
	public void SimpleFormEntry(String Text, int Num1, int Num2)
	{
		//For the text message
		SelHmeObjrep.Close().click();
		//SelHmeObjrep.AllExamplesLink().click();
		SelHmeObjrep.InputFormLink().click();
		InptPgObjRep.SimpleFormDemoLink().click();
		InptPgObjRep.EnterMessageTextBox().sendKeys(Text);
		InptPgObjRep.ShowMessageButton().click();
		String Message = InptPgObjRep.YourMessage().getText();
		Assert.assertEquals("Hello", Message, "Text Matches");
				
		//For the addition
		InptPgObjRep.InputA().sendKeys(String.valueOf(Num1));
		InptPgObjRep.InputB().sendKeys(String.valueOf(Num2));
		 InptPgObjRep.GetTotalButton().click();
		 String Number = InptPgObjRep.Total().getText();
		 System.out.println(Number);
		
	}
	
}
