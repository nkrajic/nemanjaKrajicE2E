package test;

import base.baseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class halloOglasiE2ETest extends baseTest {

    halloOglasiHomePage HalloOglasiHomePage;
    halloOglasiLoginPage HalloOglasiLoginPage;
    halloOglasiRegistrationPage HalloOglasiRegistrationPage;
    halloOglasiCompleteRegistrationPage HalloOglasiComleteRegistrationPage;
    mailinatorHomePage MailinatorHomePage;
    mailinatorEmailInboxPage MailinatorEmailInboxPage;
    halloOglasiSuccesfullRegistrationPage HalloOglasiSuccesfullRegistrationPage;
    halloOglasiAccountHomePage HalloOglasiAccountHomePage;

    @Before
    public void setUpPage(){
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
        HalloOglasiRegistrationPage.inputUserName("testiranje24");
        HalloOglasiRegistrationPage.inputEmail("testiranje24@mailinator.com");
        HalloOglasiRegistrationPage.inputPassword("12345678");
        HalloOglasiRegistrationPage.inputConfirmPassword("12345678");
        HalloOglasiRegistrationPage.newsletterBox();
        HalloOglasiRegistrationPage.clickRegistrationBnt();
        Assert.assertEquals("Registracija je uspela!\n" +
                "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na" +
                " link u mejlu koji Vam je poslat na : " +
                "testiranje24@mailinator.com !", HalloOglasiComleteRegistrationPage.verifyCompleteRegistrationText());
        driver.get("https://www.mailinator.com/");
        MailinatorHomePage.inputEmailSaerchBox("testiranje24@mailinator.com");
        MailinatorHomePage.pushEnter();
        MailinatorEmailInboxPage.confirmationLink();
        MailinatorEmailInboxPage.frame1();
        MailinatorEmailInboxPage.activationMessageBtn();
        //Assert.assertEquals("Vaš nalog je uspešno aktiviran!", HalloOglasiSuccesfullRegistrationPage.verifyActivatedAccountText());
        HalloOglasiSuccesfullRegistrationPage.loginToAccount();
        HalloOglasiLoginPage.inputEmailOrUsername("testiranje24@mailinator.com");
        HalloOglasiLoginPage.inputLoginPassword("12345678");
        HalloOglasiLoginPage.loginBtnClick();
        Assert.assertEquals("testiranje24", HalloOglasiAccountHomePage.verifyLoginToAccount());











    }


 }
