package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.MobileFlows;
import workflows.WebFlows;

public class MortgageMobile extends CommonOps {

    @Test(description = "Test01 - Verify Mortgage")
    @Description("This Test Verifies login fill in mortgage fields and calculate repayment")
    public void test01Mortgage(){
        MobileFlows.CalculateMortgage("1000","3","4");
        Verifications.verifyTextInElement(mortgageMine.txt_Repayment,"£30.03");


    }
}
