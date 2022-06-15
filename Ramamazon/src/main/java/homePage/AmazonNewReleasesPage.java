package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonNewReleasesPage extends CommonAPI {

    public AmazonNewReleasesPage(WebDriver driver){
        PageFactory.initElements(driver,this); }


        @FindBy(xpath = "//a[contains(text(),'New Releases')]")
    WebElement amazonNewReleasesElement;
    public void setAmazonNewReleases(){
        click(amazonNewReleasesElement);
    }
}
