import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class OptyczneSearch {

	@FindBy(id = "s")
	private WebElement searchText;
	@FindBy(className = "search-button")
	private WebElement button;
	@FindBy(css = ".articles-listing > .post")
	private List<WebElement> results;
	
	//TO co wyzej tylko innym sposobem
	@FindAll({ @FindBy(css = ".articles-listing > .post"), @FindBy(className = "search-button") })
	private List<WebElement> findAll;
	
	
	//TO co wyzej tylko innym sposobem
	@FindBys({ @FindBy(css = ".articles-listing > .post"), @FindBy(className = "search-button") })

	private List<WebElement> findBys;

	public void setSearchText(String text) {
		this.searchText.sendKeys(text);
	}

	public void click() {
		button.click();
	}

	public List<WebElement> getResults() {
		return results;
	}

}