package com.wangxiang.shayne_selenium;

import org.openqa.selenium.WebDriver;

import com.wangxiang.shayne_selenium.webdriver.InitWebDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        WebDriver driver=InitWebDriver.init("ie");
        driver.get("http://www.baidu.com");
    }
}
