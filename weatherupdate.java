package apiAutomation;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

 

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

 

public class weatherupdate
{
	Properties pro=new Properties();
    @Test
    public void banglr() throws IOException {
    
    FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\TWITTER_AUTOMATION\\src\\data.properties");
	pro.load(fis);
    
    
    {
    RestAssured.baseURI = resource.getWeatherUpdateBaseURI();
    Response res=given().auth().oauth(pro.getProperty("ConsumerKey"),pro.getProperty("ConsumerSecret"),pro.getProperty("Token"),pro.getProperty("TokenSecret")).
    param("q","weather,Bangalore").
    when().
    get(resource.getWeatherUpdateResource()).
    then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
    extract().response();
    
    String response = res.asString();
    System.out.println(response);
    }
    }
}