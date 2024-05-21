package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends PageBase
{

    public RegistrationPage(WebDriver driver)
    {
        super(driver);
    }

    By genderField = By.id("gender-male");
    WebElement genderElement;
    By firstnameField = By.id("FirstName");
    WebElement firstnameElement;
    By lastnameField = By.id("LastName");
    WebElement lastnameElement;
    By emailField = By.id("Email");
    WebElement emailElement;
    By passwordField = By.id("Password");
    WebElement passwordElement;
    By rePasswordField = By.id("ConfirmPassword");
    WebElement rePasswordElement;
    By registrationButton = By.id("register-button");
    WebElement registrationButtonElement;

    public void chooseGender()
    {
        genderElement = driver.findElement(genderField);
        clicking(genderElement);
    }
    public void enterFirstname(String fName)
    {
        firstnameElement = driver.findElement(firstnameField);
        setText(firstnameElement,fName);
    }
    public void enterLastname(String lName)
    {
        lastnameElement =driver.findElement(lastnameField);
        setText(lastnameElement,lName);
    }
    public void enterEmail(String email)
    {
        emailElement = driver.findElement(emailField);
        setText(emailElement,email);
    }
    public void enterPassword(String password)
    {
        passwordElement = driver.findElement(passwordField);
        setText(passwordElement,password);
    }
    public void enterConfirmationPassword(String rePassword)
    {
        rePasswordElement = driver.findElement(rePasswordField);
        setText(rePasswordElement,rePassword);
    }
    public void clickOnRegistrationButton()
    {
        registrationButtonElement = driver.findElement(registrationButton);
        clicking(registrationButtonElement);
    }
}