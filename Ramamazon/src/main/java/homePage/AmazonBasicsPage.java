package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBasicsPage extends CommonAPI {

    public AmazonBasicsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Amazon Basics')]")
    private WebElement amazonBasicsElement;
    public void setAmazonBasicsButton(){
        click(amazonBasicsElement);
    }
}
