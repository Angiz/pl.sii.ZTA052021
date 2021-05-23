package Day4;

import org.testng.annotations.*;

public class Annotations {

    @BeforeClass
    public void beforeClass() {
        System.out.println("I'm executing before class!");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I'm executing before method!");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I'm executing after method!");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I'm executing after class!");
    }

    @Test
    public void test() {
        System.out.println("I'm just a little test :)");
    }

    @Test
    public void test2() {
        System.out.println("I'm just a little test2 :)");
    }
}
