package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonHomePage;

public class AmazonHomePageTest extends CommonAPI {

    @Test
    public void amazonLogoPageTest(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(getDriver());
        amazonHomePage.bestSellersPage();

        waitFor(3);
        String expectedResult = "Amazon.com Best Sellers: The most popular items on Amazon";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
