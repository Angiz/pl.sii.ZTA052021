package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductMinaturePO {

    private WebDriver driver;

    @FindBy (css = ".price")
    private WebElement price;

    @FindBy (css = ".product-title")
    private WebElement title;

    @FindBy (css = ".product-thumbnail")
    private WebElement minature;

    @FindBy (css = ".quick-view")
    private WebElement quickView;


    public ProductMinaturePO(WebDriver driver, WebElement productMinature) {
        PageFactory.initElements(new DefaultElementLocatorFactory(productMinature), this);
        this.driver = driver;
    }

    public double getPrice() {
        return Double.parseDouble(price.getText().replace(" zł", "").replace(",", "."));
    }

    public void clickQuickView() {
        Actions actions = new Actions(driver);
        actions.moveToElement(minature).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(quickView));
        quickView.click();
    }
}
