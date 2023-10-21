package pages;

import base.appDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchPage {

    public searchPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);
    }

//    By by_pageHeader = By.id("com.booking:id/identity_header_title");

    By by_destination = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");

    @FindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    public WebElement destinationField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public WebElement selectDestination;

    @FindBy(xpath = "com.booking:id/facet_date_picker_confirm")
    public WebElement selectDatesButton;

    @FindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    public WebElement roomsAndGuestsField;

    @FindBy(id = "com.booking:id/group_config_apply_button")
    public WebElement applyButton;

    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement pageHeader;

    @FindBy(id = "com.booking:id/facet_index_section_search_header")
    public WebElement landingPageHeader;

    public void selectDestination() {
        destinationField.click();
        destinationField.sendKeys("los angeles");
        new WebDriverWait(appDriver.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(by_destination));
        selectDestination.click();
    }

    public void selectDate() {
        selectDatesButton.click();
    }

    public void selectRoomsAndGuests() {
        roomsAndGuestsField.click();
        applyButton.click();
    }

//    public void clickContinueButton() throws InterruptedException {
//        continueButton.click();
//        Thread.sleep(5000);
//    }
}
