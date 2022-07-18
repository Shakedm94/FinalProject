package PageObjects.SWAGLABS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductsMenuPage {

    @FindBy(how = How.XPATH , using = "//*[@class='product_sort_container']")
    public List<WebElement> priceList;

    @FindBy(how = How.XPATH , using = "//*[@id=\"shopping_cart_container\"]/a")
    public List<WebElement> O1name_A_to_Z;


}
