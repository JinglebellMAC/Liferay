package ie.deloitte.sample.liferay;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import ie.deloitte.sample.test.HomePage;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;

@Config(
		browser = Browser.FIREFOX,
	    url     = "http://localhost:8080/"
)
public class LiferaySampleTest extends Locomotive{

	@Test
    public void testSignInDetailsExists() {
		validatePresent(LiferayPage.LOC_TXT_EMAILADDR)
		.validatePresent(LiferayPage.LOC_TXT_PASSWORD);
    }
	
	@Test
	public void testSignInSucess(){
		setText(LiferayPage.LOC_TXT_EMAILADDR, "test@liferay.com")
		.setText(LiferayPage.LOC_TXT_PASSWORD, "test")
		.click(LiferayPage.LOC_BTN_SIGNIN)
		.validatePresent(LiferayPage.LOC_LNK_MYSITE);
	}
	
	@After
	public void destroy(){
		teardown();
	}
}
