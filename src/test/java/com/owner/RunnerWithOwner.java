package com.owner;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerWithOwner {
	/**
	 *   Property file and equivalent interface = same package
	 */
	public static void main(String[] args) {
		FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);

		System.out.println(config.browser().name());
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(config.timeout(), config.value());
		System.out.println(config.timeout());
		
		if (config.takescreenshot()) {
			((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		}
		//System.out.println(config.favtools());
		config.favtools().forEach(System.out::println);
		
		driver.quit();    
	}
}
