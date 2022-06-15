package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonBestSellerPage extends CommonAPI {
    public AmazonBestSellerPage(WebDriver driver){
        PageFactory.initElements(driver,this); }



        @FindBy(css = "#nav-xshop > a:nth-child(3)")
    private WebElement amazonBestSellerElement;

    public void amazonBestSellerButton(){
        click(amazonBestSellerElement);


    }
}
