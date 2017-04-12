import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTests {

	public static WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://demo.mrbuggy2.testarena.pl");
	}

	@After
	public void tearsDown() {
		driver.quit();
	}

	@Test
	public void testValidation() {
		LoginComponent loginComponent = PageFactory.initElements(driver, LoginComponent.class);
		loginComponent.submit();
		assertTrue(loginComponent.getErrors().contains("Pole wymagane"));
		loginComponent.setEmail("zza");
		loginComponent.submit();
		assertTrue(loginComponent.getErrors().contains("Nieprawidłowy format adresu e-mail. Wprowadź adres ponownie."));
	}

	@Test
	public void shouldDenyUserToSignIn() {
		LoginComponent loginComponent = PageFactory.initElements(driver, LoginComponent.class);
		loginComponent.clearForm();
		loginComponent.setEmail("admin@tc2014.pl");
		loginComponent.setPassword("12");
		loginComponent.submit();
		assertTrue(loginComponent.getErrors().contains("Adres e-mail i/lub hasło są niepoprawne."));
		driver.navigate().refresh();
		driver.switchTo().alert().dismiss();
	}

	@Test
	public void shouldAllowUserToSignIn() {
		LoginComponent loginComponent = PageFactory.initElements(driver, LoginComponent.class);
		loginComponent.clearForm();
		loginComponent.setEmail("admin@tc2014.pl");
		loginComponent.setPassword("12qwAS");
		loginComponent.submit();
		assertTrue(loginComponent.getAllow().isDisplayed());
	}
}
