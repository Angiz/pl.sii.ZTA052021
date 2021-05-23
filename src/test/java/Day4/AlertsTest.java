package Day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase{

    @Test
    public void simpleAlert() {
        driver.findElement(By.cssSelector("#simple-alert")).click();
        driver.switchTo().alert().accept();
        validate("#simple-alert-label","OK button pressed" );

    }

    @Test
    public void promptAlert() {
        driver.findElement(By.cssSelector("#prompt-alert")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Aneta");
        alert.accept();
        validate("#prompt-label", "Hello Aneta! How are you today?");
    }


    @Test
    public void confirmAlert() {
        driver.findElement(By.cssSelector("#confirm-alert")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        validate("#confirm-label", "You pressed OK!");
    }

    @Test
    public void delayedAlert() {
        driver.findElement(By.cssSelector("#delayed-alert")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        validate("#delayed-alert-label", "OK button pressed");
    }


    @BeforeMethod
    public void openPage(){
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
    }

    public void validate(String selector, String expected) {
        String validationMessage = driver.findElement(By.cssSelector(selector)).getText();
        String okText = expected;
        Assert.assertEquals(validationMessage, okText);
    }
}
