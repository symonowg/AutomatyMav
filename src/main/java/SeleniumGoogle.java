import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumGoogle {

	@FindBy(id = "lst-ib")
	private WebElement searchTextField;
	@FindBy(name = "btnK")
	private WebElement searchButton;
	//@FindBy(id = "resultStats")
	private WebElement searchResultCounter;

	public void setSearchText(String text) {
		this.searchTextField.sendKeys(text);
	}

	public void click() {
		searchButton.click();
	}

	public String getSearchResultsText() {
		return searchResultCounter.getText();
	}
}
