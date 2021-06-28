package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class halloOglasiLoginPage extends baseTest {
    public halloOglasiLoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "no-account-reg-link")
    WebElement registrationLink;

    @FindBy (id = "EMailOrUsername")
    WebElement emailOrUsername;

    @FindBy (css = ".form-control.enter-login")
    WebElement loginPassword;

    @FindBy (css = ".btn-main.login-button.login-user")
    WebElement loginBtn;

    public void registrationLinkClick(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationLink));
        registrationLink.click();
    }
    public void inputEmailOrUsername(String emailouser){
        wdwait.until(ExpectedConditions.visibilityOf(emailOrUsername));
        emailOrUsername.clear();
        emailOrUsername.sendKeys(emailouser);
    }

    public void inputLoginPassword(String password){
        wdwait.until(ExpectedConditions.visibilityOf(loginPassword));
        loginPassword.clear();
        loginPassword.sendKeys(password);
    }

    public void loginBtnClick(){
        wdwait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }





}
