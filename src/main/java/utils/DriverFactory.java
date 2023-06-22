package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	 private DriverFactory(){}
	 
	 public static WebDriver getDriver(BrowserType browserType){
	        if(BrowserType.CHROME == browserType){
	            WebDriverManager.chromedriver().setup();
	            return new ChromeDriver();
	        }
	        else if(BrowserType.EDGE == browserType){
	            WebDriverManager.edgedriver().setup();
	            return new EdgeDriver();
	        }
	        else if(BrowserType.FIREFOX == browserType) {
	        	return new FirefoxDriver();
	        }
	        else if(BrowserType.OPERA ==browserType){
	        	return new OperaDriver();
	        }
	        else throw new RuntimeException("Pass correct browser type");
	    }

}
