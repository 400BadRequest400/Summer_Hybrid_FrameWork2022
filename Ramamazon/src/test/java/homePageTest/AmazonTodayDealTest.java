package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonTodayDealPage;

public class AmazonTodayDealTest extends CommonAPI {

    @Test
    public void getAmazonTodayDealButton(){
        AmazonTodayDealPage amazonTodayDealPage = new AmazonTodayDealPage(getDriver());

        amazonTodayDealPage.setAmazonTodayDealButton();

        String expectedResult = "Amazon.com - Today's Deals";
        String actualResult =getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
