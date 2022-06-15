package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMusicPage extends CommonAPI {
    public AmazonMusicPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#nav-xshop > a:nth-child(9)")
    private WebElement amazonMusicButtonElement;

    @FindBy(css = "#nav-subnav > a:nth-child(2) > span.nav-a-content")
    private WebElement amazonMusicUnlimitedElement;

    @FindBy(css = "#a-autoid-0-announce")
    private WebElement tryItForFreeElement;

    public void setAmazonMusicPage(){
        click(amazonMusicButtonElement);
        waitFor(3);

        waitFor(3);
        click(amazonMusicUnlimitedElement);
        waitFor(3);
        click(tryItForFreeElement);
        waitFor(3);

    }
}
