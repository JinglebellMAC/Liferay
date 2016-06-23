package ie.deloitte.sample.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DummyTest{
	private String baseUrl;
	private WebDriver driver;
	private ScreenshotHelper screenshotHelper;
	  
	@Before
	public void openBrowser() throws MalformedURLException {
		baseUrl = System.getProperty("webdriver.base.url");
	    //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	    driver = new FirefoxDriver();//new ChromeDriver();
	    DesiredCapabilities capability = DesiredCapabilities.firefox();
		//DesiredCapabilities capability = new DesiredCapabilities();
		//capability = capability.firefox();//chrome();
		//capability.setBrowserName("chrome");
		//capability.setVersion("51.0");
		//capability.setCapability("jenkins.label","chrome51");
		//.setPlatform(org.openqa.selenium.Platform.WINDOWS);
//	    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

	    driver.get("http://www.google.com");
	    screenshotHelper = new ScreenshotHelper();
	}
	  
	@After
	public void saveScreenshotAndCloseBrowser() throws IOException {
	    //screenshotHelper.saveScreenshot("screenshot.png");
	    driver.quit();
	}
	  
	@Test
	public void pageTitleAfterSearchShouldBeginWithDrupal() throws IOException {
	    assertEquals("The page title should equal Google at the start of the test.", "Google", driver.getTitle());
	    WebElement searchField = driver.findElement(By.name("q"));
	    searchField.sendKeys("Drupal!");
	    searchField.submit();
	    assertTrue("The page title should start with the search string after the search.",
	    		(Boolean)(new WebDriverWait(driver, 10)).until(new ExpectedCondition() {
			public Object apply(Object d) {
				// TODO Auto-generated method stub
				return ((WebDriver)d).getTitle().toLowerCase().startsWith("drupal!");
			}
	      })
	    );
	}
	  
	private class ScreenshotHelper {
	  
	    public void saveScreenshot(String screenshotFileName) throws IOException {
	      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File(screenshotFileName));
	    }
	}
}
