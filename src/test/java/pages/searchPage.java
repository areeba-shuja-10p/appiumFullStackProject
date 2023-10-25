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

    By by_destination = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");

    @FindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    public WebElement destinationField;

    @FindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    public WebElement typeDestination;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public WebElement selectDestination;

    @FindBy(id = "com.booking:id/facet_date_picker_confirm")
    public WebElement selectDatesButton;

    @FindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    public WebElement roomsAndGuestsField;

    @FindBy(id = "com.booking:id/group_config_apply_button")
    public WebElement applyButton;

    @FindBy(id = "com.booking:id/facet_search_box_cta")
    public WebElement searchButton;

    @FindBy(id = "com.booking:id/genius_onbaording_bottomsheet_cta")
    public WebElement startSearchingButton;

    @FindBy(id = "com.booking:id/searchbox_destination")
    public WebElement verifyFilter;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
    public WebElement openResults;

    @FindBy(id = "com.booking:id/property_name")
    public WebElement checkPropertyName;

    public void selectDestination() throws InterruptedException {
        Thread.sleep(5000);
        destinationField.click();
        typeDestination.sendKeys("los angeles");
        new WebDriverWait(appDriver.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(by_destination));
        selectDestination.click();
    }

    public void selectDate() throws InterruptedException {
        Thread.sleep(3000);
        selectDatesButton.click();
    }

    public void selectRoomsAndGuests() throws InterruptedException {
        Thread.sleep(3000);
        roomsAndGuestsField.click();
        applyButton.click();
    }

    public void clickSearchButton() throws InterruptedException {
        searchButton.click();
        Thread.sleep(3000);
        startSearchingButton.click();
    }

    public void checkResults() throws InterruptedException {
        openResults.click();
        Thread.sleep(3000);
        checkPropertyName.isDisplayed();
    }
}
