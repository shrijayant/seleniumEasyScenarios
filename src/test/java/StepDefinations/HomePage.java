package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import utilities.DriverInstant;

import java.io.IOException;

public class HomePage extends DriverInstant {

    @Before
    public void Run() throws IOException {
        DriverInstant.Go();

    }

    @Given("^Should be able to land on home page$")
    public void should_be_able_to_land_on_home_page() {
}

    @When("^Okay$")
    public void okay() throws IOException {
    DriverInstant.scr();

    }

    @Then("^Good$")
    public void good() {

    }

    @After
    public void closeBrowser(){
        driver.quit();

    }

}
