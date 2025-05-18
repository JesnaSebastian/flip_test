package modules_yaml;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import library_yaml.BaseAPI;
import library_yaml.DataReadLib;
import library_yaml.Endpoints;


import static io.restassured.RestAssured.given;

public class LoginAPI extends BaseAPI {

    DataReadLib dataReadLib;

    public LoginAPI() {
        dataReadLib = new DataReadLib();//When a LoginAPI object is created, it instantiates a DataReadLib object.

       // Presumably, DataReadLib helps with reading test data from files, particularly YAML or JSON in your case.
    }

    public Response userLoginUsingAPI( String emailID, String password){
        RestAssured.baseURI = Endpoints.baseURL;
        RestAssured.basePath = Endpoints.loginUser;
        body = dataReadLib.getJsonFromYamlFile("Users","json_AddUser_Login");
        body = setBodyValue(body,"email", emailID);
        body = setBodyValue(body,"password", password);
        response = given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body(body).post();
        return response;
    }
}
