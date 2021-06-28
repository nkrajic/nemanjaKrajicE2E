package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class halloOglasiRegistrationPage extends baseTest {
    public halloOglasiRegistrationPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//span[contains(text(),\"Fizičkog lica\")]")
    WebElement radioBntFL;
    @FindBy (xpath = "//input[@id='UserName']")
    WebElement userNameField;
    @FindBy (xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy (xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy (xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassField;
    @FindBy (id = "AllowSendingNewsletters")
    WebElement chBoxNewsletters;
    @FindBy (css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrationBtn;

    public void clickRadioBtn () {
        wdwait.until(ExpectedConditions.visibilityOf(radioBntFL));
        if (radioBntFL.isSelected()) {
            radioBntFL.click();
        }
    }
    public void inputUserName(String username){
        wdwait.until(ExpectedConditions.visibilityOf(userNameField));
        userNameField.clear();
        userNameField.sendKeys(username);
    }
    public void inputEmail(String email){
        wdwait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void inputPassword(String password){
        wdwait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void inputConfirmPassword(String confirmpassword){
        wdwait.until(ExpectedConditions.visibilityOf(confirmPassField));
        confirmPassField.clear();
        confirmPassField.sendKeys(confirmpassword);
    }
    public void newsletterBox(){
        wdwait.until(ExpectedConditions.visibilityOf(chBoxNewsletters));
        if (chBoxNewsletters.isSelected()){
            chBoxNewsletters.click();
        }
    }
    public void clickRegistrationBnt(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationBtn));
        registrationBtn.click();
    }

}
