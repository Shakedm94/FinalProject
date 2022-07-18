package PageObjects.SWAGLABS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CarProductsPage {

    @FindBy(how = How.ID , using = "checkout")
    public WebElement checkout_btn;

    @FindBy(how = How.XPATH , using = "//*[@class='cart_item']")
    public List<WebElement> productsList;



}
