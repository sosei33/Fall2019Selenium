package com.atomation.test.day8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestPractice {
    public static void main(String[] args) {

        //REVERSING A STRING

        //STEP NUMBER 1
        //UNIT TESTING
        //To check if our method works properly
        //If assertion fails, that means our method doesn't work correctly
        //that means we have fix the method
        String expected = "cba";
        String toReverse = "abc";
        String actual = reverseString(toReverse);
        //Assertion
        verifyEquals(expected, actual);


        //NOTE :
        //STEP NUMBER 4 (UNIT TESTING)
        // REMEMBER: Before doing this we have to DOWNLOAD  TestNG from MVNRepository and out it under
        // the pom.xml
        //This is doing UNIT TESTING on the REVERSE METHOD
        // After downloading the TestNG from MVNRepository then we create a
        // METHOD under the main method called @Test (test annotation to run our test
    }
    //annotation
    // we can also put parenthesis in front the @Test then give a description of the test
    // as shown below. Note: you can do with or without the parenthesis
    // we can also put more things in the test method
    @Test(description = "Verify if method can reverse a string")
    public void test(){
        //Instead of the if statement below we can you assertion below
        String expected = "elppa";
        String actual = reverseString("apple");
        //To verify if expexted result is equals to actual
        //we use the assert method show below
        Assert.assertEquals(actual, expected);
    }
  @Test(description = "Verify if method can reverse a string ")
  public void test2(){
        String expected = "rac";
        String  actual = reverseString("car");
        Assert.assertEquals(actual, expected);
  }

    //STEP NUMBER 3
    //Checking
    public static boolean verifyEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("TEST PASSED");
            return true;
        } else {
            System.out.println("Test failed!!!");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            return false;
        }
    }

    //STEP NUMBER 3
    /**
     * This method stands for reversing strings.
     *
     * @param str to reverse
     * @return reversed string
     */
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

