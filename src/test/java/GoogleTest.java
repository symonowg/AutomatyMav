import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://www.google.pl/");
	}

	@AfterClass
	public static void tearsDown() {
		driver.quit();
	}

	@Test
	public void testSearch() throws InterruptedException {
		SeleniumGoogle googleSearch = PageFactory.initElements(driver, SeleniumGoogle.class);
		googleSearch.setSearchText("asdasr3adqwq");
		googleSearch.click();
		Thread.sleep(1000L);
		System.out.println(googleSearch.getSearchResultsText());
		//WebElement searchText = driver.findElement(By.id("resultStats"));
		//assertEquals(searchText.getText(), "Wyników: 10 (0,45 s)");
	}
}
