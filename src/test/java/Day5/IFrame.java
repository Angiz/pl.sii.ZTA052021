package Day5;

import Day4.FormTest;
import Day4.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class IFrame extends TestBase {

    @Test
    public void IFrameSelector() {
        FormTest f = new FormTest();
        driver.get("https://seleniumui.moderntester.pl/iframes.php");

        //1st frame
        driver.switchTo().frame("iframe1");

        driver.findElement(By.cssSelector("#inputFirstName3")).sendKeys("Hello");
        driver.findElement(By.cssSelector("#inputSurname3")).sendKeys("World");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //returning to standard page
        driver.switchTo().defaultContent();

        //2nd frame
        driver.switchTo().frame("iframe2");
        driver.findElement(By.cssSelector("#inputLogin")).sendKeys("Login");
        driver.findElement(By.cssSelector("#inputPassword")).sendKeys("Password");

            //Continents
        Select continents = new Select(driver.findElement(By.id("inlineFormCustomSelectPref")));
        List<WebElement> continentsList = continents.getOptions();
        WebElement randomContinent = f.getRandomElement(continentsList);
        continents.selectByVisibleText(randomContinent.getText());

            //Exp
        List<WebElement> exp = driver.findElements(By.name("gridRadios"));
        WebElement randomYear = getRandomElement(exp);
        randomYear.click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //returning to standard page
        driver.switchTo().defaultContent();
    }
}
