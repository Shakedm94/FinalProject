package PageObjects.SWAGLABS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OverViewPage {

    @FindBy(how = How.ID , using = "finish")
    public WebElement Finish_btn;

    @FindBy(how = How.ID , using = "cancel")
    public WebElement Cancel_btn;
}
