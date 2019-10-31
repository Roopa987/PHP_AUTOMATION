package PHP_TRAVELS.PHP_AUTOMATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	//registration page
	
	By submit =By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
    By  myaccount = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
    By signup = By.xpath("//a[@class='dropdown-item tr']");
    By Firstname = By.xpath("//input[@placeholder='First Name']");
    By Lastname=By.xpath("//input[@placeholder='Last Name']");
    By mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
    By Email=By.xpath("//input[@placeholder='Email']");
    By password=By.xpath("//input[@placeholder='Password']");
    By confirm=By.xpath("//input[@placeholder='Confirm Password']");
    //login page
    By login= By.xpath("//a[@class='dropdown-item active tr']");
    By Email1=By.xpath("//input[@placeholder='Email']");
   By password1=By.xpath("//input[@placeholder='Password']");
    By login1= By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
    WebDriver driver;
    		
    public base() {
    	System.setProperty("webdriver.chrome.driver","C:\\r\\chromedriver.exe");
    	WebDriver  driver =new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	this.driver=driver;
    }
    public WebDriver getDriver() {
    	return driver;
    	}
	

	
	

}
