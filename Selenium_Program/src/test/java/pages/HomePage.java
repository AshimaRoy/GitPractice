package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/span[1]")
	private WebElement Callusnow;

	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;

	@FindBy(name = "submit_search")
	private WebElement Button;

	@FindBy(xpath = "//b[contains(text(),'Cart')]")
	private WebElement Addtocart;

	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement Signout;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
	private WebElement contactUs;
	
	public WebElement getSearchTextBox() {
		return searchTextBox;	
	}
	public void setSearchTextBox(String val) {
		this.searchTextBox.clear();
		this.searchTextBox.sendKeys(val);
	}
	
	public WebElement getCallUsNow() {
		return Callusnow;
	}
	public WebElement getButton() {
		return Button;
	}
	public WebElement getAddtocart() {
		return Addtocart;
	}
	public WebElement getSignInLink() {
		return signInLink;
	}
	public WebElement getSignOut() {
		return Signout;
	}
	public WebElement getContactus() {
		return contactUs;
	}
}
