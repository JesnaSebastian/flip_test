package library_yaml;

import com.github.javafaker.Faker;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Locale;

public class BaseAPI
{
    public static Configuration configuration;

    DataReadLib jsonData;
    public static Response response;
    public String body;



    public BaseAPI() {
        System.out.println("Building configuration");
        configuration = Configuration.builder()
                .jsonProvider(new JacksonJsonNodeJsonProvider())
                .mappingProvider(new JacksonMappingProvider())
                .build();
        jsonData = new DataReadLib();
    }


    public  String setBodyValue(String body, String key, String value){
        DocumentContext json = com.jayway.jsonpath.JsonPath.using(configuration).parse(body);
        String jaypath = key;
        body = json.set(jaypath,value).jsonString();
        return body;
    }

    public  String setBodyValue(String body, String key, Object value){
        DocumentContext json = com.jayway.jsonpath.JsonPath.using(configuration).parse(body);
        String jaypath = key;
        body = json.set(jaypath,value).jsonString();
        return body;
    }

    //Generate data using faker class
    public   String firstName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().firstName();
    }

    public   String lastName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().lastName();
    }

    public   String birthday(){
        return "1990-10-10";
    }
    public   String emailId(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().firstName()+"@fake.com";
    }

    public   String mobileNumber(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.number().digits(10);
    }
    public   String StreetName1(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.address().streetName();
    }
    public   String StreetName2(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.address().streetName();
    }
    public  String cityName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.address().cityName();
    }
    public   String stateName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.address().state();
    }
    public  String postalCode(){
        Faker faker = new Faker();
        return faker.address().zipCode();
    }
    public   String country(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.address().country();
    }

    public String getStringFromResponse(Response response, String key){
        JsonPath jp = new JsonPath(response.asString());
        return jp.getString(key);
    }
}