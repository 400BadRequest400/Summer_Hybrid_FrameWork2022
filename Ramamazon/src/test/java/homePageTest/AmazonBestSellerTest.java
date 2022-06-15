package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonBestSellerPage;

public class AmazonBestSellerTest extends CommonAPI {

    @Test(enabled = true)
    public void amazonBestsellerButtonTest(){
        AmazonBestSellerPage amazonBestSellerPage = new AmazonBestSellerPage(getDriver());
        amazonBestSellerPage.amazonBestSellerButton();
        String expectedResult = "Amazon.com Best Sellers: The most popular items on Amazon";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);

    }

}
