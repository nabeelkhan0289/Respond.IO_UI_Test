package Page_object;

import core.drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Brands {
    private WebDriver driver= drivers.createdriver();

    public void select_brand(){
        driver.findElement(By.cssSelector("a[title=\"Women\"]")).click();
    }

    public void select_color(){
        driver.findElement(By.cssSelector("input[id=\"layered_category_4\"]")).click();
    }

    public void select_category(){
        driver.findElement(By.cssSelector("input[id=\"layered_id_attribute_group_11\"]")).click();
    }

    public void verifytext(){
        String str = "Women > Categories Tops > Color Black";
                driver.getPageSource().contains(str);
    }
}
