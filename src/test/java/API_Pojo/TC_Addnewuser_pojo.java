package API_Pojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.faker_utility;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TC_Addnewuser_pojo extends faker_utility {
    String token=null;
    @Test (priority = 1)
    public void login()
    {
        RestAssured.baseURI=apiconstants.baseUrl;
        RestAssured.basePath=apiconstants.loginEndPoint;

        loginPojo loginPayload = new loginPojo();
        loginPayload.setEmail("jesna0987@fake.com");
        loginPayload.setPassword("myPassword");

        // Send POST request and capture response
        Response response = given()
                .contentType(ContentType.JSON)
                .log().all()
                .body(loginPayload)
                .when()
                .post();

        // Log and print response
        response.prettyPrint();
        token = response.then().extract().path("token");
        System.out.println("Token: " + token);

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");

    }
    @Test(priority = 2)
    public void add_user()
    {
        RestAssured.baseURI=apiconstants.baseUrl;
        RestAssured.basePath=apiconstants.addContact;

        addcontactpojo acp=new addcontactpojo();
        acp.setFirstName(generetefirstname());
        acp.setLastName(generetelastname());
        acp.setBirthdate(birthday());
        acp.setEmail(genereteemail());
        acp.setPhone(phonenum());
        acp.setStreet1(Street1());
        acp.setStreet2(Street2());
        acp.setCity(cityName());
        acp.setStateProvince(stateName());
        acp.setPostalCode(postalcode());
        acp.setCountry(country());

       Response resp= given().header("Authorization","Bearer " + token).contentType(ContentType.JSON).log().all().body(acp).post();
       resp.prettyPrint();
       Assert.assertEquals(resp.statusCode(),201,"status code mismatch");



    }
}
