package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPagePO extends BasePO {

    public MenuPagePO(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".user-info .hidden-sm-down")
    private WebElement loginBtn;

    @FindBy (css = ".account .hidden-sm-down")
    private WebElement loggedUser;

    @FindBy (css = ".cart-preview")
    private WebElement basketBtn;

    public void clickLogin() {
        loginBtn.click();
    }

    public String getLoggedUser(){
        return loggedUser.getText();
    }

    public void openBasket() {
        basketBtn.click();
    }
}
