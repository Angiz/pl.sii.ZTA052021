package Day5;

import Day4.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePicker extends TestBase {

    @Test
    public void calendarTest() {
        //selecting dates and check if correct was chosen
        driver.get("https://seleniumui.moderntester.pl/datepicker.php");

        selectDate("10", "December", 2020);
        //Assert.assertEquals();

    }

    private String getSelectedDate() {
        return "";
    }

    private void selectDate(String s, String december, int i) {

    }
}
