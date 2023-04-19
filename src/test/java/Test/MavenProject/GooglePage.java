package Test.MavenProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {
	public WebDriver driver;
	@BeforeTest
    void WebDriversetup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
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