package automationPracticePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.grid.web.CombinedRoute.LOG;

public class OpenNewWindowPage extends CommonAPI {
    public OpenNewWindowPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "openwindow")
    public WebElement openNewWindowElement;

    public void openNewWindow(){
        click(openNewWindowElement);

        //System.out.println(getPageTitle());





    }
}
