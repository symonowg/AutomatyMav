import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestySelenium {

		public static WebDriver driver;

		@BeforeClass
		public static void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://www.optyczne.pl/");
		}

		@AfterClass
		public static void tearsDown() {
		driver.quit();
		}

		@Test
		public void testSearch() {
		OptyczneSearch optyczneSearch = PageFactory.initElements(driver, OptyczneSearch.class);
		optyczneSearch.setSearchText("nikon");
		optyczneSearch.click();
		assertEquals(optyczneSearch.getResults().size(), 20);
		}

		}
