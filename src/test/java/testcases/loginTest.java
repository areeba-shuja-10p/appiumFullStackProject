package testcases;

import base.appFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.loginPage;

import java.net.MalformedURLException;

public class loginTest {

    private loginPage loginPage;

    @BeforeTest
    public void setup() throws MalformedURLException {
        appFactory.initializer();
        loginPage = new loginPage();
    }

    @Test
    public void verifyUserLogin() throws InterruptedException {
        loginPage.clickSignInWithEmailButton();
        Assert.assertTrue(loginPage.pageHeader.isDisplayed());
        System.out.println("Email Address Page is displayed");
        loginPage.enterValidEmailAddress();
        loginPage.clickContinueButton();
        Assert.assertTrue((loginPage.pageHeader.isDisplayed()));
        System.out.println("Password Page is displayed");
        loginPage.enterPassword();
        loginPage.clickSignInButton();
        Assert.assertTrue((loginPage.landingPageHeader.isDisplayed()));
        System.out.println("User logged-in successfully");
    }

//    @Test
//    public void verifyValidLogin(){
//        // Your Code here
//    }

    @AfterTest
    public void tearDown() {
        appFactory.quitDriver();
    }
}
