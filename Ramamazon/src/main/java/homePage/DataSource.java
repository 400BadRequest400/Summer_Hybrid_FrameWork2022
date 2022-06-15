package homePage;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends CommonAPI {


    public static List<String> itemValue(){

        List<String> itemList = new ArrayList<>();

        itemList.add("iphone 13");
        itemList.add("iphone charger");
        itemList.add("ipod");
        itemList.add("macbook pro");
        return itemList;
    }
}
