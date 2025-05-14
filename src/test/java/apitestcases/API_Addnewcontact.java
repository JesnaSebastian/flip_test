package apitestcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.faker_utility;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class API_Addnewcontact extends faker_utility {
    protected String token;

    @Test(priority = 1)
    public void login() {
        RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath = "/users/login";
        HashMap hash = new HashMap();
        hash.put("email", "jesna0987@fake.com");
        hash.put("password", "myPassword");

        Response resp = given().contentType(ContentType.JSON).log().all().body(hash).post();
        resp.prettyPrint();
        token = resp.then().extract().path("token");
        System.out.println("The token is: " + token);
        Assert.assertEquals(resp.statusCode(), 200, "invalid code");

    }

    @Test(priority = 2)
    public void addnewcontact() {
        RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath = "/contacts";


        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("firstName", generetefirstname());
        jsonobject1.put("lastName", generetelastname());
        jsonobject1.put("birthdate", birthday());
        jsonobject1.put("email", genereteemail());
        jsonobject1.put("phone", phonenum());
        jsonobject1.put("street1", Street1());
        jsonobject1.put("street2", Street2());
        jsonobject1.put("city", cityName());
        jsonobject1.put("stateprovince", stateName());
        jsonobject1.put("postalcode", postalcode());
        jsonobject1.put("country", country());

        Response resp = given().header("Authorization", "Bearer " + token).contentType(ContentType.JSON).log().all().body(jsonobject1).post();
        resp.prettyPrint();
        System.out.println(resp.getStatusCode());
        int statuscode = resp.getStatusCode();
        Assert.assertEquals(statuscode, 201, "invalid code");
    }

}
