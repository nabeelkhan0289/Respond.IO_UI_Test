package steps;

import core.drivers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Addtocart {

    private WebDriver driver = drivers.createdriver();
    Page_object.Addtocart cart = new Page_object.Addtocart();

    @Given("user selects the product from the popular category")
    public void popular_category_product() {
        cart.popularproduct();
    }

    @And("user adds the product to cart")
    public void add_product_cart() {
        cart.addtocart();
    }

    @Then("The product is added to cart successfully")
    public void successful_cart_message() {
        cart.successmessage();
        //driver.quit();
    }
}
