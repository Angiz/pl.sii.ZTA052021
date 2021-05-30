package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPO extends BasePO {

    @FindBy (css = ".js-subtotal")
    private WebElement numberOfTotalItems;

    @FindBy (css = "#cart-subtotal-products .value")
    private WebElement subtotalPrice;

    public BasketPO(WebDriver driver) {
        super(driver);
    }

    public int getNumberOfTotalItems () {
        return Integer.parseInt(numberOfTotalItems.getText().replace(" sztuk", ""));
    }

    public double getSubtotalPrice() {
        return Double.parseDouble(subtotalPrice.getText().replace(" zł", "").replace(",", "."));
    }
}
