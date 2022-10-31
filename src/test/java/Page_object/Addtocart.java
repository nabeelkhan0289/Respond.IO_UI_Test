package Page_object;

import core.drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class Addtocart {
    private WebDriver driver= drivers.createdriver();
    public void popularproduct(){
        WebElement ele = driver.findElement(By.cssSelector("a[class=\"product-name\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }

    public void addtocart(){
        WebElement ac = driver.findElement(By.cssSelector("a[data-id-product=\"1\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(ac).click().perform();
    }

    public void successmessage(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        String str = "Product successfully added to your shopping cart\n";
        driver.getPageSource().contains(str);
    }
}
