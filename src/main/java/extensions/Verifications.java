package extensions;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {
    //assutr ans that..

    @Step("Verify text in Element")
    public static void verifyTextInElement (WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),expected);
    }

    @Step("Verify Numbers of Products")
    public static void numbersOfProducts(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expected);
    }

    @Step("Verify Visibility of Elements (Soft-Assertion)")
    public static void visibilityOfElements(List<WebElement> elems){
        for (WebElement elem : elems){
            softAssert.assertTrue(elem.isDisplayed(),"sorry" + elem.getText() + "not displayed ");
        }
        softAssert.assertAll("some elements were not displayed");
    }

    @Step("Verify element visually")
    public static void visualElement(String expectedImageName){
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error comparing image file : " + findFailed);
            fail("Error comparing image file : " + findFailed);
        }
    }
}
