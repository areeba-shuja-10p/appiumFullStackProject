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

    By by_selectDatesButton = By.id("com.booking:id/facet_date_picker_confirm");

    By by_applyButton = By.id("com.booking:id/group_config_apply_button");

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

    public void selectDestination() throws InterruptedException {
        destinationField.click();
        typeDestination.sendKeys("los angeles");
        new WebDriverWait(appDriver.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(by_destination));
        selectDestination.click();
    }

    public void selectDate() throws InterruptedException {
        Thread.sleep(5000);
        selectDatesButton.click();
    }

    public void selectRoomsAndGuests() throws InterruptedException {
        Thread.sleep(5000);
        roomsAndGuestsField.click();
        applyButton.click();
    }

    public void clickSearchButton() throws InterruptedException {
        searchButton.click();
    }
}
