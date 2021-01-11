package service;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestDataReader {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("dev");

    public static String getTestData(String key){
        return resourceBundle.getString(key);
    }
}