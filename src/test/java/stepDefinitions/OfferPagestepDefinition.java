package stepDefinitions;

import Pageobject.Landingpage;
import Pageobject.Offerpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.testng.Assert;
import utils.TestContextSetup;


public class OfferPagestepDefinition {

    TestContextSetup testContextSetup;
    public String offerPageProductNem;


    public OfferPagestepDefinition(TestContextSetup testContextSetup)

    {
        this.testContextSetup =testContextSetup;

    }


    @Then("^User searched for (.+) shortname in offer page$")
    public void user_searched_for_shortname_in_offer_page(String shortname) throws InterruptedException {
        switchToOfferPage();
        Thread.sleep(500);
        Landingpage landingpage = testContextSetup.pageObjectManager.getLandingPage();
        Offerpage offerPage = testContextSetup.pageObjectManager.getofferPage();
        offerPage.searchItem(shortname);
        offerPageProductNem =  offerPage.getProductName();
    }


    @And("Validate product name in offers page matched with Landing Page")
    public void Validate_product_name_in_offers() {
        Assert.assertEquals(offerPageProductNem, testContextSetup.landingPageproductName);

    }





    public void switchToOfferPage(){

        Landingpage landingpage = testContextSetup.pageObjectManager.getLandingPage();
        landingpage.selectTopDeals();
        testContextSetup.gernericUtil.SwitchwindowToChild();



    }
}