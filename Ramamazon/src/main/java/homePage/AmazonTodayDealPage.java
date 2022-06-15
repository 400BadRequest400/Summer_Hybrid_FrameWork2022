package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonTodayDealPage extends CommonAPI {

    public AmazonTodayDealPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),\"Today's Deals\")]")
    WebElement amazonTodayDealElement;

    public void setAmazonTodayDealButton(){
        click(amazonTodayDealElement);
    }
}
