package Day5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.util.List;
import java.util.Random;

public class FormPO {

    protected WebDriver driver;
    //protected String url;
    protected WebDriverWait wait;


    @FindBy(css = "#inputFirstName3")
    private WebElement inputFirstName;

    @FindBy(css = "#inputLastName3")
    private WebElement inputLastName;

    @FindBy(css = "#inputEmail3")
    private WebElement inputEmail;

    @FindBy(css = "#gridRadiosFemale")
    private WebElement inputSex;

    @FindBy(xpath = "//input[@id='inputAge3']")
    private WebElement inputAge;

    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> inputExperience;

    @FindBy(css = "#gridCheckAutomationTester")
    private WebElement inputProfession;

    @FindBy(css = "#selectContinents")
    private WebElement inputContinentSelect;

    @FindBy(id = "selectSeleniumCommands")
    private WebElement inputSeleniumCommands;

    @FindBy(css = "#chooseFile")
    private WebElement fileInput;

    @FindBy(css = "#additionalInformations")
    private WebElement inputAddInfo;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    @FindBy(css = "#validator-message")
    private WebElement validationMessage;


    public void fillName(String firstName, String lastName){
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
    }

    public void fillEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void checkSex() {
        inputSex.click();
    }

    public void fillAge(String age) {
        inputAge.sendKeys(age);
    }

    public void fillExperience(){
        WebElement randomYear = getRandomElement(inputExperience);
        randomYear.click();
    }

    public void fillProfession() {
        wait.until(ExpectedConditions.elementToBeClickable(inputProfession));
        inputProfession.click();
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
        getRandomElement(selCommandsList).click();
    }

    public void sendFile(String path) {
        File file = new File(path);
        fileInput.sendKeys(file.getAbsolutePath());
    }

    public void fillAddInfo(String text) {
        inputAddInfo.sendKeys(text);
    }

    public void submit() {
        signInButton.click();
    }

    public void scroller() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 500);");
        //Thread.sleep(5000);
    }

    public String getValidationMessage() {
        return validationMessage.getText();
    }


    public void open(String url) {
        driver.get(url);
    }

    public FormPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public WebElement getRandomElement (List<WebElement> elements) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements.size());
        return elements.get(randomNumber);
    }
}
