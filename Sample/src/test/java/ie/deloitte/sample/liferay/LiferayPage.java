package ie.deloitte.sample.liferay;

import org.openqa.selenium.By;

public class LiferayPage {
	
	public static final By LOC_TXT_EMAILADDR = By.xpath("//section[@id='portlet_58']/descendant::input[@id='_58_login']");
    public static final By LOC_TXT_PASSWORD = By.xpath("//section[@id='portlet_58']/descendant::input[@id='_58_password']");
    public static final By LOC_BTN_SIGNIN = By.xpath("//section[@id='portlet_58']/descendant::button");
    public static final By LOC_LNK_MYSITE = By.xpath("//li[@id='_145_mySites']");
    // download link
    public static final By LOC_LNK_DOWNLOADSELENIUM = By.linkText("Download Selenium");
}
