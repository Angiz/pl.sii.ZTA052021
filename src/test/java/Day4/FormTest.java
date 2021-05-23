package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Random;

public class FormTest {

    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeMethod
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aneta\\Documents\\Edukacja\\Informatyka\\szkolenia\\Java\\Java Selenium\\instalki\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup(); //alternative to System.setProperty();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        driver = new ChromeDriver(options);

        wait = new WebDriverWait(driver, 10);

    }

    @Test
    //(invocationCount = 10) - default 1: how many times the test goes
    public void fillOut() {
        driver.get("https://seleniumui.moderntester.pl/form.php");

        WebElement firstName = driver.findElement(By.cssSelector("#inputFirstName3"));
        WebElement lastName = driver.findElement(By.cssSelector("#inputLastName3"));
        WebElement email = driver.findElement(By.cssSelector("#inputEmail3"));
        WebElement sex = driver.findElement(By.cssSelector("#gridRadiosFemale"));
        WebElement age = driver.findElement(By.xpath("//input[@id=\"inputAge3\"]"));
        WebElement profession = driver.findElement(By.cssSelector("#gridCheckAutomationTester"));
        WebElement additionalInfo = driver.findElement(By.cssSelector("#additionalInformations"));
        WebElement signInButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        WebElement finalText = driver.findElement(By.cssSelector("#validator-message"));
        String validationSuccess = "Form send with success";


        //Random Experience
        List<WebElement> experience = driver.findElements(By.name(("gridRadiosExperience")));
        WebElement randomYear = getRandomElement(experience);
        randomYear.click();

        //Random Continents
        Select continentSelect = new Select(driver.findElement(By.cssSelector("#selectContinents")));
        List<WebElement> continents = continentSelect.getOptions();
        continents.remove(0);
        WebElement randomContinent = getRandomElement(continents);
        continentSelect.selectByVisibleText(randomContinent.getText());

        //Selenium Commands
        Select seleniumCommands = new Select(driver.findElement(By.id("selectSeleniumCommands")));
        List<WebElement> selCommandsList = seleniumCommands.getOptions();
        getRandomElement(selCommandsList).click();

        //File
        WebElement fileInput = driver.findElement(By.cssSelector("#chooseFile"));
        File file = new File("src/main/resources/resources/secret.txt");
        fileInput.sendKeys(file.getAbsolutePath());


        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#inputFirstName3")));
        firstName.sendKeys("Aneta");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#inputLastName3")));
        lastName.sendKeys("Giz");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#inputEmail3")));
        email.sendKeys("xy@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#gridRadiosFemale")));
        sex.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"inputAge3\"]")));
        age.sendKeys("18");
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#gridCheckAutomationTester")));
        profession.click();
        additionalInfo.sendKeys("TEST");

        //final check
        signInButton.click();
        String finalTextStr = finalText.getText();
        Assert.assertEquals(finalTextStr, validationSuccess);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebElement getRandomElement (List<WebElement>elements) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements.size());
        return elements.get(randomNumber);
    }
}
