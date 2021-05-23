package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Random;

public class TestBase {
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

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebElement getRandomElement (List<WebElement> elements) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements.size());
        return elements.get(randomNumber);
    }
}
