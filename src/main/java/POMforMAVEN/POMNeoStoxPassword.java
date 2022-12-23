package POMforMAVEN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityMavan.Utility;

public class POMNeoStoxPassword {

	
	
	
	
	
	// changes
	
	@FindBy(id="txt_accesspin") private WebElement password;
	
	@FindBy(id="lnk_submitaccesspin")private WebElement submitButton;
	
	
	
	public POMNeoStoxPassword(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public  void enterPassword(WebDriver driver, String   PasswordNeoStox) {
		password.sendKeys(PasswordNeoStox);
		Utility.implicitywaitNeostox(driver, 2000);
		
	}
	
	public void ClickOnSubmitbutton(WebDriver driver) {
		
		submitButton.click();
		Utility.implicitywaitNeostox(driver, 2000);
	}
}
