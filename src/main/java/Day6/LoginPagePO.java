package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePO extends BasePO {
    public LoginPagePO(WebDriver driver) {
        super(driver);
        ownUrl = "http://146.59.32.4/index.php?controller=authentication&back=my-account";
    }

    @FindBy (name = "email")
    private WebElement inputEmail;

    @FindBy (name = "password")
    private WebElement inputPassword;

    @FindBy (css = ".forgot-password") //maybe wrong
    private WebElement forgotPasswordLink;

    @FindBy (id = "submit-login")
    private WebElement submitBtn;

    @FindBy (css = ".no-account")
    private WebElement registerLink;

    public void registerClick() {
        registerLink.click();
    }


}
