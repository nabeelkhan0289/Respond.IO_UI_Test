package steps;

import core.drivers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Brands {

    private WebDriver driver = drivers.createdriver();
    Page_object.Brands br = new Page_object.Brands();

    @When("User clicks on Womens category")
    public void selects_category() {
        br.select_brand();
    }

    @And("user selects color black and category tops")
    public void select_color_category() {
        br.select_category();
        br.select_color();
    }

    @Then("results are filtered based on selection")
    public void filtered_results() {
        br.verifytext();
        //driver.quit();
    }
}
