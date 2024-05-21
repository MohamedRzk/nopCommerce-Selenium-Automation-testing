package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    By RigesterButton = By.className("ico-register") ;
    WebElement RegisterElement ;
    By LoginButton = By.className("ico-login") ;
    WebElement LoginElement ;
    By LogOutButton = By.className("ico-logout");
    WebElement LogOutElement;
    public void clickOnRegistrationButton()
    {
        RegisterElement = driver.findElement(RigesterButton);
        clicking(RegisterElement);
    }
    public void clickOnLoginButton()
    {
        LoginElement = driver.findElement(LoginButton) ;
        clicking(LoginElement);
    }
    public void clickOnLogOutButton()
    {
        LogOutElement = driver.findElement(LogOutButton);
        clicking(LogOutElement);
    }
}