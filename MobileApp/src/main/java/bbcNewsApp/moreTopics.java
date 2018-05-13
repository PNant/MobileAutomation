package bbcNewsApp;

import base.MobileAPI;

public class moreTopics extends MobileAPI {
    public void addWorld() {
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on World
        clickByXpath("//android.widget.TextView[@content-desc=\'Button: World \']");
        //click on + to add World to MyNews
        clickByXpath("//android.widget.TextView[@content-desc=\'Add topic\']");
    }

    public void addAfrica() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc=\'Back\']\n");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on Africa
        clickByXpath("//android.widget.TextView[@content-desc=\'Button: Africa \']");
        //click on + to add Africa to MyNews
        clickByXpath("//android.widget.TextView[@content-desc=\'Add topic\']");
    }

    public void addAsia() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc=\'Back\']");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on Asia
        clickByXpath("//android.widget.TextView[@content-desc=\'Button: Asia \']");
        //click on + to add Asia to MyNews
        clickByXpath("//android.widget.TextView[@content-desc=\'Add topic\']");
    }

    public void addAustralia() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc=\'Back\']");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on Australia
        clickByXpath("//android.widget.TextView[@content-desc=\'Button: Australia \']");
        //click on + to add Australia to MyNews
        clickByXpath("//android.widget.TextView[@content-desc='Add topic']");
    }

    public void addEurope() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc='Back']");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on Europe
        clickByXpath("//android.widget.TextView[@content-desc='Button: Europe ']");
        //click on + to add Europe to MyNews
        clickByXpath("//android.widget.TextView[@content-desc='Add topic']");
    }

    public void addMiddleEast() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc='Back']");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on MiddleEast
        clickByXpath("//android.widget.TextView[@content-desc=\'Button: Middle East \']");
        //click on + to add MiddleEast to MyNews
        clickByXpath("//android.widget.TextView[@content-desc='Add topic']");
    }

    public void addLatinAmerica() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc='Back']");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on LatinAmerica
        clickByXpath("//android.widget.TextView[@content-desc=\'Button: Latin America \']");
        //click on + to add LatinAmerica to MyNews
        clickByXpath("//android.widget.TextView[@content-desc='Add topic']");
    }

    public void addUK() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc='Back']");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on UK
        clickByXpath("//android.widget.TextView[@content-desc=\'Button: UK \']");
        //click on + to add UK to MyNews
        clickByXpath("//android.widget.TextView[@content-desc='Add topic']");
    }

    public void addUSandCanada() {
        //click on back arrow
        clickByXpath("//android.widget.ImageButton[@content-desc='Back']");
        //click on Hamburger
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
        //click on US & Canada
        clickByXpath("//android.widget.TextView[@content-desc='Button: US & Canada ']");
        //click on + to add US & Canada to MyNews
        clickByXpath("//android.widget.TextView[@content-desc='Add topic']");
    }
    // Press the back button
    public static void goBack() {back();}
}

















































