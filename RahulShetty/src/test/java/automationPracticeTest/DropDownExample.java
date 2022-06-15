package automationPracticeTest;

import automationPracticePages.HomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownExample extends CommonAPI {

    @Test
    public void selectFromDropDownTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.selectFromDropDownExample();
        waitFor(3);
        Assert.assertEquals("Option3",homePage.selectedDropDownOptionElement.getText());

    }
}

