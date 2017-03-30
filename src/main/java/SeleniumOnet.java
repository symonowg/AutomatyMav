
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.onet.pl/");
		WebElement SearchTextFieldId = driver.findElement(By.id("searchQuery"));
		SearchTextFieldId.sendKeys("asdasrw45we");
		WebElement SearchButtonId = driver.findElement(By.id("searchSubmit"));
		SearchButtonId.click();
		WebElement zero = driver.findElement(By.className("resultHeader"));
		Boolean zeroResults = zero.getText().equals("Znaleziono 0 wyników");
		if (zeroResults) {
		System.out.println("Znalezionio 0 wynikow");	
				}
		else {
			
			System.out.println("Znalezionio wyniki");		
		}
			
		
		driver.close();
	
		
	}

}
