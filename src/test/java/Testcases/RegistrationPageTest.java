package Testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;

public class RegistrationPageTest extends TestBase
{
    HomePage homePage;
    RegistrationPage registrationPage;

    @Test
    public void sucssefullyRegistration()
    {
        homePage = new HomePage(driver);
        homePage.clickOnRegistrationButton();
        registrationPage = new RegistrationPage(driver);
        registrationPage.chooseGender();
        registrationPage.enterFirstname("mohamed");
        registrationPage.enterLastname("rezk");
        registrationPage.enterEmail("mm7mdttt@gmail.com");
        registrationPage.enterPassword("123456789");
        registrationPage.enterConfirmationPassword("123456789");
        registrationPage.clickOnRegistrationButton();
    }

}