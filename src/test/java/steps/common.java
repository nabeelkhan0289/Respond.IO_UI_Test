package steps;

import core.drivers;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {
    private WebDriver driver= drivers.createdriver();
    public void openurl(){
        driver.get("http://automationpractice.com/index.php");
    }
}
