package Day5.PageObject;

import Day4.TestBase;
import Day5.AlertPO;
import Day5.FormPO;
import Day5.ProgressBarPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormPOTest extends TestBase {

    @Test
    public void test() {
        FormPO fPO = new FormPO(driver);
        fPO.open("https://seleniumui.moderntester.pl/form.php");
        fPO.sendText("Jan", "Kowalski", fPO.inputFirstName, fPO.inputLastName);
        fPO.sendText("xy@gmail.com", fPO.inputEmail);
        fPO.clickClick(fPO.inputSexFemale);
        fPO.sendText("10", fPO.inputAge);
        fPO.clickInRandomElement(fPO.inputExperience);
        fPO.fillContinents();
        fPO.fillSelCommands();
        fPO.sendFile("src/main/resources/resources/secret.txt");
        fPO.sendText("Test", fPO.inputAddInfo);
        fPO.clickClick(fPO.inputProfession);
        fPO.clickClick(fPO.signInButton);
        Assert.assertEquals(fPO.getValidationMessage(fPO.validationMessage), "Form send with success");
    }

    @Test
    public void progresBar() {
        ProgressBarPO pPO = new ProgressBarPO(driver);
        pPO.open("https://seleniumui.moderntester.pl/progressbar.php");
        Assert.assertTrue(pPO.isProgressBarComplete());
    }

    @Test
    public void checkDelayedAlert() {
        AlertPO aPO = new AlertPO(driver);
        aPO.open("https://seleniumui.moderntester.pl/alerts.php");
        aPO.delayedAlert();
        Assert.assertEquals(aPO.getValidationMessage(aPO.message), "OK button pressed");
    }
}
