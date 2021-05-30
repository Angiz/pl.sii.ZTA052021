package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuickViewPO extends BasePO {

    public QuickViewPO(WebDriver driver) {
        super(driver);
    }

    @FindBy (name = "qty")
    private WebElement inputQuantity;

    @FindBy (css = ".add-to-cart")
    private WebElement addToBasketBtn;

    @FindBy (css = ".btn-secondary")
    private WebElement continueShoppingBtn;

    @FindBy (css = ".cart-content-btn a")
    private WebElement goToCardBtn;

    @FindBy (css = "#blockcart-modal")
    private WebElement blockingModel;

    public void setQuantity(int i) {
        inputQuantity.clear();
        inputQuantity.sendKeys(Integer.toString(i));
    }

    public void addToCard() {
        addToBasketBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(goToCardBtn));
        continueShoppingBtn.click();
        wait.until(ExpectedConditions.invisibilityOf(blockingModel));
    }

}
