package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonSearchPage extends CommonAPI {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//span[contains(text(),'\"iphone 13 pro\"')]")
    private WebElement searchItemText;

    public AmazonSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getItemSearchText(){
        return getElementText(searchItemText);
    }

    public void searchItemByValue(String item){
        typeAndEnter(searchField, item);
    }

    public void searchItemByUsingDataSource(){

        List<String> item = DataSource.itemValue();

        for ( String product:item) {
            typeAndEnter(searchField, product);
            waitFor(2);
            clear(searchField);
            waitFor(2);
        }
    }
    public void searchItemByUsingDataSourceValidation(){

        List<String> item = DataSource.itemValue();

        for ( String product:item) {
            typeAndEnter(searchField, product);
            waitFor(2);
            clear(searchField);
            waitFor(2);
        }
    }
}
