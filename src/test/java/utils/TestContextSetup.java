package utils;

import Pageobject.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {


    public String landingPageproductName;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenerilUtils gernericUtil;






    public TestContextSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager       = new PageObjectManager(testBase.WebDriverManager());
        gernericUtil            = new GenerilUtils(testBase.WebDriverManager());

    }








}
