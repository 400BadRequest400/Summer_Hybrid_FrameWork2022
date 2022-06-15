package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBooksPage extends CommonAPI {

    public AmazonBooksPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#nav-xshop > a:nth-child(10)")
    private WebElement amazonBooksElement;

    @FindBy(css = "#nav-subnav > a:nth-child(6) > span")
    private WebElement amazonChildrenBooksElement;

    @FindBy(css = "#a-autoid-0-announce")
    private WebElement teachersPicksElement;


    public void setAmazonBooksPage() {
        click(amazonBooksElement);
        waitFor(2);
        click(amazonChildrenBooksElement);
        waitFor(2);
        click(teachersPicksElement);
        waitFor(2);

    }


}
