package apiAutomation;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	public class username {
		
	    Properties pro=new Properties();
	    Logger log=Logger.getLogger("username");
		    	
	    @BeforeTest
	    public void Before() throws IOException { 
	    	
	    	PropertyConfigurator.configure("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\TWITTER_AUTOMATION\\log4j.properties");
	    FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64"+
				"\\eclipse\\my test project\\TWITTER_AUTOMATION\\src\\data.properties");
				pro.load(fis);
	    }
	
	@Test
	public void user_Tweet()  {
		
		
		RestAssured.baseURI=resource.getUserNameBaseURI();
		Response res=given().auth().oauth(pro.getProperty("ConsumerKey"),pro.getProperty("ConsumerSecret"),pro.getProperty("Token"),pro.getProperty("TokenSecret")).
	    queryParam("q","Qualitest")
	    .when().get(resource.getUserNameResource()).then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
	    extract().response();
		String response=res.asString();
		
		log.info(response);
		JsonPath js=new JsonPath(response);
		int count=js.get("statuses.size()");
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String username=js.get("statuses["+i+"].user.screen_name");
			System.out.println(username);
			
		}	
	}	
}
