package PageObjects.SWAGLABS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.NAME, using = "user-name")
    public WebElement TextUser;

    @FindBy(how = How.ID, using = "password")
    public WebElement TextPassword ;

    @FindBy(how = How.ID, using = "login-button")
    public WebElement LoginButton ;


}
