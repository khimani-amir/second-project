package com.testcases;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.PageObjectsLogin;

public class testcasesLogin  {
	 WebDriver driver=null;
		
	
	@Before
	public void startup() throws Exception{
	new DesiredCapabilities();
	//driver=new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ameer.khimani\\Desktop\\chromedriver_win32\\chromedriver.exe");
	//driver=new ChromeDriver();
	//DesiredCapabilities capability=DesiredCapabilities.internetExplorer();
	//capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	//capability.setBrowserName("internet explorer");
	//driver=new RemoteWebDriver(new URL ("http://localhost:4444/wd/hub"),capability);
	driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
public void loginTest() throws Exception{
	PageObjectsLogin loginobject=PageFactory.initElements(driver,PageObjectsLogin.class);
	loginobject.Login();
	
}
@After
public void stop() throws Exception{
	driver.close();
}



}
