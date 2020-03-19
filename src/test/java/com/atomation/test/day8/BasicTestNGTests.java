package com.atomation.test.day8;

import com.atomation.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicTestNGTests {


    //
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BEFORE SUITE");
    }
    //
    @AfterSuite
    public void afterSuite(){
        System.out.println("AFTER SUITE");
    }


    //
    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORE TEST");
    }
    //
    @AfterTest
    public void afterTest(){
        System.out.println("AFTER TEST");
    }



    //
    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS");
    }
    //
    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS");
    }




    //before method runs before every test automatically
    //work as a pre-condition or setup
    @BeforeMethod
    public void setup(){
        System.out.println("BEFORE METHOD");
    }
    //
    @AfterMethod
    public void tesrDown(){
        System.out.println("AFTER METHOD");
    }




    @Test
    public void test1(){
        System.out.println("TEST 1");
        //Her we dont have the main method and this is what to do to run the unit test
        //By writing @Test on top of the method

        String expected = "apple";
        String actual = "apple";

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test2(){
        System.out.println("TEST 2");
        int num1 = 50;
        int num2 = 10;
        // It calls hard assertion.
        // If assertion fails --- It stops the execution (due to exception)
        Assert.assertTrue(num1 > num2);

    }



}
/*
public class BasicTestNGTests {
    //runs only once before @BeforeClass and @BeforeMethod
    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORE TEST");
    }

    //runs only once after @AfterClass after @AfterMethod
    @AfterTest
    public void afterTest(){
        System.out.println("AFTER TEST");
    }

    //Runs only once in the class before @beforemethod and before any test
    //regardless on number of tests, it runs only once
    @BeforeClass
    public void beforeClass(){
        //something that should be done only once in the class before all tests
        System.out.println("BEFORE CLASS");
    }

    @AfterClass
    public void afterClass(){
        //something that should be done only once in the class after all tests
        System.out.println("AFTER CLASS");
    }

    //runs before every test automatically
    //works as a pre-condition or setup
    @BeforeMethod
    public void setup(){
        System.out.println("BEFORE METHOD");
    }

    //runs automatically after every test
    @AfterMethod
    public void teardown(){
        System.out.println("AFTER METHOD");
    }

    @Test
    public void test1() {
        System.out.println("TEST 1");
        String expected = "apple";
        String actual = "apple";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        System.out.println("TEST 2");
        int num1 = 5;
        int num2 = 10;
        //it calls hard assertion.
        //if assertion fails - it stops the execution (due to exception).
        Assert.assertTrue(num1 < num2);
    }
}
 */
