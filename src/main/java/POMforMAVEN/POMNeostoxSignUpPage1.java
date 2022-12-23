package POMforMAVEN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityMavan.Utility;



public class POMNeostoxSignUpPage1 {
	
	@FindBy(xpath="//input[@type=\"number\"]") private WebElement mobileNo;
	
	@FindBy(id="lnk_signup1")private WebElement signUpButton;
	
	
	public POMNeostoxSignUpPage1(WebDriver driver) {
		
	PageFactory.initElements(driver, this);	
	}
	
	public void enterMobileNumb(WebDriver driver,String MobileNo) {
		mobileNo.sendKeys(MobileNo);
		Utility.implicitywaitNeostox(driver, 2000);
		
	}
	
	public void clickOnsignUpButton(WebDriver driver) {
		
		signUpButton.click();
		Utility.implicitywaitNeostox(driver, 2000);
	}

}
