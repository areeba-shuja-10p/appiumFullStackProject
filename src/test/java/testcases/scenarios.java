package testcases;

import base.appFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.searchPage;

import java.net.MalformedURLException;

public class scenarios {

    private loginPage loginPage;
    private searchPage searchPage;

    @BeforeTest
    public void setup() throws MalformedURLException {
        appFactory.initializer();
        loginPage = new loginPage();
        searchPage = new searchPage();
    }

    @Test
    public void loginUser() throws InterruptedException {
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

    @Test
    public void searchForStays() throws InterruptedException {
        searchPage.selectDestination();
        searchPage.selectDate();
        searchPage.selectRoomsAndGuests();
        searchPage.clickSearchButton();
        Assert.assertTrue((searchPage.verifyFilter.isDisplayed()));
        searchPage.checkResults();
        System.out.println("Stays searched successfully");
    }

    @AfterTest
    public void tearDown() {
        appFactory.quitDriver();
    }
}
