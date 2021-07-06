import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAddProduct2Cart extends BaseTest{

    LoginPage loginPage;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void login2Site() throws InterruptedException {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        homePage.acceptCookies();
        homePage.go2Login();
        loginPage.login("bussra.krkmz@gmail.com","123456789");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.searchBox.searchBoxLocator));
    }

    @Test
    @Order(2)
    public void searchProduct(){
        productsPage=new ProductsPage(driver);
        homePage.searchBox().search("computer");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");
    }

    @Test
    @Order(3)
    public void selectProduct(){
        productDetailPage=new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDeatilPage(),
                "Not on product detail page!");

    }

    @Test
    @Order(4)
    public void addProduct2Cart(){
        productDetailPage.add2Cart();
        cartPage=new CartPage(driver);
        homePage.go2Cart();
        Assertions.assertTrue(cartPage.checkIfAddedProduct(),
                "Product was not added to cart");
    }

}
