package com.owner;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.aeonbits.owner.Config;

import utils.BrowserType;

@Config.Sources(value="file:${user.dir}/src/test/resources/FrameworkConfig.properties")
public interface FrameworkConfig extends Config {
	
	@DefaultValue("CRHOME")
	BrowserType browser();
	
	@Key("takesscreenshot")
	Boolean takescreenshot();
	
	@DefaultValue("SECONDS")
	TimeUnit value();
	
	@DefaultValue("15")
	Long timeout();
	
	List<String> favtools();
}
