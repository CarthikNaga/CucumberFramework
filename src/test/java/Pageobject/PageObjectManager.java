package Pageobject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {


    public WebDriver driver;
    public Landingpage landingpage;
    public Offerpage offerPage;
    public CheckOut checkoutPage;

    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }


    public Landingpage getLandingPage(){
        landingpage  =new Landingpage(driver);
        return landingpage;
    }


    public CheckOut checkoutPage(){
        checkoutPage =new CheckOut(driver);
        return checkoutPage;
    }




    public Offerpage getofferPage(){
        offerPage =new Offerpage(driver);
        return offerPage;
    }

}
