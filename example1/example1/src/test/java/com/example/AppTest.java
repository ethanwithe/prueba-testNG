package com.example;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("before suite");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before class");
    }

    @BeforeGroups("user")
    public void BeforeUserGroup(){
        System.out.println("Before User Group");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void testMethod(){
        System.out.println("test method");
        Assert.assertEquals(1, 1);
    }

    @Test(groups = {"user"})
    public void testUsername(){
        System.out.println("test username"); 
    }

    @Test(groups = {"user"})
    public void testUserRole(){
        System.out.println("test user role"); 
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after Method");
    }

    @AfterGroups("user")
    public void afterUserGroup(){
        System.out.println("After user Group");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
    }
     
    
  
}
