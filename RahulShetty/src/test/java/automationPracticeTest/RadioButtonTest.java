package automationPracticeTest;

import automationPracticePages.HomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends CommonAPI  {

    // This test validates if Radio Button 2 is clickable

    @Test(enabled = false)
    public void radioBtnTwoTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickRadioButtonTwo();
        waitFor(3);
        Assert.assertTrue(homePage.radioButtonTwoElement.isSelected());

    }
}
