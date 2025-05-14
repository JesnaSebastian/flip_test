package apitestcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class API_Getcontactlist {
    protected String token;
    @Test (priority = 1)
    public void login(){
        RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath="/users/login";

        HashMap hash=new HashMap();
        hash.put("email", "jesna0987@fake.com");
        hash.put("password","myPassword");

        Response resp=given().contentType(ContentType.JSON).log().all().body(hash).post();
        resp.prettyPrint();
        token=resp.then().extract().path("token");
        System.out.println("token is: "+token);
        int statuscode= resp.statusCode();
        Assert.assertEquals(statuscode,200,"invalid code");

    }
    @Test(priority = 2)
    public void getcontactlist()
    {
        RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath="/contacts";

        Response res=given().header("Authorization","Bearer " + token).contentType(ContentType.JSON).log().all().get();
        res.prettyPrint();
        System.out.println(res);
        int statuscode= res.statusCode();
        Assert.assertEquals(statuscode,200,"invalid code");

    }
}
