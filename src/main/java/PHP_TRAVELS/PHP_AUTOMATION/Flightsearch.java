package PHP_TRAVELS.PHP_AUTOMATION;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Flightsearch {
	   By flight = By.xpath("//a[@href='#flights']");
	    
	    By toLocation = By.xpath("//div[@id='s2id_location_from']");
	    By tLocation = By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
	    By fromLocation = By.xpath("//div[@id='s2id_location_to']");
	    By fLocation = By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
	    By oneway = By.xpath("//label[contains(text(),'One Way')]");
	    By search = By.xpath("//div[2]/div[4]/button[1]");
	    By departure = By.xpath("//input[@id='FlightsDateStart']");
	    By month = By.xpath("//div[7]//nav[1]//div[2]");
	    By nextbtn = By.xpath("//div[7]//nav[1]//div[3]"); 
	    By madult = By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[3]//button[1]");
	    By mchildren = By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]");
	    By minfant = By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[3]//button[1]");
	    
	    
	    public void toLocation(WebDriver driver) throws InterruptedException {
	        driver.findElement(toLocation).click();
	        driver.findElement(tLocation).sendKeys("Del");
	       //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	        Thread.sleep(1000);
	        driver.findElement(tLocation).sendKeys(Keys.ENTER);
	        
	    }
	    
	    public void fromLocation(WebDriver driver) throws InterruptedException {
	        driver.findElement(fromLocation).click();
	        driver.findElement(fLocation).sendKeys("chenn");
	       // driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	        Thread.sleep(1000);
	        driver.findElement(fLocation).sendKeys(Keys.ENTER);
	    }
	   

	    public void departure(WebDriver driver,Properties prop) {
	        driver.findElement(departure).click();
	        driver.findElement(month).click();
	        driver.findElement(month).click();
	        driver.findElement(nextbtn).click();
	        driver.findElement(By.xpath("//div[7]//div[1]//div[3]//div[@data-year='2020']")).click();
	        driver.findElement(By.xpath("//div[@data-month='11']")).click();

	
	
	
	        for(int i = 1 ; i<=35 ; i++) {
	            String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();
	            if(str1.equals("1")) {
	                for(int j = i ; j<=35 ; j++) {
	                    str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();
	                    System.out.println(str1);
	                    if(str1.equals(prop.getProperty("indate"))) {
	                        driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();
	                        return;
	                    }
	                }
	            }
	        }
	    }
	 
	    public void guests(WebDriver driver,Properties prop) throws InterruptedException {
	      
	      //  driver.findElement(By.xpath("//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[1]//div[1]//input[1]")).click();        
	        driver.findElement(madult).click();
	        driver.findElement(mchildren).click();
	        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	        Thread.sleep(1000);
	        driver.findElement(minfant).click();
	    }
	}
