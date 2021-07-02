package page;

import base.baseTest;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorHomePage extends baseTest {
    public mailinatorHomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".form-control.input-text.h-auto")
    WebElement emailSearchBox;


    public void inputEmailSaerchBox(String email){
        wdwait.until(ExpectedConditions.visibilityOf(emailSearchBox));
        emailSearchBox.clear();
        emailSearchBox.sendKeys(email);
    }

    public void pushEnter(){
        wdwait.until(ExpectedConditions.visibilityOf(emailSearchBox));
        emailSearchBox.sendKeys(Keys.ENTER);
    }


}
