package library_yaml;

import io.restassured.response.Response;
import org.testng.Assert;

public class AssertionLib {


    public static void assertResponseStatusCode(Response response, int expectedStatusCode ){
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode,"response status code mismatch");
    }


    public static void assertResponseMsg(String actual, String expectedMsg ){
        Assert.assertEquals(actual , expectedMsg,"Message mismatch");
    }
}
