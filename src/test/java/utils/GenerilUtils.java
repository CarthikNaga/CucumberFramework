package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenerilUtils {
    public   WebDriver driver;

    public GenerilUtils(WebDriver driver){
        this.driver=driver;

    }

    public void SwitchwindowToChild(){

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentwindow = i1.next();
        String childWindows = i1.next();
        driver.switchTo().window(childWindows);
    }


}
