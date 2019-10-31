package PHP_TRAVELS.PHP_AUTOMATION;
 

import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PHP_TRAVELS.PHP_AUTOMATION.Flightsearch;
import PHP_TRAVELS.PHP_AUTOMATION.Launch;

public class Testflightsearch {
	public static Logger log=Logger.getLogger(Testflightsearch.class);
   
    @Test
    public void flightSearch() throws IOException, InterruptedException {
        Launch l = new Launch();
        Flightsearch fs = new Flightsearch();
        
        Properties prop = l.pro();
        PropertyConfigurator.configure("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\PHP_AUTOMATION\\Resources\\log4j.properties");
        
        WebDriver driver = l.getDriver(); 
        driver.get(prop.getProperty("url"));
        driver.findElement(fs.flight).click();
       // driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        
        driver.manage().deleteAllCookies();
        fs.toLocation(driver);
        fs.fromLocation(driver);
        fs.departure(driver, prop);
        driver.findElement(By.xpath("//span[contains(text(),'Economy')]")).click();
        driver.findElement(fs.oneway).click();
        fs.guests(driver,prop);
        driver.findElement(fs.search).click();  
        log.info("Flight SUCCESSFULLY ");
        Thread.sleep(2000);
        driver.close();
      //verification process 
      	/*	String str=	driver.findElement(By.xpath("//h3[@class='heading-title']")).getText();
      		System.out.println("|"+str+"|");
      		System.out.println("|"+prop.getProperty("cityname1")+"|");
      		
      	
      	    if(str.equals(prop.getProperty("cityname1")+"|"))
      		  {
                  System.out.println("pass");
              }
              else {
                  System.out.println("fail");
              }*/
    }	
    
		}
    
    
