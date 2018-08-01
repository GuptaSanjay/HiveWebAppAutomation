package Test;


import Page.LogoutPage;


public class LogoutTest {

    LogoutPage logoutPage=new LogoutPage();


    public void checkAlreadyLoggedIn() {
        System.out.println("inside Test");
        logoutPage.checkAlreadyLoggedIn();
    }

    public void clickLogoutButton() {


        logoutPage.clickLogoutButton();
    }

    public void loggedoutSuccessfully() {

        logoutPage.loggedoutSuccessfully();
    }
}
