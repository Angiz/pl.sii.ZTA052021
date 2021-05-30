package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPagePO extends BasePO {

    @FindBy (css = ".add-to-cart")
    public WebElement addToBasketBtn;

    @FindBy (css = ".btn-secondary")
    public WebElement continueShoppingBtn;

    public ProductPagePO(WebDriver driver) {
        super(driver);
    }


}
