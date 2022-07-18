package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {
    //מחלקה שבא אכתוב את כל המתודות שאשמש בהן בעצם "אעטוף" פונקציות שקיימות בסלניום ואם ארצה אוסיף להן דברים

    @Step("Click on Element")
    public static void click(WebElement elem){
     //   wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Update Text Element")
    public static void updateText(WebElement elem , String text){
       // wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @Step("update text element as human")
    public static void updateTextHuman(WebElement elem , String text){
        wait.until((ExpectedConditions.visibilityOf(elem)));
        for (char ch : text.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(500,TimeUnit.MILLISECONDS);
            elem.sendKeys(ch + "");
        }
    }

    @Step("Update Drop Down")
    public static void updateDropDown(WebElement elem, String text){
      //  wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }


    // וכו,
}
