package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.DriverInstant;

import java.io.IOException;

public class HomePage extends DriverInstant {

    @Before
    public void Run() throws IOException {
        DriverInstant.Go();
        System.out.println("Before");
    }

    @Given("^Should be able to land on home page$")
    public void should_be_able_to_land_on_home_page() {
        System.out.println("Given");
    }

    @When("^Okay$")
    public void okay() {
        System.out.println("When");
    }

    @Then("^Good$")
    public void good() {
        System.out.println("Then");
    }

    @After
    public void closeBrowser(){
        driver.quit();
        System.out.println("After");
    }

}
