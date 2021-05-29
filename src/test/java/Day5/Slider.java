package Day5;

import Day4.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Slider extends TestBase {

    @Test
    public void sliderTest() {
        driver.get("https://seleniumui.moderntester.pl/slider.php");
        moveTo(50);
        moveTo(20);
        moveTo(20);
        moveTo(70);
    }

    private int getSliderPos() {
        return Integer.parseInt((driver.findElement(By.id("custom-handle"))).getText());
    }

    private void move(int offset, Keys key) {
        while (getSliderPos() != offset) {
            driver.findElement(By.id("custom-handle")).sendKeys(key);
        }
    }

    public void moveTo(int offset){
        int actualValue = getSliderPos();
        if (actualValue > offset) {
            move(offset, Keys.ARROW_LEFT);
        }
        else if (actualValue < offset) {
            move(offset, Keys.ARROW_RIGHT);
        }
    }
}
