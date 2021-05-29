package Day5;

import Day4.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Droppable extends TestBase {
    private WebElement drag;
    private WebElement drop;
    private Actions actions;

    @BeforeMethod
    public void openDroppablePage(){
        driver.get("https://seleniumui.moderntester.pl/droppable.php");
        drag = driver.findElement(By.id("draggable"));
        drop = driver.findElement(By.id("droppable"));
        actions = new Actions(driver);
    }

    @Test
    public void dragAndDrop() {
        actions.dragAndDrop(drag, drop).build().perform();
    }

    @Test
    public void holdAndDrop() { //alternative to simple drag and drop
        actions.clickAndHold(drag).release(drop).build().perform();
        //release - without argument release in actual coordinates; with argument release in the given coordinates
    }

    @Test
    public void holdAndDropV2() { //alternative to simple drag and drop
        actions.clickAndHold(drag).moveToElement(drop).release().build().perform();
    }

    @Test
    public void dragAndDropByOffset() {
        int x1 = drag.getLocation().getX();
        int y1 = drag.getLocation().getY();

        int x2 = drop.getLocation().getX();
        int y2 = drop.getLocation().getY();

        actions.dragAndDropBy(drag, x2 - x1, y2 - y1).build().perform();
    }

    @AfterMethod
    public void verify() {
        Assert.assertEquals(drop.getText(), "Dropped!" );
    }
}
