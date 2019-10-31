package PHP_TRAVELS.PHP_AUTOMATION;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
	By Dropdown=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By Signup=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
    By myaccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
    WebDriver driver;
    //declaration
    
    public Properties pro() throws IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\r\\chromedriver.exe");//set path of chromedriver
    	ChromeDriver driver =new ChromeDriver();//object for cd
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	this.driver=driver;
    	Properties prop= new Properties();
    	
		FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\phpautomation\\src\\main\\java\\attribute.properties");
		prop.load(fis);
		return prop;
		
    }
    public WebDriver getDriver() {
    	return driver;//use
    	
    }
    
}
