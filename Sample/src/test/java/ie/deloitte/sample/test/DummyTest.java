package ie.deloitte.sample.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DummyTest{
	private String baseUrl;
	private WebDriver driver;
	private ScreenshotHelper screenshotHelper;
	  
	@Before
	public void openBrowser() {
		baseUrl = System.getProperty("webdriver.base.url");
	    //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    screenshotHelper = new ScreenshotHelper();
	}
	  
	@After
	public void saveScreenshotAndCloseBrowser() throws IOException {
	    screenshotHelper.saveScreenshot("screenshot.png");
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
