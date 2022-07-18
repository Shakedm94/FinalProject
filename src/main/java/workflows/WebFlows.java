package workflows;


import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;



public class WebFlows extends CommonOps {

    @Step("Business Flow : Login")
    public static void login (String user, String pass){
        UIActions.updateText(SwaglabsLogin.TextUser,user);
        UIActions.updateText(SwaglabsLogin.TextPassword,pass);
        UIActions.click(SwaglabsLogin.LoginButton);
    }

    @Step("Business Flow :")
    public static void carProducts (WebElement elem01,WebElement elem02,WebElement elem03){
        UIActions.click(elem01);
        UIActions.click(elem02);
        UIActions.click(elem03);
        UIActions.click(SwaglabsMain.CarPro_btn);

    }

    @Step("Business Flow : Information details + Text")
    public static void information (String firstName , String lastName, String zip_code){
        UIActions.click(SwaglabsMain.CarPro_btn);
        UIActions.click(SwaglabsCarProducts.checkout_btn);
        UIActions.updateText(SwaglabsInformation.FirstName_txt,firstName);
        UIActions.updateText(SwaglabsInformation.LastName_txt,lastName);
        UIActions.updateText(SwaglabsInformation.ZipCode_txt,zip_code);
        UIActions.click(SwaglabsInformation.Continue_btn);





    }
}
