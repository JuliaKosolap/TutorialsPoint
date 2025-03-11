package org.example.pages.common;import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Props {

    //path to the config file
    public static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";
    public static String siteUrl = "";
    public static String pathToWebDriver = "";

    public static void initProperties() throws IOException {
        //initializing Properties object
        Properties prop = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(PATH_TO_PROPERTIES)) {
            //load properties file and read the data from it
            prop.load(fileInputStream);
            siteUrl = prop.getProperty("siteUrl");
        }
    }


    public static void resetProperties() {
        siteUrl = "";
    }
}
