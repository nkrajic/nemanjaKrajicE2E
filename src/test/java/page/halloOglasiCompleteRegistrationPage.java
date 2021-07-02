package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class halloOglasiCompleteRegistrationPage extends baseTest {
    public halloOglasiCompleteRegistrationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "regsitration-success")
    WebElement registrationCompleteText;

    public String verifyCompleteRegistrationText (){
        wdwait.until(ExpectedConditions.visibilityOf(registrationCompleteText));
        return registrationCompleteText.getText();
    }
}

