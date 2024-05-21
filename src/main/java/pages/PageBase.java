package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {

    protected WebDriver driver ;

    public PageBase(WebDriver driver){
        this.driver = driver ;
    }
    public static void clicking(WebElement element)
    {
        element.click() ;
    }
    public static void setText(WebElement txt , String value)
    {
        txt.sendKeys(value);
    }
}