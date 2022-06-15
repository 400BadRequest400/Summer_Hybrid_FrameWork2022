package automationPracticePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class OpenNewTabPage extends CommonAPI {
    public OpenNewTabPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}


        @FindBy(id = "opentab")
        public WebElement openNewTabElement;

        public void openNewTab () {
            click(openNewTabElement);
            Set<String> widows  =  getDriver().getWindowHandles();
            Iterator<String> it =widows.iterator();
            String parentID = it.next();
            String childID = it.next();
            getDriver().switchTo().window(childID);
        }
    }

