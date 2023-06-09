package Test.MavenProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {
	
	public static RemoteWebDriver driver=null;
	@BeforeTest
    void WebDriversetup() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless");
        URL u =new URL("http://localhost:4444/wd/hub");
        driver = new RemoteWebDriver (u,options);
    }
    @Test
    void GoogleTitleValidation() {
    	driver.get("https://google.com");
    	Assert.assertEquals(driver.getTitle(), "Google");
    }
 
    @AfterTest
    void teardown() {
       // Close the driver
        driver.quit();
    }
}
