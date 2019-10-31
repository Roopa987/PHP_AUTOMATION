package PHP_TRAVELS.PHP_AUTOMATION;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login {
	Properties prop=new Properties();
	
	
	public static Logger log=Logger.getLogger(login.class);
	
		
	    @Test
		public  void main() throws IOException, InterruptedException {
			// TODO Auto-generated method stub
		base b1=new base();
		WebDriver driver= b1.getDriver();
		PropertyConfigurator.configure("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\PHP_AUTOMATION\\Resources\\log4j.properties");
		FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\PHP_AUTOMATION\\src\\main\\java\\PHP_TRAVELS\\PHP_AUTOMATION\\attribute.properties");
		prop.load(fis);
		
			driver.get(prop.getProperty("url"));
			log.info("url launched");
			driver.manage().window().maximize();
			driver.findElement(b1.myaccount).click();
			driver.findElement(b1.login).click();
			driver.findElement(b1.Email).sendKeys(prop.getProperty("Email"));
			driver.findElement(b1.password).sendKeys(prop.getProperty("password"));
			driver.findElement(b1.login1).click();
			log.info("login is successfully");
			
			
			//verification process 
		String str=	driver.findElement(By.xpath("//h3[@class='text-align-left']")).getText();
			System.out.println("Hi, "+prop.getProperty("name"));
			 if(str.equalsIgnoreCase("Hi, "+prop.getProperty("name"))) {
	            System.out.println("pass");
	        }
	        else {
	            System.out.println("fail");
	        }
			
	    }
	   
}
