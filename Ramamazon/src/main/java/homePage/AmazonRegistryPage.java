package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegistryPage extends CommonAPI {

    public AmazonRegistryPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#nav-xshop > a:nth-child(11)")
    WebElement amazonRegistryButtonElement;

    @FindBy(xpath = "//*[@id=\"gr-find-stripe__form\"]/div/div[2]/input")
    WebElement amazonRegistryElement;

    @FindBy(css = "#a-autoid-0-announce")
    WebElement registryDropdownElement;

    public void setAmazonRegistry(){
        click(amazonRegistryButtonElement);
        waitFor(2);
        typeAndEnter(amazonRegistryElement,"toys");
        waitFor(2);
        selectFromDropdown(registryDropdownElement,"Birthday Gift List");
        waitFor(2);
    }

}
