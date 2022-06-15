package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCustomerServicePage extends CommonAPI {
    public AmazonCustomerServicePage(WebDriver driver){
        PageFactory.initElements(driver,this); }

        @FindBy(xpath = "//a[contains(text(),'Customer Service')]")
    WebElement amazonCustomerServiceElement;

    public void setAmazonCustomerService(){
        click(amazonCustomerServiceElement);
    }
}
