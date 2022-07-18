package PageObjects.SWAGLABS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMenuPage {
    @FindBy(how = How.ID, using = "inventory_sidebar_link")
    public WebElement btn_allItems;
    @FindBy(how = How.ID, using = "about_sidebar_link")
    public WebElement btn_about;
    @FindBy(how = How.ID, using = "logout_sidebar_link")
    public WebElement btn_logout;
    @FindBy(how = How.ID, using = "reset_sidebar_link")
    public WebElement btn_resetAppState;
    @FindBy(how = How.ID, using = "react-burger-cross-btn")
    public WebElement closeBtn;
}
