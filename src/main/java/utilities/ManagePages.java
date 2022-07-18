package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    public static void initSwaglabs(){
        SwaglabsLogin = PageFactory.initElements(driver, PageObjects.SWAGLABS.LoginPage.class);
        SwaglabsMain = PageFactory.initElements(driver, PageObjects.SWAGLABS.MainPage.class);
        SwaglabsLeftMenu = PageFactory.initElements(driver, PageObjects.SWAGLABS.LeftMenuPage.class);;
        SwaglabsProductsMenu = PageFactory.initElements(driver, PageObjects.SWAGLABS.ProductsMenuPage.class);
        SwaglabsCarProducts = PageFactory.initElements(driver, PageObjects.SWAGLABS.CarProductsPage.class);
        SwaglabsInformation = PageFactory.initElements(driver, PageObjects.SWAGLABS.InformationPage.class);
        SwaglabsOverView = PageFactory.initElements(driver, PageObjects.SWAGLABS.OverViewPage.class);

    }

    public static void initMortgage(){
        mortgageMine = new PageObjects.mortgage.MainPage(mobileDriver);
    }
}
