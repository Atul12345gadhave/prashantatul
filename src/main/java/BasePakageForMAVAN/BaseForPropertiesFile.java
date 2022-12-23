package BasePakageForMAVAN;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityMavan.utilityForPropertiesfile;





public class BaseForPropertiesFile {

	
protected static WebDriver driver;




	public void LaunchNeoStox() throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(utilityForPropertiesfile.ReadDataPropertiesFile("url"));
		driver.manage().window().maximize();
		utilityForPropertiesfile.implicitywaitNeostox(driver, 2000);
		
	}
	
}
