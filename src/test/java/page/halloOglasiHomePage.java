package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class halloOglasiHomePage extends baseTest {
    public halloOglasiHomePage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy (linkText = "Uloguj se")
    WebElement loginBtn;

    public void loginBtnClik(){
        wdwait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }


}
