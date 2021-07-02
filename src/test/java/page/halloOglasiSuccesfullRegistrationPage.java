package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class halloOglasiSuccesfullRegistrationPage extends baseTest {
    public halloOglasiSuccesfullRegistrationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//span[contains(text(),\"Vaš nalog je uspešno aktiviran!\")]")
    WebElement registrationActivated;

    @FindBy (linkText = "Uloguj se")
    WebElement loginLink;




    public String verifyActivatedAccountText(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationActivated));
        return registrationActivated.getText();
    }
    public void loginToAccount(){
        wdwait.until(ExpectedConditions.visibilityOf(loginLink));
        loginLink.click();
    }




}
