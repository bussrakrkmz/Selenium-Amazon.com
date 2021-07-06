import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    By searchBoxLocator=By.id("twotabsearchtextbox");
    By submitButton=By.id("nav-search-submit-button");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String s) {
        type(searchBoxLocator,s);
        click(submitButton);
    }
}
