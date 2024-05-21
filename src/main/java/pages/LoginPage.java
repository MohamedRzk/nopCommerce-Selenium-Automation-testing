package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    By emailField = By.id("Email");
    WebElement emailElement;
    By passwordField = By.id("Password");
    WebElement passwordElement;
    By LoginButton = By.xpath("//*[@type='submit']");
    WebElement LoginButtonElement;
    public void enterEmail(String email)
    {
        emailElement = driver.findElement(emailField);
        setText(emailElement,email);
    }
    public void enterPassword(String Password)
    {
        passwordElement = driver.findElement(passwordField);
        setText(passwordElement,Password);
    }
    public void clickOnLoginButton()
    {
        LoginButtonElement = driver.findElement(LoginButton);
        clicking(LoginButtonElement);
    }
}