package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonBasicsPage;

public class AmazonBasicsTest extends CommonAPI {
    @Test(enabled = true)
    public void amazonBasicsButtonTest(){
        AmazonBasicsPage amazonBasicsPage = new AmazonBasicsPage(getDriver());
        amazonBasicsPage.setAmazonBasicsButton();
        String expectedResult = "Amazon.com: Amazon Basics";
        String actualResult =getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
