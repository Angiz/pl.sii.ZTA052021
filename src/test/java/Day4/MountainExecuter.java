package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MountainExecuter extends TestBase {

    @Test
    public void mountainChecker(){
        driver.get("https://seleniumui.moderntester.pl/table.php");
        List<WebElement> mountains = driver.findElements(By.cssSelector("tbody tr"));
        List<MountainModel> mountainModels = new ArrayList<>();
        List<String> mountainsGreaterThan4500 =  new ArrayList<>();

        for (WebElement w: mountains) {
            mountainModels.add(new MountainModel(w));
        }

        for (MountainModel m: mountainModels) {
            if (m.getHeight() > 4500 && m.getCountry().contains("Italy")) {
                mountainsGreaterThan4500.add(m.getName());
            }
        }
        Assert.assertEquals(mountainsGreaterThan4500, Arrays.asList("Mont Blanc", "Dufourspitze","Matterhorn"));
    }
}
