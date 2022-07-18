package PageObjects.SWAGLABS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[1]/div[2]/div")// need to fond the element
    public WebElement LogoHeadPage;

    @FindBy (how = How.XPATH , using = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement MenuTitle;

    @FindBy (how = How.XPATH , using = "//*[@id=\"shopping_cart_container\"]/a")
    public WebElement CarPro_btn;

    //products

    @FindBy (how = How.ID , using = "inventory_container")
    public List<WebElement> productsList;

    @FindBy (how = How.ID , using = "add-to-cart-sauce-labs-backpack")
    public WebElement ProBadAdd_btn;

    @FindBy (how = How.ID , using = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement ProBlackTShirt_btn;

    @FindBy (how = How.ID , using = "add-to-cart-sauce-labs-onesie")
    public WebElement ProRedOnesie_btn;

    @FindBy (how = How.ID , using = "add-to-cart-sauce-labs-bike-light")
    public WebElement ProLight_btn;

    @FindBy (how = How.ID , using = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement ProJacket_btn;

    @FindBy (how = How.ID , using = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement ProRedTShirt_btn;


}
