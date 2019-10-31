package apiAutomation;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Twitter {
	
    Properties pro=new Properties();
    Logger log=Logger.getLogger("hashtag");
	    	
    @BeforeTest
    public void Before() throws IOException { 
    	
    	PropertyConfigurator.configure("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\TWITTER_AUTOMATION\\log4j.properties");
    FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64"+
			"\\eclipse\\my test project\\TWITTER_AUTOMATION\\src\\data.properties");
			pro.load(fis);
    }

	
	@Test
	public void getTweet()  {
		
		
		RestAssured.baseURI=resource.getTweetBaseURI();
		Response res=given().auth().oauth(pro.getProperty("ConsumerKey"),pro.getProperty("ConsumerSecret"),pro.getProperty("Token"),pro.getProperty("TokenSecret")).
	    queryParam("count","1")
	    .when().get(resource.getTweetResource()).then().extract().response();
		String response=res.asString();
		
		log.info(response);
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String id=js.get("id").toString();
		System.out.println(id);
		String text=js.get("text").toString();
		System.out.println(text);
		
		
		
		
	}	
}
