package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class SwagladsWeb extends CommonOps {

   // @Test
   // public void test01_verifyLogo(){
      //  WedFlows.login("standard_user","secret_sauce");
      //  Verifications.verifyTextInElement( SwaglabsMain.LogoHeadPage,"SWAGLAB");// need to fix the element picther mode}

    @Test (description = "Test01 - Verify login")
    @Description("This Test Verifies login")
    public void test01_login(){
        WebFlows.login("standard_user","secret_sauce");
      //Verifications.verifyTextInElement(SwaglabsMain.MenuTitle, "PRODUCTS"); need to check
    }

    @Test(description = "Test02 - Verify Menu Title")
    @Description("this Test Verify Menu Title ")
    public void test02_menuTitle(){
        Verifications.verifyTextInElement(SwaglabsMain.MenuTitle, "PRODUCT//s"); //fail

    }

    @Test(description = "Test03 - Verify products Car")
    @Description("This Test login and Verifies Car Products")
    public void test03_carProducts(){
        WebFlows.carProducts(SwaglabsMain.ProBadAdd_btn, SwaglabsMain.ProJacket_btn,SwaglabsMain.ProLight_btn);
        Verifications.numbersOfProducts(SwaglabsCarProducts.productsList, 3);
    }

    @Test(description = "Test04 - Send Text = Information Details")
    @Description("This Test send Text to Information Details")
    public void test04_InformationDetails(){
        WebFlows.information("shaked","mini","123456");

    }

    @Test(description = "Test05 - Verify Products Visibility")
    @Description("this Test Verify Visibility of Products")
    public void test05_verifyProducts(){
        Verifications.visibilityOfElements(SwaglabsMain.productsList);

    }

    @Test(description = "Test06 - Verify LOGO image")
    @Description("this Test Verify LOGO Image visual using sikuli tool")
    public void test06_verifyLOGO() {
        Verifications.visualElement("Logo");
    }

}
