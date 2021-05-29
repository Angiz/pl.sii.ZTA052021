package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.util.List;

public class FormPO extends BasePO {

    @FindBy(css = "#inputFirstName3")
    public WebElement inputFirstName;

    @FindBy(css = "#inputLastName3")
    public WebElement inputLastName;

    @FindBy(css = "#inputEmail3")
    public WebElement inputEmail;

    @FindBy(css = "#gridRadiosFemale")
    public WebElement inputSexFemale;

    @FindBy(xpath = "//input[@id='inputAge3']")
    public WebElement inputAge;

    @FindBy(name = "gridRadiosExperience")
    public List<WebElement> inputExperience;

    @FindBy(css = "#gridCheckAutomationTester")
    public WebElement inputProfession;

    @FindBy(css = "#selectContinents")
    public WebElement inputContinentSelect;

    @FindBy(id = "selectSeleniumCommands")
    public WebElement inputSeleniumCommands;

    @FindBy(css = "#chooseFile")
    public WebElement fileInput;

    @FindBy(css = "#additionalInformations")
    public WebElement inputAddInfo;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(css = "#validator-message")
    public WebElement validationMessage;

    public FormPO(WebDriver driver) {
        super(driver);
    }

    public void sendText(String a, WebElement e) {
        e.sendKeys(a);
    }

    public void sendText(String a, String b, WebElement e1, WebElement e2) {
        e1.sendKeys(a);
        e2.sendKeys(b);
    }

    public void clickClick(WebElement e) {
        e.click();
    }

    public void clickInRandomElement(List<WebElement> list) {
        getRandomElement(list).click();
    }


    public void fillContinents() {
        Select continentsSelect = new Select(inputContinentSelect);
        List<WebElement> continents = continentsSelect.getOptions();
        continents.remove(0);
        WebElement randomContinent = getRandomElement(continents);
        continentsSelect.selectByVisibleText(randomContinent.getText());
    }

    public void fillSelCommands() {
        Select seleniumCommands = new Select(inputSeleniumCommands);
        List<WebElement> selCommandsList = seleniumCommands.getOptions();
        clickInRandomElement(selCommandsList);
    }

    public void sendFile(String path) {
        File file = new File(path);
        fileInput.sendKeys(file.getAbsolutePath());
    }
}
