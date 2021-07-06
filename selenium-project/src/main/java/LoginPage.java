import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By eMailLocator = By.id("ap_email");
    By passwordLocator = By.id("ap_password");
    By signInSubmitLocator = By.id("signInSubmit");
    By continueSubmitLocator =By.id("continue");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email,String pass) {
        type(eMailLocator , email);
        click(continueSubmitLocator);
        type(passwordLocator,pass);
        click(signInSubmitLocator);
    }

}
