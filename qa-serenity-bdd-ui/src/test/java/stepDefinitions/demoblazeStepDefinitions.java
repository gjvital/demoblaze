package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.demoblazesteps;
;


public class demoblazeStepDefinitions {

    @Steps
    demoblazesteps demoblazeSteps;


    @Given("User opens the index page")
    public void userOpensDemoBlazeWebPage() {
        demoblazeSteps.open();
    }

    @And("go to Laptops section")
    public void verifylaptoplinkPresent() {
        demoblazeSteps.verifylaptoplinkPresent();
    }
    public void clicklaptoplink() {
        demoblazeSteps.clickaptoplink();
    }
    public void clickmacBookPro() {
        demoblazeSteps.clickmacBookpro();
    }

    @And("Go to cart click “Place Order” button")
    public void clickgotocartbutton() {
        demoblazeSteps.clickgotocartbutton();
    }
    

    @When("user Fill with bellow mocked information")
    public void userClicksTheAcceptButtonFromTheBanner() {
        demoblazeSteps.fillformname();
        demoblazeSteps.fillformcountry();
        demoblazeSteps.fillformcity();
        demoblazeSteps.fillformcard();
        demoblazeSteps.fillformmonth();
        demoblazeSteps.fillformyear();
    }

    @Then("Verify the purchase confirmation succeed")
    public void fillformpaymentconfirm() {
        demoblazeSteps.fillformpaymentconfirm();
    }

    public static void open() {
    }

}