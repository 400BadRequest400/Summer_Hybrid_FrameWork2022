package homePageTest;

import base.CommonAPI;
import homePage.AmazonSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends CommonAPI {

    @Test
    public void testSearchField(){
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage(getDriver());

        amazonSearchPage.searchItemByValue("macbook pro");

        String expectedResultText = "macbook pro";
        Assert.assertEquals(expectedResultText, amazonSearchPage.getItemSearchText());
    }
}
