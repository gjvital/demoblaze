package steps;

import pages.demoblazeHomePage;
import stepDefinitions.demoblazeStepDefinitions;
import net.thucydides.core.annotations.Step;

public class demoblazesteps {

    demoblazeHomePage pmiHomePage;

    @Step("Demoblaze home page")
    public void open(){
        demoblazeStepDefinitions.open();
    }

    @Step("When go to Laptops section")
    public void verifylaptoplinkPresent() {
        demoblazeHomePage.verifylaptoplinkPresent();
    
    }

    @Step("When go to Laptops section and click laptop")
    public void clickaptoplink() {
        demoblazeHomePage.clicklaptoplink();
    }

    @Step("Find MacBook Pro, and add it to cart")
    public void clickmacBookpro() {
        demoblazeHomePage.clickmacBookPro();
    }

    @Step("Go to cart click “Place Order” button")
    public void clickgotocartbutton() {
        demoblazeHomePage.clickgotocartbutton();
    }

    public void fillformname() {
    }

    public void fillformyear() {
    }

    public void fillformmonth() {
    }

    public void fillformcard() {
    }

    public void fillformcity() {
    }

    public void fillformcountry() {
    }

    public void fillformpaymentconfirm() {
    }

}