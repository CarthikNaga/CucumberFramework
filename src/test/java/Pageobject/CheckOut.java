package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {

    public WebDriver driver;


    public CheckOut(WebDriver driver) {

        this.driver = driver;
    }

    By cartBag=By.cssSelector("[alt='Cart']");
    By checkOutButton = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
    By promoButton = By.cssSelector(".promoBtn");;
    By placeOrder = By.xpath("//button[contains(text(), 'Place Order')]");

public void CheckOutIteams(){
    driver.findElement(cartBag).click();
    driver.findElement(checkOutButton).click();


}

    public boolean verifiyPromoBtn() {
    return driver.findElement(promoButton).isDisplayed();
    }

    public boolean verifiyPlaceOrder() {
        return driver.findElement(placeOrder).isDisplayed();
    }


}
