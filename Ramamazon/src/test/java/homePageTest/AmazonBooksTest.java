package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonBooksPage;

public class AmazonBooksTest extends CommonAPI {

    @Test
    public void getAmazonBooksTest(){
        AmazonBooksPage amazonBooksPage = new AmazonBooksPage(getDriver());
        amazonBooksPage.setAmazonBooksPage();

        String expectedResult = "Teachers' picks | Amazon.com Gift Finder";
        String actualResult = getPageTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
