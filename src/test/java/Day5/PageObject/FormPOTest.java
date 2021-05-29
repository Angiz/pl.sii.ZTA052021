package Day5.PageObject;

import Day4.TestBase;
import Day5.FormPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormPOTest extends TestBase {

    @Test
    public void test() {
        FormPO fPO = new FormPO(driver);
        fPO.open("https://seleniumui.moderntester.pl/form.php");
        fPO.fillName("Jan", "Kowalski");
        fPO.fillEmail("xy@gmail.com");
        fPO.checkSex();
        fPO.fillAge("10");
        fPO.fillExperience();
        fPO.scroller();
        fPO.fillProfession();
        fPO.fillContinents();
        fPO.fillSelCommands();
        fPO.sendFile("src/main/resources/resources/secret.txt");
        fPO.fillAddInfo("Test");
        fPO.submit();
        validate(fPO.getValidationMessage(), "Form send with success");
    }
    
    public void validate(String actualText, String expectedText){
        Assert.assertEquals(actualText, expectedText);
    }
}
