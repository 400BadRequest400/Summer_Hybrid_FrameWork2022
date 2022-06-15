package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends CommonAPI {

    public AmazonHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
     private WebElement bestSellersElement;

    public void bestSellersPage(){
        click(bestSellersElement);
    }





}
