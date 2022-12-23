package UtilityMavan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityForPropertiesfile {

	
public static String  ReadDataPropertiesFile(String key) throws IOException {
	
	
	
	
	
	
	
	Properties prop=new Properties();
	
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\myproperties");
	
	prop.load(file);
	
	
  String value=prop.getProperty(key);
return value;
}


public static String ScreenShotNeoStox(WebDriver driver,String filename) throws IOException {
	
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Admin\\Desktop\\scrnshot\\+filename+.jpg");
			
			FileHandler.copy(src, dest);
			return filename;
		}

		
		
		public static void implicitywaitNeostox(WebDriver driver,  int  waittime) {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		}
}
