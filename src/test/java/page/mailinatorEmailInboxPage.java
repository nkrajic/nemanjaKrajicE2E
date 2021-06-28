package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorEmailInboxPage extends baseTest {
    public mailinatorEmailInboxPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "html_msg_body")
    WebElement swichFrame1;

    @FindBy (xpath = "//td[contains(text(),\"Molimo aktivirajte Vaš Halo oglasi   nalog\")]")
    WebElement messageHalloOglasiConfirmRegistration;

    @FindBy (xpath = "//strong[contains(text(),\"Aktiviraj nalog\")]")
    WebElement activateAccountBtn;

    public void frame1(){
        wdwait.until(ExpectedConditions.visibilityOf(swichFrame1));
        driver.switchTo().frame(swichFrame1);
    }

    public void confirmationLink(){
        wdwait.until(ExpectedConditions.visibilityOf(messageHalloOglasiConfirmRegistration));
        messageHalloOglasiConfirmRegistration.click();
    }

    public void activationMessageBtn(){
        wdwait.until(ExpectedConditions.visibilityOf(activateAccountBtn));
        activateAccountBtn.click();
    }



}
