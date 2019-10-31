package PHP_TRAVELS.PHP_AUTOMATION;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class registration {

	Properties prop=new Properties();
	public static Logger log=Logger.getLogger(registration.class);
  
  @Test
	public  void main() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	base b1=new base();
	WebDriver driver= b1.getDriver();
	  PropertyConfigurator.configure("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\PHP_AUTOMATION\\Resources\\log4j.properties");
      
		FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\phpautomation\\src\\main\\java\\attribute.properties");
		prop.load(fis);
		log.info("browser launched");
		
		driver.get(prop.getProperty("url"));
		log.info("url launched");
		driver.findElement(b1.myaccount).click();
		driver.findElement(b1.signup).click();
		driver.findElement(b1.Firstname).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(b1.Lastname).sendKeys(prop.getProperty("Lastname"));
		driver.findElement(b1.mobilenumber).sendKeys(prop.getProperty("mobilenumber"));
		driver.findElement(b1.Email1).sendKeys(prop.getProperty("Email1"));
		driver.findElement(b1.password).sendKeys(prop.getProperty("password"));
		driver.findElement(b1.confirm).sendKeys(prop.getProperty("confirm"));
		driver.findElement(b1.submit).sendKeys(Keys.ENTER);
		log.info("registration page successfully");
		 Thread.sleep(2000);
		driver.close();
		//verification process 
	/*	String str=	driver.findElement(By.xpath("//h3[@class='text-align-left']")).getText();
		System.out.println("Hi, "+prop.getProperty("name"));
		 if(str.equalsIgnoreCase("Hi, "+prop.getProperty("name"))) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }*/
    }
		
	}



