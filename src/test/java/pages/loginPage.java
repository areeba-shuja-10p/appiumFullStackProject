package pages;

import base.appDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {

    public loginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);
    }

    By by_createAccountButton = By.id("com.booking:id/identity_landing_social_button");
    By by_pageHeader = By.id("com.booking:id/identity_header_title");
    By by_passwordField = By.id("com.booking:id/identity_text_input_edit_text");

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement signInWithEmailButton;

    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement pageHeader;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement emailAddress;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement continueButton;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement password;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement signInButton;

    @FindBy(id = "com.booking:id/facet_index_section_search_header")
    public WebElement landingPageHeader;

    public void clickSignInWithEmailButton() throws InterruptedException {
        new WebDriverWait(appDriver.getDriver(), 30).until(ExpectedConditions.presenceOfElementLocated(by_createAccountButton));
        signInWithEmailButton.click();
        Thread.sleep(3000);
    }

    public void enterValidEmailAddress() {
        new WebDriverWait(appDriver.getDriver(), 30).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
        emailAddress.sendKeys("test123@yopmail.com");
    }

    public void clickContinueButton() throws InterruptedException {
        continueButton.click();
        Thread.sleep(5000);
    }

    public void enterPassword() throws InterruptedException {
        new WebDriverWait(appDriver.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(by_passwordField));
        password.sendKeys("Thunder27$");
    }

    public void clickSignInButton() throws InterruptedException {
        signInButton.click();
        Thread.sleep(5000);
    }
}
