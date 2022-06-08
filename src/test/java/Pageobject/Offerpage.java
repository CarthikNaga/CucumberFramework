package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerpage {

    public WebDriver driver;


    public Offerpage(WebDriver driver) {

        this.driver = driver;
    }



    private  By search = By.xpath("//input[@type='search']");
    private  By productname = By.cssSelector("tr td:nth-child(1)");


    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public void getSearchTest() {
        driver.findElement(search).getText();
    }

    public String getProductName() {
        return driver.findElement(productname).getText();
    }




}
