package Test.MavenProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.net.MalformedURLException;



public class Unittest {
	
	@BeforeTest
    void BeforeTest() throws MalformedURLException {
        System.out.println("This is before test class");
    }
    @Test
    void TestcaseValidation1() {
    	String name = "saidinesh";
    	AssertJUnit.assertTrue(name.contains("sai"));
    	System.out.println("Test case Validation1");
    }
    @Test
    void TestcaseValidation2() {
    	String name2 = "dinesh";
    	AssertJUnit.assertTrue(name2.equalsIgnoreCase("DINESH"));
    	System.out.println("Test case Validation2");
    }
 
    @AfterTest
    void teardown() {
    	System.out.println("This is After test class");
        
    }
}
