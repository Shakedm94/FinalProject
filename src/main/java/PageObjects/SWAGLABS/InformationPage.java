package PageObjects.SWAGLABS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InformationPage {

    @FindBy(how = How.ID, using = "first-name")
    public WebElement FirstName_txt;

    @FindBy(how = How.ID, using = "last-name")
    public WebElement LastName_txt;

    @FindBy(how = How.ID, using = "postal-code")
    public WebElement ZipCode_txt;

    @FindBy(how = How.ID, using = "continue")
    public WebElement Continue_btn;


}
