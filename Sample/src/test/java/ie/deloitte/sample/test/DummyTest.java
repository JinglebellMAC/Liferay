package ie.deloitte.sample.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class DummyTest extends TestCase{

	@Before
	protected void setUp() {
		
	}
	
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testSamplebookLocalService() {
		System.out.println("Start Samplebook Local Service");
	}
}
