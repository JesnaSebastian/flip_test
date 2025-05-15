package apitestcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.faker_utility;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class API_Updatecontact extends faker_utility {
    protected String token;
    @Test(priority = 1)
    public void login()
    {
        RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath="/users/login";

        HashMap map=new HashMap();
        map.put("email","jesna0987@fake.com");
        map.put("password","myPassword");

        Response resp=given().contentType(ContentType.JSON).log().all().body(map).post();
        resp.prettyPrint();
        token=resp.then().extract().path("token");
        System.out.println("token is: "+token);
        Assert.assertEquals(resp.statusCode(),200,"Invalid code");

    }
    @Test(priority = 2)
    public void updateacontact()
    {
        RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath="/contacts/";

        Response resp=given().header("Authorization","Bearer " + token).contentType(ContentType.JSON).log().all().delete();
        resp.prettyPrint();
        Assert.assertEquals(resp.statusCode(),200,"invalid code");
    }
}
