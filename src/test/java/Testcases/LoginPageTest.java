package Testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;

    @Test(priority = 1)
    public void sucssufulLogin()
    {
        homePage = new HomePage(driver);
        homePage.clickOnLoginButton();
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("mm7mdttt@gmail.com");
        loginPage.enterPassword("123456789");
        loginPage.clickOnLoginButton();
    }
    @Test(priority = 2 )
    public void userCanLogOut()
    {
        homePage = new HomePage(driver);
        homePage.clickOnLogOutButton();
    }
}