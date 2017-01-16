package com.wangxiang.shayne_selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitWebDriver {
	public static WebDriver init(String browser){
		WebDriver driver=null;
		if("firefox".equalsIgnoreCase(browser)){
			driver=new FirefoxDriver();
		}else if("chrome".equalsIgnoreCase(browser)){
			System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
			driver=new ChromeDriver(); 
		}else if("ie".equalsIgnoreCase(browser)){
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();  
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);  
			System.setProperty("webdriver.ie.driver","driver/IEDriverServer.64.exe"); 
			WebDriver oWebDriver = new InternetExplorerDriver(ieCapabilities); 
			oWebDriver.get("http://www.google.com");  
		}else if("phantomjs".equalsIgnoreCase(browser)){
			
		}
		return driver;
	}
}
