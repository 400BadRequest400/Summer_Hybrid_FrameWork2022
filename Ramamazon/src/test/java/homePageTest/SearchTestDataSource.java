package homePageTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import homePage.AmazonSearchPage;

public class SearchTestDataSource extends CommonAPI {

    //@Test
    public void searchFieldTest(){
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage(getDriver());
        amazonSearchPage.searchItemByUsingDataSource();
    }

    @Test
    public void ValidateSearchFieldTest(){
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage(getDriver());
        amazonSearchPage.searchItemByUsingDataSource();

        String expectedResultText = "macbook pro";
        Assert.assertEquals(expectedResultText, amazonSearchPage.getItemSearchText());
    }

}
