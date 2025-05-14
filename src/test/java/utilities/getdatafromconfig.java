package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class getdatafromconfig {
    public static String get_browser(String Key) {
        String browser = null;
        String path = "C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(file);
            browser = prop.getProperty("browser");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return browser;
    }

    public static String get_testlink(String Key) {
        String test_link = null;
        String path = "C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(file);
            test_link = prop.getProperty("link");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return test_link;
    }

    public static String getsearch_value(String Key) {
        String search_value = null;
        String path = "C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(file);
            search_value = prop.getProperty("searchboxvalue");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return search_value;
    }

    public static String get_testlink1(String Key) {
        String test_link1 = null;
        String path = "C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(file);
            test_link1 = prop.getProperty("link2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return test_link1;
    }

    public static String get_email(String Key) {
        String email1 = null;
        String path = "C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(file);
            email1 = prop.getProperty("email");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return email1;
    }

    public static String get_pwd(String password) {
        String pwd11 = null;
        String path = "C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try {
            FileInputStream fi=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(fi);
            pwd11=prop.getProperty("password");

        } catch (Exception e) {
        e.printStackTrace();
        }
        return pwd11;
    }
    public static String get_apilink(String apilink) {
        String apilnk = null;
        String path = "C:\\Users\\Admin\\IdeaProjects\\flipkart_test\\src\\test\\testdata\\config.properties";
        try {
            FileInputStream fi=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(fi);
            apilnk=prop.getProperty("linkapisite");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return apilnk;
    }
}

