package Page_object;

import core.drivers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

    private WebDriver driver= drivers.createdriver();

    public void search_product(){
        driver.findElement(By.cssSelector("input[class=\"search_query form-control ac_input\"]")).sendKeys("blouse");
        driver.findElement(By.cssSelector("button[class=\"btn btn-default button-search\"]")).click();
    }

    public void verify_search_result(String str) {
        driver.getPageSource().contains(str);
    }
}
