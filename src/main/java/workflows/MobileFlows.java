package workflows;

import extensions.MobileActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class MobileFlows extends CommonOps {

    @Step("Business Flow : fill form and calculate mortgage")
    public static void CalculateMortgage(String amount, String term, String rate){
        MobileActions.updateText(mortgageMine.txt_amount, amount);
        MobileActions.updateText(mortgageMine.txt_term, term);
        MobileActions.updateText(mortgageMine.txt_rate, rate);
        MobileActions.tap(1,mortgageMine.btn_Calculate,500);

    }
}
