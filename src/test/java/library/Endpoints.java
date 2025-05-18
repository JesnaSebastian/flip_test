package library;

public class Endpoints {

    public static final String baseURL = "https://thinking-tester-contact-list.herokuapp.com";


    /**
     * Contact Endpoints
     */

    public static final String addContact = "/contacts";
    public static final String getContactList = "/contacts";
    public  static final String getContact = "/contacts/";
    public static final String updateContact_put = "/contacts/";
    public static final String updateContact_patch = "/contacts/";
    public static final String delContact = "/contacts/";

    /**
     * Users Endpoints
     */


    public  static final String addUser = "/users";
    public static final String getUserProfile = "/users/me";
    public  static final String updateUser = "/users/me";
    public static final String logOutUser = "/users/logout";
    public static final String loginUser = "/users/login";
    public static final String deluser = "/users/me";
}
