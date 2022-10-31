package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivers {
    private static WebDriver driver = null;

    public static WebDriver createdriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }
       return driver;
   }

   public static WebDriver quitdriver() {
       driver.quit();
       return null;
   }
}
