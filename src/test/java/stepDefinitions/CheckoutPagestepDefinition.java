package stepDefinitions;

import Pageobject.CheckOut;
import Pageobject.Landingpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;

public class CheckoutPagestepDefinition {

    TestContextSetup testContextSetup;
    public CheckOut checkoutPage;

    public CheckoutPagestepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup=testContextSetup;
        this.checkoutPage =testContextSetup.pageObjectManager.checkoutPage();


    }




    @And("Verify user has ability to enter promo code and place the order")
    public void Verify_user_has_ability_to_enter_promo_code_and_place_the_order(){

        Assert.assertTrue(checkoutPage.verifiyPlaceOrder());
        Assert.assertTrue(checkoutPage.verifiyPromoBtn());


    }

    @And("^User proceeds to Chekcout and validate the (.+) items in checkout page$")
    public void User_proceeds_to_Chekcout_(String name) throws InterruptedException {
        checkoutPage.CheckOutIteams();

    }



}