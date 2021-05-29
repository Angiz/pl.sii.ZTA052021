package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProgressBarPO extends BasePO {
    public ProgressBarPO(WebDriver driver) {
        super(driver);
        ownUrl = "https://seleniumui.moderntester.pl/progressbar.php";
    }

    @FindBy(css = ".ui-progressbar-complete")
    public WebElement completeProgressBar;

    public boolean isProgressBarComplete() {
        wait.until(ExpectedConditions.visibilityOf(completeProgressBar));
        return completeProgressBar.isDisplayed();
    }
}
