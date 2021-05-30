package Day6;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPagePO extends BasePO {
    public RegisterPagePO(WebDriver driver) {
        super(driver);
        ownUrl = "http://146.59.32.4/index.php?controller=authentication&create_account=1";
    }

    @FindBy (css = "[name='id_gender'][value='1']")
    private WebElement genderMale;

    @FindBy (css = "[name='id_gender'][value='2']")
    private WebElement genderFemale;

    @FindBy (name = "firstname")
    public WebElement inputFirstname;

    @FindBy (name = "lastname")
    public WebElement inputLastname;

    @FindBy (name = "email")
    private WebElement inputEmail;

    @FindBy (name = "password")
    private WebElement inputPassword;

    @FindBy (name = "birthday")
    private WebElement inputBirthday;

    @FindBy (name = "customer_privacy")
    private WebElement customerPrivacyCheckbox;

    @FindBy (name = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy (name = "psgdpr")
    private WebElement conditionsCheckbox;

    @FindBy (css = ".form-control-submit")
    private WebElement submitBtn;

    @FindBy (css = ".account .hidden-sm-down")
    private WebElement loggedUser;

    public void selectMale() {
        genderMale.click();
    }

    public void selectFemale() {
        genderFemale.click();
    }

    public void enterName (String firstname, String lastName) {
        inputFirstname.sendKeys(firstname);
        inputLastname.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void enterPass(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void enterBirth(String birth) {
        inputBirthday.sendKeys(birth);
    }

    public void checkCustomerPrivacy() {
        customerPrivacyCheckbox.click();
    }

    public void checkNewsletter() {
        newsletterCheckbox.click();
    }

    public void checkConditions() {
        conditionsCheckbox.click();
    }

    public void submit() {
        submitBtn.click();
        wait.until(ExpectedConditions.visibilityOf(loggedUser));
    }

    public String getName () {
        return inputFirstname.getText() +" "+inputLastname.getText();
    }

    public void fillForm(boolean male, String firstname, String lastname, String email, String pass, String birth) {
        if (male) {
            selectMale();
        }
        else {
            selectFemale();
        }
        enterName(firstname, lastname);
        enterEmail(email);
        enterPass(pass);
        enterBirth(birth);
        checkCustomerPrivacy();
        checkNewsletter();
        checkConditions();
        submit();
    }




}
