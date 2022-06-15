package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrimePage extends CommonAPI {

    public AmazonPrimePage(WebDriver driver){
        PageFactory.initElements(driver, AmazonPrimePage.class);
    }

    @FindBy(xpath = "//*[@id='nav-link-amazonprime']")
    private WebElement amazonPrimeElement;

    @FindBy(xpath = "//a[contains(text(),'Try Prime')]")
    private WebElement tryMeButtonElement;

    public void setAmazonPrime(){

        //without calling common api methods
        Actions actions = new Actions(getDriver());
        actions.moveToElement(amazonPrimeElement).build().perform();
        waitFor(3);

        //calling the hover over method
        hoverOver(getDriver(),amazonPrimeElement);
        click(tryMeButtonElement);

        //calling the click with action method
        clickWithActions((WebDriver) amazonPrimeElement, tryMeButtonElement);

        //calling the click with action method
        clickWithActions(getDriver(), amazonPrimeElement);


    }



}
