package stepDefinitions;

import Pageobject.Landingpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import utils.TestContextSetup;

public class LandingstepDefinition {
    Landingpage landingpage;

    TestContextSetup testContextSetup;

    public LandingstepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
        this.landingpage = testContextSetup.pageObjectManager.getLandingPage();

    }

    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {
        System.out.println("Test started");
        landingpage.getTitleLandingPage();
        Assert.assertTrue(landingpage.getTitleLandingPage().contains("GreenKart"));


    }

    @When("^User searched for Short name (.+) and extract actual name of the product$")
    public void user_searched_for_short_name_and_extract_actual_name_of_the_product(String shortname) throws InterruptedException {
        Landingpage landingpage = testContextSetup.pageObjectManager.getLandingPage();
        landingpage.searchItem(shortname);
        Thread.sleep(500);
        testContextSetup.landingPageproductName = landingpage.getProductName().split("- 1")[0].trim();
        System.out.println(testContextSetup.landingPageproductName + " is extracted from home page");


    }

    //  And Added "3" items of the selected product to cart

    @And("Added {string} items of the selected product to cart")
    public void Added_items_of(String quantity){
        landingpage.incrementQuantity(Integer.parseInt(quantity));
        landingpage.addToCart();

    }



}