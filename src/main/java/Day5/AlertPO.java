package Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertPO extends BasePO {
    public AlertPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#delayed-alert")
    public WebElement delayedAlertBtn;

    @FindBy(css = "#delayed-alert-label")
    public WebElement message;

    public void delayedAlert() {
        delayedAlertBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
