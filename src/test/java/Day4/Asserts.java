package Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Asserts {

    @Test
    public void thisCanPass() throws FileNotFoundException{
        Assert.assertEquals(1,1);
        String expectedString = "Aneta";
        Assert.assertEquals(expectedString, "Aneta");
        //Assert.assertTrue(expectedString.equals("Aneta"));
        Assert.assertTrue(1==1);

        String content = new Scanner(new File("src/main/resources/resources/secret2.txt")).useDelimiter("\\Z").next();
        System.out.println(content);
    }

    @Test
    public void thisShallNotPass() throws FileNotFoundException {
        String content = new Scanner(new File("src/main/resources/resources/secret.txt")).useDelimiter("\\Z").next();
        System.out.println(content);

        Assert.assertTrue(false);
    }
}
