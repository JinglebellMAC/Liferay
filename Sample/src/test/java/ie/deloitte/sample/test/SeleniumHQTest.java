package ie.deloitte.sample.test;

import org.junit.Test;

import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import io.ddavison.conductor.Browser;

@Config(
        browser = Browser.FIREFOX,
        url     = "http://seleniumhq.org"
)
public class SeleniumHQTest extends Locomotive {

	@Test
    public void testDownloadLinkExists() {
		validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);
    }

    @Test
    public void testTabsExist() {
    	validatePresent(HomePage.LOC_LNK_PROJECTSTAB)
        .validatePresent(HomePage.LOC_LNK_DOWNLOADTAB)
        .validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB)
        .validatePresent(HomePage.LOC_LNK_SUPPORTTAB)
        .validatePresent(HomePage.LOC_LNK_ABOUTTAB)
        ;
    }
}
