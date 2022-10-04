package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/")
public class demoblazeHomePage extends PageObject {

    @FindBy(css = "#itemc")
    private static WebElementFacade laptoplink;

    @FindBy(linkText = "MacBook Pro")
    private static WebElementFacade macBookpro;

    @FindBy(css = ".btn.btn-success.btn-lg")
    private WebElementFacade addtocartbutton;

    @FindBy(css =  "a[onclick='showcart()']")
    private static WebElementFacade gotocartbutton;

    @FindBy(css = ".btn.btn-success")
    private WebElementFacade placeorderbutton;

    @FindBy(id = "name")
    private WebElementFacade fillformname;

    @FindBy(id = "country")
    private WebElementFacade fillformcountry;

    @FindBy(id = "city")
    private WebElementFacade fillformcity;

    @FindBy(id = "card")
    private WebElementFacade fillformcard;

    @FindBy(id = "month")
    private WebElementFacade fillformmonth;

    @FindBy(id = "year")
    private WebElementFacade fillformyear;

    @FindBy(css = "#orderModal .btn-primary")
    private WebElementFacade fillformpaymentconfirm;


    public static void verifylaptoplinkPresent(){
        laptoplink.isPresent();
        
    }
    public static void clicklaptoplink(){
        laptoplink.click();
    }

    public static void clickmacBookPro() {
        macBookpro.click();
    }

    public static void clickgotocartbutton() {
        gotocartbutton.click();
    }

    public void clickplaceorderbutton() {
        placeorderbutton.click();
    }

    public void fillformname() {
        fillformname.sendKeys("John Doe");
    }

    public void fillformcountry() {
        fillformcountry.sendKeys("Portugal");
    }

    public void fillformcity() {
        fillformcity.sendKeys("Lisbon");
    }

    public void fillformcard() {
        fillformcard.sendKeys("375567668884617");
    }

    public void fillformmonth() {
        fillformmonth.sendKeys("02");
    }

    public void fillformyear() {
        fillformyear.sendKeys("2030");
    }

    public void fillformpaymentconfirm() {
        fillformpaymentconfirm.click();
    }





}
