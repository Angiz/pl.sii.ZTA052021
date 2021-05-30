package Day6;

import Day4.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTest extends TestBase {

    @Test
    public void registerUserTest() {
        String firstname = "Aneta";
        String lastname = "Giz";
        HomePagePO hpPO = new HomePagePO(driver);
        hpPO.open("http://146.59.32.4/index.php");
        MenuPagePO mpPO = new MenuPagePO(driver);
        mpPO.clickLogin();
        LoginPagePO lpPo = new LoginPagePO(driver);
        lpPo.registerClick();
        RegisterPagePO rpPO = new RegisterPagePO(driver);
        //rpPO.open("http://146.59.32.4/index.php?controller=authentication&create_account=1");
        rpPO.fillForm(true, firstname, lastname, "xy"+System.currentTimeMillis()+"@gmail.com", "TrudneHaslo", "1990-05-05");
        Assert.assertEquals(mpPO.getLoggedUser(), firstname+" "+lastname);
    }

    @Test
    public void getProducts(){
        HomePagePO hpPO = new HomePagePO(driver);
        hpPO.open("http://146.59.32.4/index.php");
        //hpPO.getRandomProducts();
    }


}
