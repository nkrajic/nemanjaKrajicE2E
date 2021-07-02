package test;

import base.baseTest;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import page.*;

import java.util.Random;

public class halloOglasiE2ETest extends baseTest {

    halloOglasiHomePage HalloOglasiHomePage;
    halloOglasiLoginPage HalloOglasiLoginPage;
    halloOglasiRegistrationPage HalloOglasiRegistrationPage;
    halloOglasiCompleteRegistrationPage HalloOglasiComleteRegistrationPage;
    mailinatorHomePage MailinatorHomePage;
    mailinatorEmailInboxPage MailinatorEmailInboxPage;
    halloOglasiSuccesfullRegistrationPage HalloOglasiSuccesfullRegistrationPage;
    halloOglasiAccountHomePage HalloOglasiAccountHomePage;
    Random ran = new Random();
    int x = ran.nextInt(999999);
    String ime = "testiranje" + x;
    String mailinatorDomen = "@mailinator.com";
    String lozinka ="1234567";

    @Before
    public void setUpTest(){
        HalloOglasiHomePage = new halloOglasiHomePage();
        HalloOglasiLoginPage = new halloOglasiLoginPage();
        HalloOglasiRegistrationPage = new halloOglasiRegistrationPage();
        HalloOglasiComleteRegistrationPage = new halloOglasiCompleteRegistrationPage();
        MailinatorHomePage = new mailinatorHomePage();
        MailinatorEmailInboxPage = new mailinatorEmailInboxPage();
        HalloOglasiSuccesfullRegistrationPage = new halloOglasiSuccesfullRegistrationPage();
        HalloOglasiAccountHomePage = new halloOglasiAccountHomePage();

    }

    @Test
    public void E2ETest(){
        HalloOglasiHomePage.loginBtnClik();
        HalloOglasiLoginPage.registrationLinkClick();
        HalloOglasiRegistrationPage.clickRadioBtn();
        HalloOglasiRegistrationPage.inputUserName(ime);
        HalloOglasiRegistrationPage.inputEmail(ime + mailinatorDomen);
        HalloOglasiRegistrationPage.inputPassword(lozinka);
        HalloOglasiRegistrationPage.inputConfirmPassword(lozinka);
        HalloOglasiRegistrationPage.newsletterBox();
        HalloOglasiRegistrationPage.clickRegistrationBnt();
        assertEquals("Registracija je uspela!\n" +
                "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na" +
                " link u mejlu koji Vam je poslat na : " +
                 ime + mailinatorDomen +" !", HalloOglasiComleteRegistrationPage.verifyCompleteRegistrationText());
        driver.get("https://www.mailinator.com/");
        MailinatorHomePage.inputEmailSaerchBox(ime + mailinatorDomen);
        MailinatorHomePage.pushEnter();
        MailinatorEmailInboxPage.confirmationLink();
        MailinatorEmailInboxPage.frame1();
        MailinatorEmailInboxPage.activationMessageBtn();
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        assertEquals("Vaš nalog je uspešno aktiviran!", HalloOglasiSuccesfullRegistrationPage.verifyActivatedAccountText());
        HalloOglasiSuccesfullRegistrationPage.loginToAccount();
        HalloOglasiLoginPage.inputEmailOrUsername(ime + mailinatorDomen);
        HalloOglasiLoginPage.inputLoginPassword(lozinka);
        HalloOglasiLoginPage.loginBtnClick();
        assertEquals(ime , HalloOglasiAccountHomePage.verifyLoginToAccount());











    }


 }
