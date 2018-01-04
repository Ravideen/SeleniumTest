package Guru9.gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    //extends TestCase
{
	 WebDriver driver;
    
	@Test    
    public void executSessionOne(){
            //First session of WebDriver
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver2_30.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
	
	
	
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
   // public AppTest( String testName )
   // {
       // super( testName );
   // }

    /**
     * @return the suite of tests being tested
     */
   // public static Test suite()
   // {
   //     return new TestSuite( AppTest.class );
    //}

    /**
     * Rigourous Test :-)
     */
   // public void testApp()
   // {
   //     assertTrue( true );
   // }
}
