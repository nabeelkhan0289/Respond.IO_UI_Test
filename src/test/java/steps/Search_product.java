package steps;

import Page_object.Search;
import core.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_product {

    private WebDriver driver=drivers.createdriver();
    @Given("Navigate to website")
    public void navigate_to_website() throws Throwable{
        common cm = new common();
        cm.openurl();
    }

    @When("User search for a product blouse")
    public void search_for_product(){
        Search sr = new Search();
        sr.search_product();
    }

    @Then("^User get the product related to \"([^\"]*)\"$")
    public void verify_product(String str){
        Search sr = new Search();
        sr.verify_search_result(str);
        //driver.quit();
    }

}
