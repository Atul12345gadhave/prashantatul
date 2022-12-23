package TESTNGpakageMAVAN;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePakageForMAVAN.BaseForPropertiesFile;
import POMforMAVEN.POMNeoStoxHomePage;
import POMforMAVEN.POMNeoStoxPassword;
import POMforMAVEN.POMNeostoxSignUpPage1;
import UtilityMavan.utilityForPropertiesfile;
//@Listeners(liistener.listnerNeoStox.class)


public class NeoStoxTestbypropertiesfile extends BaseForPropertiesFile{

	POMNeostoxSignUpPage1 login;
	POMNeoStoxPassword password;
	
	POMNeoStoxHomePage Home;
	
	
	 @BeforeClass
	  public void beforeClass() throws InterruptedException, IOException {
		 LaunchNeoStox();
		  Thread.sleep(1000);
		 login=new POMNeostoxSignUpPage1 (driver);
		 password=new POMNeoStoxPassword(driver);
		 
		Home=new POMNeoStoxHomePage(driver);
	  }
	 
	 
	 
	 @BeforeMethod
	  public void NeoStoxLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		 
		 login.enterMobileNumb(driver,   utilityForPropertiesfile.ReadDataPropertiesFile("MobileNo"));
		 
		 Thread.sleep(1000);
		 
		 
		 login.clickOnsignUpButton(driver);
		 
		 password.enterPassword(driver,utilityForPropertiesfile.ReadDataPropertiesFile("Password"));;
		 
		 password.ClickOnSubmitbutton(driver);
		 
		 Thread.sleep(2000);
		 Home.OkPopUpButton(driver);
		 Thread.sleep(2000);
		 
		 Home.ClosebuttonPopUp(driver);
	  }

	 
	 
  @Test
  
  public void ValidatedUserName() throws EncryptedDocumentException, IOException {
	  
	  
	  Assert.assertEquals(Home.getUserName(driver), utilityForPropertiesfile.ReadDataPropertiesFile("UserName"));
  }
  
  @AfterMethod
  public void LogoutNeoStox() throws InterruptedException {
	  
	  
	  Thread.sleep(2000);
	  
	  Home.LogoutNeoStox();
  }

 

  @AfterClass
  public void CloseNeoStox() {
	  driver.close();
  }


}
