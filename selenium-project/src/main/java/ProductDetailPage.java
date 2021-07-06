import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator =By.id("add-to-cart-button");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDeatilPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void add2Cart() {
        click(addToCartButtonLocator);
    }
}
