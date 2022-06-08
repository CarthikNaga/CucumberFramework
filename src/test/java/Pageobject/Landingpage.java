package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {

    public WebDriver driver;


    public Landingpage(WebDriver driver) {

        this.driver = driver;
    }



    private By search = By.xpath("//input[@type='search']");
    private By productname = By.xpath("//h4[@class='product-name']");
    private  By topDeal =By.linkText("Top Deals");
    private By increment= By.cssSelector("a.increment");
    private By addToCart= By.cssSelector(".product-action button");


    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }
    public void getSearchTest() {
        driver.findElement(search).getText();
    }
    public String getProductName() {
        return driver.findElement(productname).getText();
    }
    public void selectTopDeals() {
        driver.findElement(topDeal).click();
    }
    public String getTitleLandingPage() { return driver.getTitle();   }

    public void incrementQuantity(int quantity) {

        int i = quantity;

        while (i-1>0){

            i--;
            driver.findElement(increment).click();

        }

    }


    public void addToCart( ) {

        driver.findElement(addToCart).click();
    }


}
