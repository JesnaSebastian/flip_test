package apitestcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class API_TC_01{
    protected  String token;
    @Test
    public void login()
    {
        RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath="/users/login";
        HashMap hash=new HashMap();
        hash.put("email","jesna0987@fake.com");
        hash.put("password","myPassword");

        Response resp=given().contentType(ContentType.JSON).log().all().body(hash).post();
        resp.prettyPrint();
        token=resp.then().extract().path("token");
        System.out.println("The token is: "+token);

    }

}
