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
        MenuPagePO mpPO = new MenuPagePO(driver);
        BasketPO bPO = new BasketPO(driver);
        QuickViewPO qvPO = new QuickViewPO(driver);
        hpPO.open("http://146.59.32.4/index.php");
        int quantitySum = 0;
        double priceSum = 0;
        for (int i=0; i<3; i++) {
            int numOfRandomMiniature = getRandomNumber(hpPO.getMiniaturesNumber());
            int quantity = getRandomNumber(10)+1;
            double priceOfMiniature = hpPO.getPriceOfSelectedMiniature(numOfRandomMiniature);
            quantitySum += quantity;
            priceSum += quantity*priceOfMiniature;
            hpPO.openQuickViewOfSelectedMiniature(numOfRandomMiniature);
            qvPO.setQuantity(quantity);
            qvPO.addToCard();
        }
        mpPO.openBasket();
        Assert.assertEquals(bPO.getSubtotalPrice(), priceSum);
        Assert.assertEquals(bPO.getNumberOfTotalItems(), quantitySum);
        //hpPO.getRandomProducts();
    }



}
