package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class HomePagePO extends BasePO {

    @FindBy(css = ".product-miniature")
    private List<WebElement> products;


    @FindBy (css = ".add-to-cart")
    private WebElement addToBasketBtn;

    public HomePagePO(WebDriver driver) {
        super(driver);
        ownUrl = "http://146.59.32.4/index.php";
    }

//    public void getRandomProducts() {
//        ProductPagePO ppPO = new ProductPagePO(driver);
//        for (int i=0; i<3; i++) {
//            getRandomElement(products).click();
//            ppPO.addToBasketBtn.click();
//            wait.until(ExpectedConditions.visibilityOf(ppPO.continueShoppingBtn));
//            ppPO.continueShoppingBtn.click();
//        }
//    }
    public List<ProductMinaturePO> getProductMinatures() {
        List<ProductMinaturePO> productMinaturesList = new ArrayList<>();
        for (WebElement p: products) {
            productMinaturesList.add(new ProductMinaturePO(driver, p));
        }
        return productMinaturesList;
    }

    public void openQuickViewOfSelectedMiniature (int n) {
        getProductMinatures().get(n).clickQuickView();
        wait.until(ExpectedConditions.elementToBeClickable(addToBasketBtn));
    }

    public double getPriceOfSelectedMiniature (int n) {
        return getProductMinatures().get(n).getPrice();
    }

    public int getMiniaturesNumber () {
        return getProductMinatures().size();
    }



}
