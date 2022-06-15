package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonCustomerServicePage;

public class AmazonCustomerServiceTest extends CommonAPI {

    @Test(enabled = true)
    public void amazonCustomerServiceButton(){
        AmazonCustomerServicePage amazonCustomerServicePage =new AmazonCustomerServicePage(getDriver());
        amazonCustomerServicePage.setAmazonCustomerService();
        String expectedResult = "Amazon Customer Service Support – Amazon.com";
        String actualResult =getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);

    }

}
