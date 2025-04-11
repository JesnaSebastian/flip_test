package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class getdatafromconfig {
    public static String get_browser(String Key)
    {
        String browser=null;
        String path="C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try{
            FileInputStream file=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(file);
            browser=prop.getProperty("browser");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return browser;
    }
    public static String get_testlink(String Key)
    {
        String test_link=null;
        String path="C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try{
            FileInputStream file=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(file);
            test_link=prop.getProperty("link");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return test_link;
    }
    public static String getsearch_value(String Key)
    {
        String search_value=null;
        String path="C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try{
            FileInputStream file=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(file);
            search_value=prop.getProperty("searchboxvalue");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return search_value;
    }
}
