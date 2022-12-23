package UtilityMavan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static String  ReadDataPropertiesFile(String key) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium1\\myproperties");
		
		prop.load(file);
		
		
	  String value=prop.getProperty(key);
	return value;
	}

	
	
public static String exelRead(int row,int cell) throws EncryptedDocumentException, IOException {
		
	
		File myfile=new File("C:\\Users\\Admin\\Desktop\\Exel Folder\\PomSheet.xlsx");
		
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
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
