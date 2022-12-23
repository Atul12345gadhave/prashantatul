package POMforMAVEN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityMavan.Utility;




public class POMNeoStoxHomePage {
	
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement PopupOkButton;
	
	//for githib
	@FindBy(xpath="(//a[@class='neobutton'])[25]") private WebElement PopupClose;
	
	
	@FindBy(id="lbl_username")private WebElement UserName;
	
	
	
	
	@FindBy(id="lnk_logout")private WebElement logout;
	
	
	public POMNeoStoxHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
public void ClosebuttonPopUp(WebDriver driver) {
	PopupClose.click();
	
	
	
}public void OkPopUpButton(WebDriver driver) {
	
	PopupOkButton.click();
}
  

public String getUserName(WebDriver driver) {
	String ActualName=UserName.getText();
	Utility.implicitywaitNeostox(driver, 2000);
	return  ActualName;
	
	
}


public void LogoutNeoStox() {
	
	UserName.click();
	
	logout.click();
}
}
