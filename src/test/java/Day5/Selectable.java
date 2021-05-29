package Day5;

import Day4.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Selectable extends TestBase {

    @BeforeMethod
    public void base() {
        driver.get("https://seleniumui.moderntester.pl/selectable.php");
    }

    @Test
    public void singleSelect() {
        List<WebElement> items = driver.findElements(By.cssSelector(".ui-widget-content.ui-selectee"));
        items.get(3).click();
        String text = driver.findElement(By.cssSelector("#select-result")).getText();
        Assert.assertEquals( text, "#4");
    }

    @Test
    public void multiSelect() {
        List<WebElement> items = driver.findElements(By.cssSelector(".ui-widget-content.ui-selectee"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(items.get(3))
                .click(items.get(0))
                .click(items.get(5))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        String text = driver.findElement(By.id("select-result")).getText();
        Assert.assertEquals(text, "#1 #4 #6");

    }
}
