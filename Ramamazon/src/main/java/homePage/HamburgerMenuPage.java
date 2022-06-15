package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenuPage extends CommonAPI {

    public HamburgerMenuPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/span[1]")
    WebElement hamburgerMenuElement;

    public void setHamburgerMenu(){
        click(hamburgerMenuElement);
        waitFor(2);
    }



}
