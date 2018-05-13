package testBBCNewsApp;

import bbcNewsApp.moreTopics;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public abstract class testMoreTopics extends moreTopics {
    /*@BeforeMethod
    public abstract void setUp();*/

    @Test(priority = 1)
    public static void AddWorld(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("World"));
    }

    @Test(priority = 2)
    public static void AddAfrica(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("Africa"));
    }

    @Test(priority = 3)
    public static void AddAsia(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("Asia"));
    }

    @Test(priority = 4)
    public static void AddAustralia(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("Australia"));
    }

    @Test(priority = 5)
    public static void AddEurope(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("Europe"));
    }

    @Test(priority = 6)
    public static void AddMiddleEast(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("Middle East"));
    }

    @Test(priority = 7)
    public static void AddLatinAmerica(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("Latin America & Caribbean"));
    }

    @Test(priority = 8)
    public static void AddUK(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("UK"));
    }

    @Test(priority = 9)
    public static void AddUSandCanada(){
        for_text(1);
        Assert.assertTrue(Boolean.parseBoolean("US & Canada"));
    }

    @Test(dependsOnMethods = "AddUSandCanada")
    public static void goBack() {back();}
}


