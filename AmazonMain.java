package AmazonWeb;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonMain {
	
	static Properties properties;
	static WebDriver driver;

	@Test
	public void Main() throws IOException {
		try {
		properties = new Properties();
		FileInputStream configPropertiesFiles = new FileInputStream(Constant.CONFIG_PROPERTY);
		properties.load(configPropertiesFiles);
		configPropertiesFiles.close();

		System.setProperty(Constant.GECK_DRIVER, Constant.GECK_PATH);
		driver = new FirefoxDriver();
		driver.get(Constant.BASE_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ExcelUtility excelUtility = ExcelUtility.getInstance();
		AmazonWeb nb = new AmazonWeb(excelUtility, driver, properties);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
