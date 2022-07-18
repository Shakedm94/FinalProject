package utilities;

import PageObjects.SWAGLABS.* ;
import PageObjects.mortgage.* ;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

public class Base {
    //General

    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;

    //Web
    protected static WebDriver driver;

    //Mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();


    //page Objects - Web
    protected static LoginPage SwaglabsLogin;
    protected static PageObjects.SWAGLABS.MainPage SwaglabsMain;
    protected static LeftMenuPage SwaglabsLeftMenu;
    protected static ProductsMenuPage SwaglabsProductsMenu;
    protected static CarProductsPage SwaglabsCarProducts;
    protected static InformationPage SwaglabsInformation;
    protected static OverViewPage SwaglabsOverView;

    // Page Object - Mobile
    protected static PageObjects.mortgage.MainPage mortgageMine;



}
