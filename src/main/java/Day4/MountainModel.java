package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MountainModel {

    private String name;
    private int height;
    private String country;

    public MountainModel(WebElement row) {
        List<WebElement> partOfRow = row.findElements(By.cssSelector("td"));
        this.name = partOfRow.get(0).getText();
        this.height = Integer.valueOf(partOfRow.get(3).getText());
        this.country = partOfRow.get(2).getText();
//        this.name = row.findElement(By.xpath("//tbody//td[1]")).getText();
//        this.height = row.findElement(By.xpath("//tbody//td[4]")).getText();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "MountainModel{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", country='" + country + '\'' +
                '}';
    }
}
