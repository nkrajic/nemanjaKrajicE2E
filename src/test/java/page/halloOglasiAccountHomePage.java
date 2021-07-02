package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class halloOglasiAccountHomePage extends baseTest {
    public halloOglasiAccountHomePage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy (css = ".header-user-name.hidden-xs")
    WebElement headerLabelAccountName;



    public String verifyLoginToAccount(){
        wdwait.until(ExpectedConditions.visibilityOf(headerLabelAccountName));
        return headerLabelAccountName.getText();
    }


}
