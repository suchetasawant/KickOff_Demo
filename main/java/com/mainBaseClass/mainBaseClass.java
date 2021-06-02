package com.mainBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mainBaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
public mainBaseClass() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\Selenium java prog\\KickOff_demo\\src\\main\\resources\\config.properties");
			prop.load(fis);
			
		    }catch(FileNotFoundException e) {
			e.printStackTrace();
			}catch(IOException e) {
			e.printStackTrace();
			}
}


			public static void openBrowser(String browserName) {

			switch (browserName) {

			case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

			case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

			case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

			case "HtmlUnit":
			driver = new HtmlUnitDriver();
			break;

			default: System.err.println("Unable to open browser"+ "provide correct browser name");
			}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			}
			
			public void lunchUrl(String url) {
				//driver.get("http://www.demo.guru99.com/v4/index.php");

				driver.get(url);
				
				
				
			}
			

}
